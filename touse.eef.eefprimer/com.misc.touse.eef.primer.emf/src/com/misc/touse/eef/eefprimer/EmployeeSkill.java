/**
 */
package com.misc.touse.eef.eefprimer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee Skill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.eef.eefprimer.EmployeeSkill#getLevel <em>Level</em>}</li>
 *   <li>{@link com.misc.touse.eef.eefprimer.EmployeeSkill#getSkill <em>Skill</em>}</li>
 * </ul>
 *
 * @see com.misc.touse.eef.eefprimer.EefPrimerPackage#getEmployeeSkill()
 * @model
 * @generated
 */
public interface EmployeeSkill extends EObject {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see com.misc.touse.eef.eefprimer.EefPrimerPackage#getEmployeeSkill_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link com.misc.touse.eef.eefprimer.EmployeeSkill#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Skill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill</em>' reference.
	 * @see #setSkill(Skill)
	 * @see com.misc.touse.eef.eefprimer.EefPrimerPackage#getEmployeeSkill_Skill()
	 * @model
	 * @generated
	 */
	Skill getSkill();

	/**
	 * Sets the value of the '{@link com.misc.touse.eef.eefprimer.EmployeeSkill#getSkill <em>Skill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill</em>' reference.
	 * @see #getSkill()
	 * @generated
	 */
	void setSkill(Skill value);

} // EmployeeSkill
