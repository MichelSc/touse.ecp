/**
 */
package com.misc.touse.ecp.ecpprimer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.ecp.ecpprimer.Employee#getMasteredSkills <em>Mastered Skills</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.ecp.ecpprimer.EcpPrimerPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends Resource {
	/**
	 * Returns the value of the '<em><b>Mastered Skills</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.ecp.ecpprimer.EmployeeSkill}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mastered Skills</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mastered Skills</em>' containment reference list.
	 * @see com.misc.touse.ecp.ecpprimer.EcpPrimerPackage#getEmployee_MasteredSkills()
	 * @model containment="true"
	 * @generated
	 */
	EList<EmployeeSkill> getMasteredSkills();

} // Employee
