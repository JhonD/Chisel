package de.ubt.ai7.csv_validator.library;

import org.eclipse.xtext.ui.editor.XtextEditor;

import de.ubt.ai7.csv_validator.library.impl.SculptApiImpl;
public interface SculptApi extends CommonApi{
	SculptApi INSTANCE = SculptApiImpl.INSTANCE;

	public static final String SCHEMA_NOT_REGISTERED = "The schema you selected is not loaded yet! Please load the Schema first.";

	/**
	 * Delete all caches
	 * @param sculptEditor editor to clear the caches from.
	 */
	public void clearCaches(XtextEditor sculptEditor);

	/**
	 * Register a schema file in the main api. Stores the model, the user is currently interested in.
	 * @param sculptEditor the schema file to register
	 * @param selectedRelation the number of the relation selected in the relation View
	 */
	@Override
	public void registerSchema(XtextEditor sculptEditor, int selectedRelation);

	/**
	 * Validate the given Schema against a registered csv file
	 * @param the schema to validate
	 */
	public void validateSculptSchema(XtextEditor sculptEditor);

}
