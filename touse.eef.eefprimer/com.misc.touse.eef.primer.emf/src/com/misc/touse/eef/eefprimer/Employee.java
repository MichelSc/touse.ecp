/**
 */
package com.misc.touse.eef.eefprimer;

import java.util.Date;
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
 *   <li>{@link com.misc.touse.eef.eefprimer.Employee#getMasteredSkills <em>Mastered Skills</em>}</li>
 *   <li>{@link com.misc.touse.eef.eefprimer.Employee#getBirthDate <em>Birth Date</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.eef.eefprimer.EefPrimerPackage#getEmployee()
 * @model
 * @generated
 */
public interface Employee extends Resource {
	/**
	 * Returns the value of the '<em><b>Mastered Skills</b></em>' containment reference list.
	 * The list contents are of type {@link com.misc.touse.eef.eefprimer.EmployeeSkill}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mastered Skills</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mastered Skills</em>' containment reference list.
	 * @see com.misc.touse.eef.eefprimer.EefPrimerPackage#getEmployee_MasteredSkills()
	 * @model containment="true"
	 * @generated
	 */
	EList<EmployeeSkill> getMasteredSkills();

	/**
	 * Returns the value of the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birth Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth Date</em>' attribute.
	 * @see #setBirthDate(Date)
	 * @see com.misc.touse.eef.eefprimer.EefPrimerPackage#getEmployee_BirthDate()
	 * @model
	 * @generated
	 */
	Date getBirthDate();

	/**
	 * Sets the value of the '{@link com.misc.touse.eef.eefprimer.Employee#getBirthDate <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Date</em>' attribute.
	 * @see #getBirthDate()
	 * @generated
	 */
	void setBirthDate(Date value);

} // Employee
