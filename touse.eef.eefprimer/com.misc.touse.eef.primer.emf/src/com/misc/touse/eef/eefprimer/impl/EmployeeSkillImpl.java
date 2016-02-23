/**
 */
package com.misc.touse.eef.eefprimer.impl;

import com.misc.touse.eef.eefprimer.EefPrimerPackage;
import com.misc.touse.eef.eefprimer.EmployeeSkill;
import com.misc.touse.eef.eefprimer.Skill;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employee Skill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.eef.eefprimer.impl.EmployeeSkillImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link com.misc.touse.eef.eefprimer.impl.EmployeeSkillImpl#getSkill <em>Skill</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeeSkillImpl extends MinimalEObjectImpl.Container implements EmployeeSkill {
	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSkill() <em>Skill</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkill()
	 * @generated
	 * @ordered
	 */
	protected Skill skill;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeSkillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPrimerPackage.Literals.EMPLOYEE_SKILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPrimerPackage.EMPLOYEE_SKILL__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skill getSkill() {
		if (skill != null && skill.eIsProxy()) {
			InternalEObject oldSkill = (InternalEObject)skill;
			skill = (Skill)eResolveProxy(oldSkill);
			if (skill != oldSkill) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefPrimerPackage.EMPLOYEE_SKILL__SKILL, oldSkill, skill));
			}
		}
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skill basicGetSkill() {
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkill(Skill newSkill) {
		Skill oldSkill = skill;
		skill = newSkill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPrimerPackage.EMPLOYEE_SKILL__SKILL, oldSkill, skill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EefPrimerPackage.EMPLOYEE_SKILL__LEVEL:
				return getLevel();
			case EefPrimerPackage.EMPLOYEE_SKILL__SKILL:
				if (resolve) return getSkill();
				return basicGetSkill();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EefPrimerPackage.EMPLOYEE_SKILL__LEVEL:
				setLevel((Integer)newValue);
				return;
			case EefPrimerPackage.EMPLOYEE_SKILL__SKILL:
				setSkill((Skill)newValue);
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
			case EefPrimerPackage.EMPLOYEE_SKILL__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case EefPrimerPackage.EMPLOYEE_SKILL__SKILL:
				setSkill((Skill)null);
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
			case EefPrimerPackage.EMPLOYEE_SKILL__LEVEL:
				return level != LEVEL_EDEFAULT;
			case EefPrimerPackage.EMPLOYEE_SKILL__SKILL:
				return skill != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //EmployeeSkillImpl
