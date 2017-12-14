package de.ubt.ai7.csv_validator.util;

import java.util.Iterator;

public class IterableConcat {
	//Copied from 
	//http://stackoverflow.com/questions/4896662/combine-multiple-collections-into-a-single-logical-collection
	public static <E> Iterable<E> concat(final Iterable<? extends E> iterable1, final Iterable<? extends E> iterable2) {
		return new Iterable<E>() {
			@Override
			public Iterator<E> iterator() {
				return new Iterator<E>() {
					final Iterator<? extends E> iterator1 = iterable1.iterator();
					final Iterator<? extends E> iterator2 = iterable2.iterator();

					@Override
					public boolean hasNext() {
						return iterator1.hasNext() || iterator2.hasNext();
					}

					@Override
					public E next() {
						return iterator1.hasNext() ? iterator1.next() : iterator2.next();
					}
				};
			}
		};
	}
}
