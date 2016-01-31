/**
 */
package com.misc.touse.ecp.ecpprimer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.ecp.ecpprimer.Domain#getResources <em>Resources</em>}</li>
 *   <li>{@link com.misc.touse.ecp.ecpprimer.Domain#getSkills <em>Skills</em>}</li>
 *   <li>{@link com.misc.touse.ecp.ecpprimer.Domain#getProducts <em>Products</em>}</li>
 *   <li>{@link com.misc.touse.ecp.ecpprimer.Domain#getPlans <em>Plans</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.ecp.ecpprimer.EcpPrimerPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.ecp.ecpprimer.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see com.misc.touse.ecp.ecpprimer.EcpPrimerPackage#getDomain_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

	/**
	 * Returns the value of the '<em><b>Skills</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.ecp.ecpprimer.Skill}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skills</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills</em>' containment reference list.
	 * @see com.misc.touse.ecp.ecpprimer.EcpPrimerPackage#getDomain_Skills()
	 * @model containment="true"
	 * @generated
	 */
	EList<Skill> getSkills();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.ecp.ecpprimer.Product}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Products</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see com.misc.touse.ecp.ecpprimer.EcpPrimerPackage#getDomain_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Returns the value of the '<em><b>Plans</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.ecp.ecpprimer.Plan}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plans</em>' containment reference list.
	 * @see com.misc.touse.ecp.ecpprimer.EcpPrimerPackage#getDomain_Plans()
	 * @model containment="true"
	 * @generated
	 */
	EList<Plan> getPlans();

} // Domain
