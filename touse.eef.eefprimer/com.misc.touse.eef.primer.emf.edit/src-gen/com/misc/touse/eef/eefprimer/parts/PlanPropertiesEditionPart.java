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
public interface PlanPropertiesEditionPart {

	/**
	 * @return the ID
	 * 
	 */
	public String getID();

	/**
	 * Defines a new ID
	 * @param newValue the new ID to set
	 * 
	 */
	public void setID(String newValue);




	/**
	 * Init the Orders
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initOrders(ReferencesTableSettings settings);

	/**
	 * Update the Orders
	 * @param newValue the Orders to update
	 * 
	 */
	public void updateOrders();

	/**
	 * Adds the given filter to the Orders edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOrders(ViewerFilter filter);

	/**
	 * Adds the given filter to the Orders edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOrders(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the Orders table
	 * 
	 */
	public boolean isContainedInOrdersTable(EObject element);




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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
