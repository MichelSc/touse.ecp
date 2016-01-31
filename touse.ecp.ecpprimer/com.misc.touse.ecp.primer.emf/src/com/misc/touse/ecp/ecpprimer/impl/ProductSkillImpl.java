/**
 */
package com.misc.touse.ecp.ecpprimer.impl;

import com.misc.touse.ecp.ecpprimer.EcpPrimerPackage;
import com.misc.touse.ecp.ecpprimer.ProductSkill;
import com.misc.touse.ecp.ecpprimer.Skill;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Skill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.ecp.ecpprimer.impl.ProductSkillImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link com.misc.touse.ecp.ecpprimer.impl.ProductSkillImpl#getSkill <em>Skill</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductSkillImpl extends MinimalEObjectImpl.Container implements ProductSkill {
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
	protected ProductSkillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcpPrimerPackage.Literals.PRODUCT_SKILL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcpPrimerPackage.PRODUCT_SKILL__LEVEL, oldLevel, level));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcpPrimerPackage.PRODUCT_SKILL__SKILL, oldSkill, skill));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EcpPrimerPackage.PRODUCT_SKILL__SKILL, oldSkill, skill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EcpPrimerPackage.PRODUCT_SKILL__LEVEL:
				return getLevel();
			case EcpPrimerPackage.PRODUCT_SKILL__SKILL:
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
			case EcpPrimerPackage.PRODUCT_SKILL__LEVEL:
				setLevel((Integer)newValue);
				return;
			case EcpPrimerPackage.PRODUCT_SKILL__SKILL:
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
			case EcpPrimerPackage.PRODUCT_SKILL__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case EcpPrimerPackage.PRODUCT_SKILL__SKILL:
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
			case EcpPrimerPackage.PRODUCT_SKILL__LEVEL:
				return level != LEVEL_EDEFAULT;
			case EcpPrimerPackage.PRODUCT_SKILL__SKILL:
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

} //ProductSkillImpl
