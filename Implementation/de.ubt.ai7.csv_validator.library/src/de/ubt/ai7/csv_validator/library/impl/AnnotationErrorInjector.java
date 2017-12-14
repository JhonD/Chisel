package de.ubt.ai7.csv_validator.library.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolution;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider;
import org.eclipse.xtext.ui.editor.validation.AnnotationIssueProcessor;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.DiagnosticConverterImpl;
import org.eclipse.xtext.validation.FeatureBasedDiagnostic;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import de.ubt.ai7.csv_validator.library.exceptions.SchemaValidationException;

/**
 *
 *
 *
 *         Hack to create annotations on the editor after the actual validation
 *         is over
 *
 */
public class AnnotationErrorInjector {

	/**
	 * dummy class for quick fixes
	 */
	private final IssueResolutionProvider issueResolutionProvider = new IssueResolutionProvider() {

		@Override
		public boolean hasResolutionFor(final String issueCode) {
			return false;
		}

		@Override
		public List<IssueResolution> getResolutions(final Issue issue) {
			return null;
		}

	};

	/**
	 * dummy class for monitoring normally used to interact with threads in
	 * thread pools
	 */
	private final IProgressMonitor defaultProgressMonitor = new IProgressMonitor() {

		@Override
		public void beginTask(final String name, final int totalWork) {
		}

		@Override
		public void done() {
		}

		@Override
		public void internalWorked(final double work) {
		}

		@Override
		public boolean isCanceled() {
			return false;
		}

		@Override
		public void setCanceled(final boolean value) {
		}

		@Override
		public void setTaskName(final String name) {
		}

		@Override
		public void subTask(final String name) {
		}

		@Override
		public void worked(final int work) {
		}
	};

	/**
	 *
	 *  wraps a list to use it in
	 *         {@link org.eclipse.xtext.validation.DiagnosticConverterImpl}
	 *
	 */
	protected static class ListBasedMarkerAcceptor implements IAcceptor<Issue> {
		private final List<Issue> result;

		protected ListBasedMarkerAcceptor(final List<Issue> result) {
			this.result = result;
		}

		@Override
		public void accept(final Issue issue) {
			if (issue != null) {
				result.add(issue);
			}
		}
	}

	private final XtextEditor editor;

	public AnnotationErrorInjector(final XtextEditor editor) {
		this.editor = editor;
	}

	/**
	 *
	 * @param e exception to be transformed into Diagnostic
	 */
	public Diagnostic createDiagnostic(final SchemaValidationException e) {
		if (e == null || e.getSource() == null) {
			return new BasicDiagnostic();
		}

		EObject source = e.getSource();
		EStructuralFeature feature = e.getFeature();
		if (feature == null && source.eContainer() != null && source.eContainmentFeature() != null) {
			feature = source.eContainmentFeature();
			source = source.eContainer();
		}

		return error(e.getLocalizedMessage(), source, feature, e.getIndex());
	}

	/**
	 * creates error markers in the editor for each error in diagnostic
	 */
	public void injectErrors(final Diagnostic diagnostic) {
		final List<Issue> issues = new ArrayList<Issue>();
		final IAcceptor<Issue> acceptor = new ListBasedMarkerAcceptor(issues);
		final DiagnosticConverterImpl converter = new DiagnosticConverterImpl();

		for (final Diagnostic childDiagnostic : diagnostic.getChildren()) {
			converter.convertValidatorDiagnostic(childDiagnostic, acceptor);
		}

		final AnnotationIssueProcessor issueProcessor = new AnnotationIssueProcessor(editor.getDocument(),
				editor.getInternalSourceViewer().getAnnotationModel(), issueResolutionProvider);
		issueProcessor.processIssues(issues, defaultProgressMonitor);
	}

	/*
	 * the following methods are copied from {@link
	 * org.eclipse.xtext.validation.AbstractDeclarativeValidator} and slightly
	 * modified
	 */
	protected Diagnostic error(final String message, final EObject object, final EStructuralFeature feature) {
		return error(message, object, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, null);
	}

	protected Diagnostic error(final String message, final EObject object, final EStructuralFeature feature, final int index) {
		return error(message, object, feature, index, null);
	}

	protected Diagnostic error(final String message, final EObject object, final EStructuralFeature feature, final String code,
			final String... issueData) {
		return error(message, object, feature, ValidationMessageAcceptor.INSIGNIFICANT_INDEX, code, issueData);
	}

	protected Diagnostic error(final String message, final EObject source, final EStructuralFeature feature, final int index, final String code,
			final String... issueData) {
		return acceptError(message, source, feature, index, code, issueData);
	}

	protected Diagnostic acceptError(final String message, final EObject object, final EStructuralFeature feature, final int index, final String code,
			final String... issueData) {
		return createDiagnostic(Severity.ERROR, message, object, feature, index, code, issueData);
	}

	protected Diagnostic createDiagnostic(final Severity severity, final String message, final EObject object, final EStructuralFeature feature,
			final int index, final String code, final String... issueData) {
		final int diagnosticSeverity = toDiagnosticSeverity(severity);
		final Diagnostic result = new FeatureBasedDiagnostic(diagnosticSeverity, message, object, feature, index,
				CheckType.EXPENSIVE, code, issueData);
		return result;
	}

	protected int toDiagnosticSeverity(final Severity severity) {
		int diagnosticSeverity = -1;
		switch (severity) {
		case ERROR:
			diagnosticSeverity = Diagnostic.ERROR;
			break;
		case WARNING:
			diagnosticSeverity = Diagnostic.WARNING;
			break;
		case INFO:
			diagnosticSeverity = Diagnostic.INFO;
			break;
		default:
			throw new IllegalArgumentException("Unknow severity " + severity);
		}
		return diagnosticSeverity;
	}

}
