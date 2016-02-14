/**
 */
package com.misc.touse.eef.eefprimer.impl;

import com.misc.touse.eef.eefprimer.EefPrimerPackage;
import com.misc.touse.eef.eefprimer.Employee;
import com.misc.touse.eef.eefprimer.EmployeeSkill;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link com.misc.touse.eef.eefprimer.impl.EmployeeImpl#getMasteredSkills <em>Mastered Skills</em>}</li>
 *   <li>{@link com.misc.touse.eef.eefprimer.impl.EmployeeImpl#getBirthDate <em>Birth Date</em>}</li>
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
	 * The default value of the '{@link #getBirthDate() <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIRTH_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getBirthDate() <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected Date birthDate = BIRTH_DATE_EDEFAULT;

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
		return EefPrimerPackage.Literals.EMPLOYEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmployeeSkill> getMasteredSkills() {
		if (masteredSkills == null) {
			masteredSkills = new EObjectContainmentEList<EmployeeSkill>(EmployeeSkill.class, this, EefPrimerPackage.EMPLOYEE__MASTERED_SKILLS);
		}
		return masteredSkills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthDate(Date newBirthDate) {
		Date oldBirthDate = birthDate;
		birthDate = newBirthDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPrimerPackage.EMPLOYEE__BIRTH_DATE, oldBirthDate, birthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EefPrimerPackage.EMPLOYEE__MASTERED_SKILLS:
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
			case EefPrimerPackage.EMPLOYEE__MASTERED_SKILLS:
				return getMasteredSkills();
			case EefPrimerPackage.EMPLOYEE__BIRTH_DATE:
				return getBirthDate();
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
			case EefPrimerPackage.EMPLOYEE__MASTERED_SKILLS:
				getMasteredSkills().clear();
				getMasteredSkills().addAll((Collection<? extends EmployeeSkill>)newValue);
				return;
			case EefPrimerPackage.EMPLOYEE__BIRTH_DATE:
				setBirthDate((Date)newValue);
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
			case EefPrimerPackage.EMPLOYEE__MASTERED_SKILLS:
				getMasteredSkills().clear();
				return;
			case EefPrimerPackage.EMPLOYEE__BIRTH_DATE:
				setBirthDate(BIRTH_DATE_EDEFAULT);
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
			case EefPrimerPackage.EMPLOYEE__MASTERED_SKILLS:
				return masteredSkills != null && !masteredSkills.isEmpty();
			case EefPrimerPackage.EMPLOYEE__BIRTH_DATE:
				return BIRTH_DATE_EDEFAULT == null ? birthDate != null : !BIRTH_DATE_EDEFAULT.equals(birthDate);
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
		result.append(" (BirthDate: ");
		result.append(birthDate);
		result.append(')');
		return result.toString();
	}

} //EmployeeImpl
