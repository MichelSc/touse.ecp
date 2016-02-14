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
public interface ResourceAvailablePropertiesEditionPart {

	/**
	 * @return the AvailableFrom
	 * 
	 */
	public String getAvailableFrom();

	/**
	 * Defines a new AvailableFrom
	 * @param newValue the new AvailableFrom to set
	 * 
	 */
	public void setAvailableFrom(String newValue);


	/**
	 * @return the AvailableTo
	 * 
	 */
	public String getAvailableTo();

	/**
	 * Defines a new AvailableTo
	 * @param newValue the new AvailableTo to set
	 * 
	 */
	public void setAvailableTo(String newValue);


	/**
	 * @return the Resource
	 * 
	 */
	public EObject getResource();

	/**
	 * Init the Resource
	 * @param settings the combo setting
	 */
	public void initResource(EObjectFlatComboSettings settings);

	/**
	 * Defines a new Resource
	 * @param newValue the new Resource to set
	 * 
	 */
	public void setResource(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setResourceButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the Resource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToResource(ViewerFilter filter);

	/**
	 * Adds the given filter to the Resource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToResource(ViewerFilter filter);





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
