/**
 */
package com.misc.touse.eef.eefprimer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.eef.eefprimer.Product#getRequiredSkills <em>Required Skills</em>}</li>
 *   <li>{@link com.misc.touse.eef.eefprimer.Product#getRequiredMachines <em>Required Machines</em>}</li>
 *   <li>{@link com.misc.touse.eef.eefprimer.Product#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.eef.eefprimer.Product#getProductionHours <em>Production Hours</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.eef.eefprimer.EefPrimerPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Skills</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.eef.eefprimer.ProductSkill}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Skills</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Skills</em>' containment reference list.
	 * @see com.misc.touse.eef.eefprimer.EefPrimerPackage#getProduct_RequiredSkills()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductSkill> getRequiredSkills();

	/**
	 * Returns the value of the '<em><b>Required Machines</b></em>' reference list.
	 * The list contents are of type {@link com.misc.touse.eef.eefprimer.Machine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Machines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Machines</em>' reference list.
	 * @see com.misc.touse.eef.eefprimer.EefPrimerPackage#getProduct_RequiredMachines()
	 * @model
	 * @generated
	 */
	EList<Machine> getRequiredMachines();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.misc.touse.eef.eefprimer.EefPrimerPackage#getProduct_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.misc.touse.eef.eefprimer.Product#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Production Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Production Hours</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Production Hours</em>' attribute.
	 * @see #setProductionHours(float)
	 * @see com.misc.touse.eef.eefprimer.EefPrimerPackage#getProduct_ProductionHours()
	 * @model
	 * @generated
	 */
	float getProductionHours();

	/**
	 * Sets the value of the '{@link com.misc.touse.eef.eefprimer.Product#getProductionHours <em>Production Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Production Hours</em>' attribute.
	 * @see #getProductionHours()
	 * @generated
	 */
	void setProductionHours(float value);

} // Product
