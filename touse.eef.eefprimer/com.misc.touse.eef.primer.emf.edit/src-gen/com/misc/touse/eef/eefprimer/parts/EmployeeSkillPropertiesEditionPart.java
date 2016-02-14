/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface EmployeeSkillPropertiesEditionPart {

	/**
	 * @return the Level
	 * 
	 */
	public String getLevel();

	/**
	 * Defines a new Level
	 * @param newValue the new Level to set
	 * 
	 */
	public void setLevel(String newValue);


	/**
	 * @return the Skill
	 * 
	 */
	public EObject getSkill();

	/**
	 * Init the Skill
	 * @param settings the combo setting
	 */
	public void initSkill(EObjectFlatComboSettings settings);

	/**
	 * Defines a new Skill
	 * @param newValue the new Skill to set
	 * 
	 */
	public void setSkill(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSkillButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the Skill edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSkill(ViewerFilter filter);

	/**
	 * Adds the given filter to the Skill edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSkill(ViewerFilter filter);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
