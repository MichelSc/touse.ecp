/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.components;

// Start of user code for imports
import com.misc.touse.eef.eefprimer.EefPrimerPackage;
import com.misc.touse.eef.eefprimer.Order;
import com.misc.touse.eef.eefprimer.OrderProduct;

import com.misc.touse.eef.eefprimer.parts.EefprimerViewsRepository;
import com.misc.touse.eef.eefprimer.parts.OrderPropertiesEditionPart;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class OrderPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for Products ReferencesTable
	 */
	protected ReferencesTableSettings productsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public OrderPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject order, String editing_mode) {
		super(editingContext, order, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefprimerViewsRepository.class;
		partKey = EefprimerViewsRepository.Order.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final Order order = (Order)elt;
			final OrderPropertiesEditionPart basePart = (OrderPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EefprimerViewsRepository.Order.Properties.iD)) {
				basePart.setID(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, order.getID()));
			}
			
			if (isAccessible(EefprimerViewsRepository.Order.Properties.products)) {
				productsSettings = new ReferencesTableSettings(order, EefPrimerPackage.eINSTANCE.getOrder_Products());
				basePart.initProducts(productsSettings);
			}
			if (isAccessible(EefprimerViewsRepository.Order.Properties.dueDate))
				basePart.setDueDate(EEFConverterUtil.convertToString(EcorePackage.Literals.EDATE, order.getDueDate()));
			
			// init filters
			
			if (isAccessible(EefprimerViewsRepository.Order.Properties.products)) {
				basePart.addFilterToProducts(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof OrderProduct); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for Products
				// End of user code
			}
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}






	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == EefprimerViewsRepository.Order.Properties.iD) {
			return EefPrimerPackage.eINSTANCE.getOrder_ID();
		}
		if (editorKey == EefprimerViewsRepository.Order.Properties.products) {
			return EefPrimerPackage.eINSTANCE.getOrder_Products();
		}
		if (editorKey == EefprimerViewsRepository.Order.Properties.dueDate) {
			return EefPrimerPackage.eINSTANCE.getOrder_DueDate();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Order order = (Order)semanticObject;
		if (EefprimerViewsRepository.Order.Properties.iD == event.getAffectedEditor()) {
			order.setID((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (EefprimerViewsRepository.Order.Properties.products == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, productsSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.EDIT) {
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, (EObject) event.getNewValue(), editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt((EObject) event.getNewValue(), PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy editionPolicy = provider.getPolicy(context);
					if (editionPolicy != null) {
						editionPolicy.execute();
					}
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				productsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				productsSettings.move(event.getNewIndex(), (OrderProduct) event.getNewValue());
			}
		}
		if (EefprimerViewsRepository.Order.Properties.dueDate == event.getAffectedEditor()) {
			order.setDueDate((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.Literals.EDATE, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			OrderPropertiesEditionPart basePart = (OrderPropertiesEditionPart)editingPart;
			if (EefPrimerPackage.eINSTANCE.getOrder_ID().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EefprimerViewsRepository.Order.Properties.iD)) {
				if (msg.getNewValue() != null) {
					basePart.setID(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setID("");
				}
			}
			if (EefPrimerPackage.eINSTANCE.getOrder_Products().equals(msg.getFeature()) && isAccessible(EefprimerViewsRepository.Order.Properties.products))
				basePart.updateProducts();
			if (EefPrimerPackage.eINSTANCE.getOrder_DueDate().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EefprimerViewsRepository.Order.Properties.dueDate)) {
				if (msg.getNewValue() != null) {
					basePart.setDueDate(EcoreUtil.convertToString(EcorePackage.Literals.EDATE, msg.getNewValue()));
				} else {
					basePart.setDueDate("");
				}
			}
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			EefPrimerPackage.eINSTANCE.getOrder_ID(),
			EefPrimerPackage.eINSTANCE.getOrder_Products(),
			EefPrimerPackage.eINSTANCE.getOrder_DueDate()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EefprimerViewsRepository.Order.Properties.iD || key == EefprimerViewsRepository.Order.Properties.dueDate;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (EefprimerViewsRepository.Order.Properties.iD == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EefPrimerPackage.eINSTANCE.getOrder_ID().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefPrimerPackage.eINSTANCE.getOrder_ID().getEAttributeType(), newValue);
				}
				if (EefprimerViewsRepository.Order.Properties.dueDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EefPrimerPackage.eINSTANCE.getOrder_DueDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefPrimerPackage.eINSTANCE.getOrder_DueDate().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
