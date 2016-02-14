/**
 */
package com.misc.touse.eef.eefprimer;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.eef.eefprimer.Order#getID <em>ID</em>}</li>
 *   <li>{@link com.misc.touse.eef.eefprimer.Order#getProducts <em>Products</em>}</li>
 *   <li>{@link com.misc.touse.eef.eefprimer.Order#getDueDate <em>Due Date</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.eef.eefprimer.EefPrimerPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see com.misc.touse.eef.eefprimer.EefPrimerPackage#getOrder_ID()
	 * @model required="true"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link com.misc.touse.eef.eefprimer.Order#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.eef.eefprimer.OrderProduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see com.misc.touse.eef.eefprimer.EefPrimerPackage#getOrder_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrderProduct> getProducts();

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(Date)
	 * @see com.misc.touse.eef.eefprimer.EefPrimerPackage#getOrder_DueDate()
	 * @model required="true"
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Sets the value of the '{@link com.misc.touse.eef.eefprimer.Order#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Date value);

} // Order
