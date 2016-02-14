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
public interface OrderProductPropertiesEditionPart {

	/**
	 * @return the Product
	 * 
	 */
	public EObject getProduct();

	/**
	 * Init the Product
	 * @param settings the combo setting
	 */
	public void initProduct(EObjectFlatComboSettings settings);

	/**
	 * Defines a new Product
	 * @param newValue the new Product to set
	 * 
	 */
	public void setProduct(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setProductButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the Product edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProduct(ViewerFilter filter);

	/**
	 * Adds the given filter to the Product edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProduct(ViewerFilter filter);


	/**
	 * @return the Quantity
	 * 
	 */
	public String getQuantity();

	/**
	 * Defines a new Quantity
	 * @param newValue the new Quantity to set
	 * 
	 */
	public void setQuantity(String newValue);





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
