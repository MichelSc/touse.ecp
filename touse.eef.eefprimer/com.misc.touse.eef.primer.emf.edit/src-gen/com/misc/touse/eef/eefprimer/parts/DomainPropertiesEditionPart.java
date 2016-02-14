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
public interface DomainPropertiesEditionPart {



	/**
	 * Init the Resources
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initResources(ReferencesTableSettings settings);

	/**
	 * Update the Resources
	 * @param newValue the Resources to update
	 * 
	 */
	public void updateResources();

	/**
	 * Adds the given filter to the Resources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToResources(ViewerFilter filter);

	/**
	 * Adds the given filter to the Resources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToResources(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the Resources table
	 * 
	 */
	public boolean isContainedInResourcesTable(EObject element);




	/**
	 * Init the Skills
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initSkills(ReferencesTableSettings settings);

	/**
	 * Update the Skills
	 * @param newValue the Skills to update
	 * 
	 */
	public void updateSkills();

	/**
	 * Adds the given filter to the Skills edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSkills(ViewerFilter filter);

	/**
	 * Adds the given filter to the Skills edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSkills(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the Skills table
	 * 
	 */
	public boolean isContainedInSkillsTable(EObject element);




	/**
	 * Init the Products
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initProducts(ReferencesTableSettings settings);

	/**
	 * Update the Products
	 * @param newValue the Products to update
	 * 
	 */
	public void updateProducts();

	/**
	 * Adds the given filter to the Products edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProducts(ViewerFilter filter);

	/**
	 * Adds the given filter to the Products edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProducts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the Products table
	 * 
	 */
	public boolean isContainedInProductsTable(EObject element);




	/**
	 * Init the Plans
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initPlans(ReferencesTableSettings settings);

	/**
	 * Update the Plans
	 * @param newValue the Plans to update
	 * 
	 */
	public void updatePlans();

	/**
	 * Adds the given filter to the Plans edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPlans(ViewerFilter filter);

	/**
	 * Adds the given filter to the Plans edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPlans(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the Plans table
	 * 
	 */
	public boolean isContainedInPlansTable(EObject element);





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
