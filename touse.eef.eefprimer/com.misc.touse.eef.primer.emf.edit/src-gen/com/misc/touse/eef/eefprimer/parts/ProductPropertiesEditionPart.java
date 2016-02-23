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
public interface ProductPropertiesEditionPart {



	/**
	 * Init the RequiredSkills
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initRequiredSkills(ReferencesTableSettings settings);

	/**
	 * Update the RequiredSkills
	 * @param newValue the RequiredSkills to update
	 * 
	 */
	public void updateRequiredSkills();

	/**
	 * Adds the given filter to the RequiredSkills edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRequiredSkills(ViewerFilter filter);

	/**
	 * Adds the given filter to the RequiredSkills edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRequiredSkills(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the RequiredSkills table
	 * 
	 */
	public boolean isContainedInRequiredSkillsTable(EObject element);




	/**
	 * Init the RequiredMachines
	 * @param settings settings for the RequiredMachines ReferencesTable 
	 */
	public void initRequiredMachines(ReferencesTableSettings settings);

	/**
	 * Update the RequiredMachines
	 * @param newValue the RequiredMachines to update
	 * 
	 */
	public void updateRequiredMachines();

	/**
	 * Adds the given filter to the RequiredMachines edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToRequiredMachines(ViewerFilter filter);

	/**
	 * Adds the given filter to the RequiredMachines edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToRequiredMachines(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the RequiredMachines table
	 * 
	 */
	public boolean isContainedInRequiredMachinesTable(EObject element);


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
	 * @return the ProductionHours
	 * 
	 */
	public String getProductionHours();

	/**
	 * Defines a new ProductionHours
	 * @param newValue the new ProductionHours to set
	 * 
	 */
	public void setProductionHours(String newValue);





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
