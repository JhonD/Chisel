package de.ubt.ai7.csv_validator.library.dataStructures;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 *
 * immutable class storing one run when evaluating an automaton
 * stores additional information for each transition successfully performed
 */
public final class EvaluationHistory {
	public static final int DEFAULT_CAPACITY = 10;

	protected int iteration;
	protected int size;
	protected EvaluationHistoryRecord[] elementData;

	@SuppressWarnings("unchecked")
	public EvaluationHistory(final EvaluationHistory other){
		elementData = Arrays.copyOf(other.elementData, other.elementData.length);
		iteration = other.iteration;
		size = other.size;
	}

	public EvaluationHistory(){
		elementData = new EvaluationHistoryRecord[DEFAULT_CAPACITY];
		iteration = 0;
		size = 0;
	}

	public EvaluationHistory(final int initialCapacity){
		elementData = new EvaluationHistoryRecord[initialCapacity];
		iteration = 0;
		size = 0;
	}

	public void ensureCapacity(final int minCapacity) {
		if(minCapacity - elementData.length > 0 && minCapacity > 0) {
			grow(minCapacity);
		}
	}




	public void set(final int index, final EvaluationHistoryRecord element){

		ensureCapacity(index + 1);

		elementData[index] = element;
		size = Math.max(size, index + 1);

	}

	public EvaluationHistoryRecord get(final int index){
		if(index >= size || index < 0) {
			return null;
		}
		return elementData[index];
	}

	public EvaluationHistoryRecord getLast(){
		if(size == 0) {
			return null;
		}
		return elementData[size - 1];
	}


	public int getIteration(){
		return iteration;

	}

	public void nextIteration(){
		iteration += 1;
	}

	public int size(){
		return size;
	}

	/*
	 * methods copied form {@link java.util.ArrayList}
	 */

	public final ListIterator<EvaluationHistoryRecord> iterator(){
		return new ListItr(0);
	}

	public static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

	/**
	 * Increases the capacity to ensure that it can hold at least the
	 * number of elements specified by the minimum capacity argument.
	 *
	 * @param minCapacity the desired minimum capacity
	 */

	protected void grow(final int minCapacity) {
		// overflow-conscious code
		final int oldCapacity = elementData.length;
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		if (newCapacity - minCapacity < 0) {
			newCapacity = minCapacity;
		}
		if (newCapacity - MAX_ARRAY_SIZE > 0) {
			newCapacity = hugeCapacity(minCapacity);
		}
		// minCapacity is usually close to size, so this is a win:
		elementData = Arrays.copyOf(elementData, newCapacity);
	}


	protected static int hugeCapacity(final int minCapacity) {
		if (minCapacity < 0) {
			throw new OutOfMemoryError();
		}
		return (minCapacity > MAX_ARRAY_SIZE) ?
				Integer.MAX_VALUE :
					MAX_ARRAY_SIZE;
	}


	/**
	 * An optimized version of AbstractList.Itr
	 */
	private class Itr implements Iterator<EvaluationHistoryRecord> {
		int cursor;       // index of next element to return
		int lastRet = -1; // index of last element returned; -1 if no such

		@Override
		public boolean hasNext() {
			return cursor != size;
		}

		@Override
		@SuppressWarnings("unchecked")
		public EvaluationHistoryRecord next() {
			final int i = cursor;
			if (i >= size) {
				throw new NoSuchElementException();
			}
			final EvaluationHistoryRecord[] elementData = EvaluationHistory.this.elementData;
			if (i >= elementData.length) {
				throw new ConcurrentModificationException();
			}
			cursor = i + 1;
			return elementData[lastRet = i];
		}

	}

	/**
	 * An optimized version of AbstractList.ListItr
	 */
	private class ListItr extends Itr implements ListIterator<EvaluationHistoryRecord> {
		ListItr(final int index) {
			super();
			cursor = index;
		}

		@Override
		public boolean hasPrevious() {
			return cursor != 0;
		}

		@Override
		public int nextIndex() {
			return cursor;
		}

		@Override
		public int previousIndex() {
			return cursor - 1;
		}

		@Override
		@SuppressWarnings("unchecked")
		public EvaluationHistoryRecord previous() {
			final int i = cursor - 1;
			if (i < 0) {
				throw new NoSuchElementException();
			}
			final EvaluationHistoryRecord[] elementData = EvaluationHistory.this.elementData;
			if (i >= elementData.length) {
				throw new ConcurrentModificationException();
			}
			cursor = i;
			return  elementData[lastRet = i];
		}

		@Override
		public void set(final EvaluationHistoryRecord e) {
			if (lastRet < 0) {
				throw new IllegalStateException();
			}

			try {
				EvaluationHistory.this.set(lastRet, e);
			} catch (final IndexOutOfBoundsException ex) {
				throw new ConcurrentModificationException();
			}
		}

		@Override
		public void add(final EvaluationHistoryRecord e) {
			throw new UnsupportedOperationException();

		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

}
