/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface EmployeePropertiesEditionPart {

	/**
	 * @return the Name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new Name
	 * @param newValue the new Name to set
	 * 
	 */
	public void setName(String newValue);




	/**
	 * Init the MasteredSkills
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initMasteredSkills(ReferencesTableSettings settings);

	/**
	 * Update the MasteredSkills
	 * @param newValue the MasteredSkills to update
	 * 
	 */
	public void updateMasteredSkills();

	/**
	 * Adds the given filter to the MasteredSkills edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMasteredSkills(ViewerFilter filter);

	/**
	 * Adds the given filter to the MasteredSkills edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMasteredSkills(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the MasteredSkills table
	 * 
	 */
	public boolean isContainedInMasteredSkillsTable(EObject element);


	/**
	 * @return the BirthDate
	 * 
	 */
	public String getBirthDate();

	/**
	 * Defines a new BirthDate
	 * @param newValue the new BirthDate to set
	 * 
	 */
	public void setBirthDate(String newValue);




	// Start of user code for CustomElementEditor Employee BirthDate specific getters and setters declaration
	/**
	 * @return the birth date
	 * 
	public String getBirthDate();
	 */

	/**
	 * Defines a new age
	 * @param newValue the new birth date to set
	 * 
	public void setBirthDate(String newValue);	
	 */
	// End of user code

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
