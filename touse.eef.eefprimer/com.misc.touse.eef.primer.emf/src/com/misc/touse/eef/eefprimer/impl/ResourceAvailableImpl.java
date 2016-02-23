/**
 */
package com.misc.touse.eef.eefprimer.impl;

import com.misc.touse.eef.eefprimer.EefPrimerPackage;
import com.misc.touse.eef.eefprimer.Resource;
import com.misc.touse.eef.eefprimer.ResourceAvailable;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Available</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.misc.touse.eef.eefprimer.impl.ResourceAvailableImpl#getAvailableFrom <em>Available From</em>}</li>
 *   <li>{@link com.misc.touse.eef.eefprimer.impl.ResourceAvailableImpl#getAvailableTo <em>Available To</em>}</li>
 *   <li>{@link com.misc.touse.eef.eefprimer.impl.ResourceAvailableImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceAvailableImpl extends MinimalEObjectImpl.Container implements ResourceAvailable {
	/**
	 * The default value of the '{@link #getAvailableFrom() <em>Available From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableFrom()
	 * @generated
	 * @ordered
	 */
	protected static final Date AVAILABLE_FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailableFrom() <em>Available From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableFrom()
	 * @generated
	 * @ordered
	 */
	protected Date availableFrom = AVAILABLE_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailableTo() <em>Available To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTo()
	 * @generated
	 * @ordered
	 */
	protected static final Date AVAILABLE_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailableTo() <em>Available To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableTo()
	 * @generated
	 * @ordered
	 */
	protected Date availableTo = AVAILABLE_TO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResource()
	 * @generated
	 * @ordered
	 */
	protected Resource resource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceAvailableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EefPrimerPackage.Literals.RESOURCE_AVAILABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAvailableFrom() {
		return availableFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableFrom(Date newAvailableFrom) {
		Date oldAvailableFrom = availableFrom;
		availableFrom = newAvailableFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPrimerPackage.RESOURCE_AVAILABLE__AVAILABLE_FROM, oldAvailableFrom, availableFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAvailableTo() {
		return availableTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailableTo(Date newAvailableTo) {
		Date oldAvailableTo = availableTo;
		availableTo = newAvailableTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPrimerPackage.RESOURCE_AVAILABLE__AVAILABLE_TO, oldAvailableTo, availableTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getResource() {
		if (resource != null && resource.eIsProxy()) {
			InternalEObject oldResource = (InternalEObject)resource;
			resource = (Resource)eResolveProxy(oldResource);
			if (resource != oldResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EefPrimerPackage.RESOURCE_AVAILABLE__RESOURCE, oldResource, resource));
			}
		}
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetResource() {
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResource(Resource newResource) {
		Resource oldResource = resource;
		resource = newResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EefPrimerPackage.RESOURCE_AVAILABLE__RESOURCE, oldResource, resource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EefPrimerPackage.RESOURCE_AVAILABLE__AVAILABLE_FROM:
				return getAvailableFrom();
			case EefPrimerPackage.RESOURCE_AVAILABLE__AVAILABLE_TO:
				return getAvailableTo();
			case EefPrimerPackage.RESOURCE_AVAILABLE__RESOURCE:
				if (resolve) return getResource();
				return basicGetResource();
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
			case EefPrimerPackage.RESOURCE_AVAILABLE__AVAILABLE_FROM:
				setAvailableFrom((Date)newValue);
				return;
			case EefPrimerPackage.RESOURCE_AVAILABLE__AVAILABLE_TO:
				setAvailableTo((Date)newValue);
				return;
			case EefPrimerPackage.RESOURCE_AVAILABLE__RESOURCE:
				setResource((Resource)newValue);
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
			case EefPrimerPackage.RESOURCE_AVAILABLE__AVAILABLE_FROM:
				setAvailableFrom(AVAILABLE_FROM_EDEFAULT);
				return;
			case EefPrimerPackage.RESOURCE_AVAILABLE__AVAILABLE_TO:
				setAvailableTo(AVAILABLE_TO_EDEFAULT);
				return;
			case EefPrimerPackage.RESOURCE_AVAILABLE__RESOURCE:
				setResource((Resource)null);
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
			case EefPrimerPackage.RESOURCE_AVAILABLE__AVAILABLE_FROM:
				return AVAILABLE_FROM_EDEFAULT == null ? availableFrom != null : !AVAILABLE_FROM_EDEFAULT.equals(availableFrom);
			case EefPrimerPackage.RESOURCE_AVAILABLE__AVAILABLE_TO:
				return AVAILABLE_TO_EDEFAULT == null ? availableTo != null : !AVAILABLE_TO_EDEFAULT.equals(availableTo);
			case EefPrimerPackage.RESOURCE_AVAILABLE__RESOURCE:
				return resource != null;
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
		result.append(" (AvailableFrom: ");
		result.append(availableFrom);
		result.append(", AvailableTo: ");
		result.append(availableTo);
		result.append(')');
		return result.toString();
	}

} //ResourceAvailableImpl
