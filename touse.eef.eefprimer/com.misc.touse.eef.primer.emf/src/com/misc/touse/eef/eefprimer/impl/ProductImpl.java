/**
 */
package com.misc.touse.eef.eefprimer.impl;

import com.misc.touse.eef.eefprimer.EefPrimerPackage;
import com.misc.touse.eef.eefprimer.Machine;
import com.misc.touse.eef.eefprimer.Product;
import com.misc.touse.eef.eefprimer.ProductSkill;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.eef.eefprimer.impl.ProductImpl#getRequiredSkills <em>Required Skills</em>}</li>
 *   <li>{@link com.misc.touse.eef.eefprimer.impl.ProductImpl#getRequiredMachines <em>Required Machines</em>}</li>
 *   <li>{@link com.misc.touse.eef.eefprimer.impl.ProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.misc.touse.eef.eefprimer.impl.ProductImpl#getProductionHours <em>Production Hours</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends MinimalEObjectImpl.Container implements Product {
	/**
	 * The cached value of the '{@link #getRequiredSkills() <em>Required Skills</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredSkills()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductSkill> requiredSkills;

	/**
	 * The cached value of the '{@link #getRequiredMachines() <em>Required Machines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredMachines()
	 * @generated
	 * @ordered
	 */
	protected EList<Machine> requiredMachines;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductionHours() <em>Production Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionHours()
	 * @generated
	 * @ordered
	 */
	protected static final float PRODUCTION_HOURS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getProductionHours() <em>Production Hours</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductionHours()
	 * @generated
	 * @ordered
	 */
	protected float productionHours = PRODUCTION_HOURS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPrimerPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductSkill> getRequiredSkills() {
		if (requiredSkills == null) {
			requiredSkills = new EObjectContainmentEList<ProductSkill>(ProductSkill.class, this, EefPrimerPackage.PRODUCT__REQUIRED_SKILLS);
		}
		return requiredSkills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Machine> getRequiredMachines() {
		if (requiredMachines == null) {
			requiredMachines = new EObjectResolvingEList<Machine>(Machine.class, this, EefPrimerPackage.PRODUCT__REQUIRED_MACHINES);
		}
		return requiredMachines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPrimerPackage.PRODUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getProductionHours() {
		return productionHours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductionHours(float newProductionHours) {
		float oldProductionHours = productionHours;
		productionHours = newProductionHours;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPrimerPackage.PRODUCT__PRODUCTION_HOURS, oldProductionHours, productionHours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EefPrimerPackage.PRODUCT__REQUIRED_SKILLS:
				return ((InternalEList<?>)getRequiredSkills()).basicRemove(otherEnd, msgs);
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
			case EefPrimerPackage.PRODUCT__REQUIRED_SKILLS:
				return getRequiredSkills();
			case EefPrimerPackage.PRODUCT__REQUIRED_MACHINES:
				return getRequiredMachines();
			case EefPrimerPackage.PRODUCT__NAME:
				return getName();
			case EefPrimerPackage.PRODUCT__PRODUCTION_HOURS:
				return getProductionHours();
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
			case EefPrimerPackage.PRODUCT__REQUIRED_SKILLS:
				getRequiredSkills().clear();
				getRequiredSkills().addAll((Collection<? extends ProductSkill>)newValue);
				return;
			case EefPrimerPackage.PRODUCT__REQUIRED_MACHINES:
				getRequiredMachines().clear();
				getRequiredMachines().addAll((Collection<? extends Machine>)newValue);
				return;
			case EefPrimerPackage.PRODUCT__NAME:
				setName((String)newValue);
				return;
			case EefPrimerPackage.PRODUCT__PRODUCTION_HOURS:
				setProductionHours((Float)newValue);
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
			case EefPrimerPackage.PRODUCT__REQUIRED_SKILLS:
				getRequiredSkills().clear();
				return;
			case EefPrimerPackage.PRODUCT__REQUIRED_MACHINES:
				getRequiredMachines().clear();
				return;
			case EefPrimerPackage.PRODUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EefPrimerPackage.PRODUCT__PRODUCTION_HOURS:
				setProductionHours(PRODUCTION_HOURS_EDEFAULT);
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
			case EefPrimerPackage.PRODUCT__REQUIRED_SKILLS:
				return requiredSkills != null && !requiredSkills.isEmpty();
			case EefPrimerPackage.PRODUCT__REQUIRED_MACHINES:
				return requiredMachines != null && !requiredMachines.isEmpty();
			case EefPrimerPackage.PRODUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EefPrimerPackage.PRODUCT__PRODUCTION_HOURS:
				return productionHours != PRODUCTION_HOURS_EDEFAULT;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", ProductionHours: ");
		result.append(productionHours);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
