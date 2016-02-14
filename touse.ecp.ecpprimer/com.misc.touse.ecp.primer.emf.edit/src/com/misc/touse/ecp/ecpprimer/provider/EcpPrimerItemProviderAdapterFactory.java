/**
 */
package com.misc.touse.ecp.ecpprimer.provider;

import com.misc.touse.ecp.ecpprimer.util.EcpPrimerAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EcpPrimerItemProviderAdapterFactory extends EcpPrimerAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcpPrimerItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.ecp.ecpprimer.Domain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainItemProvider domainItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.ecp.ecpprimer.Domain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainAdapter() {
		if (domainItemProvider == null) {
			domainItemProvider = new DomainItemProvider(this);
		}

		return domainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.ecp.ecpprimer.Employee} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeItemProvider employeeItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.ecp.ecpprimer.Employee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmployeeAdapter() {
		if (employeeItemProvider == null) {
			employeeItemProvider = new EmployeeItemProvider(this);
		}

		return employeeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.ecp.ecpprimer.Machine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineItemProvider machineItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.ecp.ecpprimer.Machine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMachineAdapter() {
		if (machineItemProvider == null) {
			machineItemProvider = new MachineItemProvider(this);
		}

		return machineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.ecp.ecpprimer.Order} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderItemProvider orderItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.ecp.ecpprimer.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrderAdapter() {
		if (orderItemProvider == null) {
			orderItemProvider = new OrderItemProvider(this);
		}

		return orderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.ecp.ecpprimer.Product} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductItemProvider productItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.ecp.ecpprimer.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductAdapter() {
		if (productItemProvider == null) {
			productItemProvider = new ProductItemProvider(this);
		}

		return productItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.ecp.ecpprimer.ProductSkill} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductSkillItemProvider productSkillItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.ecp.ecpprimer.ProductSkill}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductSkillAdapter() {
		if (productSkillItemProvider == null) {
			productSkillItemProvider = new ProductSkillItemProvider(this);
		}

		return productSkillItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.ecp.ecpprimer.Skill} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SkillItemProvider skillItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.ecp.ecpprimer.Skill}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSkillAdapter() {
		if (skillItemProvider == null) {
			skillItemProvider = new SkillItemProvider(this);
		}

		return skillItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.ecp.ecpprimer.EmployeeSkill} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeeSkillItemProvider employeeSkillItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.ecp.ecpprimer.EmployeeSkill}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEmployeeSkillAdapter() {
		if (employeeSkillItemProvider == null) {
			employeeSkillItemProvider = new EmployeeSkillItemProvider(this);
		}

		return employeeSkillItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.ecp.ecpprimer.OrderProduct} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderProductItemProvider orderProductItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.ecp.ecpprimer.OrderProduct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrderProductAdapter() {
		if (orderProductItemProvider == null) {
			orderProductItemProvider = new OrderProductItemProvider(this);
		}

		return orderProductItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.ecp.ecpprimer.Plan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanItemProvider planItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.ecp.ecpprimer.Plan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlanAdapter() {
		if (planItemProvider == null) {
			planItemProvider = new PlanItemProvider(this);
		}

		return planItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.misc.touse.ecp.ecpprimer.ResourceAvailable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceAvailableItemProvider resourceAvailableItemProvider;

	/**
	 * This creates an adapter for a {@link com.misc.touse.ecp.ecpprimer.ResourceAvailable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceAvailableAdapter() {
		if (resourceAvailableItemProvider == null) {
			resourceAvailableItemProvider = new ResourceAvailableItemProvider(this);
		}

		return resourceAvailableItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (domainItemProvider != null) domainItemProvider.dispose();
		if (employeeItemProvider != null) employeeItemProvider.dispose();
		if (machineItemProvider != null) machineItemProvider.dispose();
		if (orderItemProvider != null) orderItemProvider.dispose();
		if (productItemProvider != null) productItemProvider.dispose();
		if (productSkillItemProvider != null) productSkillItemProvider.dispose();
		if (skillItemProvider != null) skillItemProvider.dispose();
		if (employeeSkillItemProvider != null) employeeSkillItemProvider.dispose();
		if (orderProductItemProvider != null) orderProductItemProvider.dispose();
		if (planItemProvider != null) planItemProvider.dispose();
		if (resourceAvailableItemProvider != null) resourceAvailableItemProvider.dispose();
	}

}
