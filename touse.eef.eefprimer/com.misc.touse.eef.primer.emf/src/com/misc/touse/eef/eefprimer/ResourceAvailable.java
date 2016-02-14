/**
 */
package com.misc.touse.eef.eefprimer;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Available</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.eef.eefprimer.ResourceAvailable#getAvailableFrom <em>Available From</em>}</li>
 *   <li>{@link com.misc.touse.eef.eefprimer.ResourceAvailable#getAvailableTo <em>Available To</em>}</li>
 *   <li>{@link com.misc.touse.eef.eefprimer.ResourceAvailable#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.eef.eefprimer.EefPrimerPackage#getResourceAvailable()
 * @model
 * @generated
 */
public interface ResourceAvailable extends EObject {
	/**
	 * Returns the value of the '<em><b>Available From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available From</em>' attribute.
	 * @see #setAvailableFrom(Date)
	 * @see com.misc.touse.eef.eefprimer.EefPrimerPackage#getResourceAvailable_AvailableFrom()
	 * @model required="true"
	 * @generated
	 */
	Date getAvailableFrom();

	/**
	 * Sets the value of the '{@link com.misc.touse.eef.eefprimer.ResourceAvailable#getAvailableFrom <em>Available From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available From</em>' attribute.
	 * @see #getAvailableFrom()
	 * @generated
	 */
	void setAvailableFrom(Date value);

	/**
	 * Returns the value of the '<em><b>Available To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available To</em>' attribute.
	 * @see #setAvailableTo(Date)
	 * @see com.misc.touse.eef.eefprimer.EefPrimerPackage#getResourceAvailable_AvailableTo()
	 * @model required="true"
	 * @generated
	 */
	Date getAvailableTo();

	/**
	 * Sets the value of the '{@link com.misc.touse.eef.eefprimer.ResourceAvailable#getAvailableTo <em>Available To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available To</em>' attribute.
	 * @see #getAvailableTo()
	 * @generated
	 */
	void setAvailableTo(Date value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' reference.
	 * @see #setResource(Resource)
	 * @see com.misc.touse.eef.eefprimer.EefPrimerPackage#getResourceAvailable_Resource()
	 * @model required="true"
	 * @generated
	 */
	Resource getResource();

	/**
	 * Sets the value of the '{@link com.misc.touse.eef.eefprimer.ResourceAvailable#getResource <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Resource value);

} // ResourceAvailable
