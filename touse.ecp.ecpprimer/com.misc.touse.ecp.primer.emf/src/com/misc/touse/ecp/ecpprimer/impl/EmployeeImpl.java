/**
 */
package com.misc.touse.ecp.ecpprimer.impl;

import com.misc.touse.ecp.ecpprimer.EcpPrimerPackage;
import com.misc.touse.ecp.ecpprimer.Employee;
import com.misc.touse.ecp.ecpprimer.EmployeeSkill;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.ecp.ecpprimer.impl.EmployeeImpl#getMasteredSkills <em>Mastered Skills</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeImpl extends ResourceImpl implements Employee {
	/**
	 * The cached value of the '{@link #getMasteredSkills() <em>Mastered Skills</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasteredSkills()
	 * @generated
	 * @ordered
	 */
	protected EList<EmployeeSkill> masteredSkills;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcpPrimerPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmployeeSkill> getMasteredSkills() {
		if (masteredSkills == null) {
			masteredSkills = new EObjectContainmentEList<EmployeeSkill>(EmployeeSkill.class, this, EcpPrimerPackage.EMPLOYEE__MASTERED_SKILLS);
		}
		return masteredSkills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcpPrimerPackage.EMPLOYEE__MASTERED_SKILLS:
				return ((InternalEList<?>)getMasteredSkills()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcpPrimerPackage.EMPLOYEE__MASTERED_SKILLS:
				return getMasteredSkills();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EcpPrimerPackage.EMPLOYEE__MASTERED_SKILLS:
				getMasteredSkills().clear();
				getMasteredSkills().addAll((Collection<? extends EmployeeSkill>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EcpPrimerPackage.EMPLOYEE__MASTERED_SKILLS:
				getMasteredSkills().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EcpPrimerPackage.EMPLOYEE__MASTERED_SKILLS:
				return masteredSkills != null && !masteredSkills.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EmployeeImpl
