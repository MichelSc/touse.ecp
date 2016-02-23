/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.components;

// Start of user code for imports
import com.misc.touse.eef.eefprimer.EefPrimerFactory;
import com.misc.touse.eef.eefprimer.EefPrimerPackage;
import com.misc.touse.eef.eefprimer.OrderProduct;
import com.misc.touse.eef.eefprimer.Product;

import com.misc.touse.eef.eefprimer.parts.EefprimerViewsRepository;
import com.misc.touse.eef.eefprimer.parts.OrderProductPropertiesEditionPart;

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

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public class OrderProductPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for Product EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings productSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public OrderProductPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject orderProduct, String editing_mode) {
		super(editingContext, orderProduct, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefprimerViewsRepository.class;
		partKey = EefprimerViewsRepository.OrderProduct.class;
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
			
			final OrderProduct orderProduct = (OrderProduct)elt;
			final OrderProductPropertiesEditionPart basePart = (OrderProductPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EefprimerViewsRepository.OrderProduct.Properties.product)) {
				// init part
				productSettings = new EObjectFlatComboSettings(orderProduct, EefPrimerPackage.eINSTANCE.getOrderProduct_Product());
				basePart.initProduct(productSettings);
				// set the button mode
				basePart.setProductButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(EefprimerViewsRepository.OrderProduct.Properties.quantity)) {
				basePart.setQuantity(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, orderProduct.getQuantity()));
			}
			
			// init filters
			if (isAccessible(EefprimerViewsRepository.OrderProduct.Properties.product)) {
				basePart.addFilterToProduct(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Product);
					}
					
				});
				// Start of user code for additional businessfilters for Product
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
		if (editorKey == EefprimerViewsRepository.OrderProduct.Properties.product) {
			return EefPrimerPackage.eINSTANCE.getOrderProduct_Product();
		}
		if (editorKey == EefprimerViewsRepository.OrderProduct.Properties.quantity) {
			return EefPrimerPackage.eINSTANCE.getOrderProduct_Quantity();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		OrderProduct orderProduct = (OrderProduct)semanticObject;
		if (EefprimerViewsRepository.OrderProduct.Properties.product == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				productSettings.setToReference((Product)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Product eObject = EefPrimerFactory.eINSTANCE.createProduct();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				productSettings.setToReference(eObject);
			}
		}
		if (EefprimerViewsRepository.OrderProduct.Properties.quantity == event.getAffectedEditor()) {
			orderProduct.setQuantity((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			OrderProductPropertiesEditionPart basePart = (OrderProductPropertiesEditionPart)editingPart;
			if (EefPrimerPackage.eINSTANCE.getOrderProduct_Product().equals(msg.getFeature()) && basePart != null && isAccessible(EefprimerViewsRepository.OrderProduct.Properties.product))
				basePart.setProduct((EObject)msg.getNewValue());
			if (EefPrimerPackage.eINSTANCE.getOrderProduct_Quantity().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EefprimerViewsRepository.OrderProduct.Properties.quantity)) {
				if (msg.getNewValue() != null) {
					basePart.setQuantity(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setQuantity("");
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
			EefPrimerPackage.eINSTANCE.getOrderProduct_Product(),
			EefPrimerPackage.eINSTANCE.getOrderProduct_Quantity()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EefprimerViewsRepository.OrderProduct.Properties.product || key == EefprimerViewsRepository.OrderProduct.Properties.quantity;
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
				if (EefprimerViewsRepository.OrderProduct.Properties.quantity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EefPrimerPackage.eINSTANCE.getOrderProduct_Quantity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefPrimerPackage.eINSTANCE.getOrderProduct_Quantity().getEAttributeType(), newValue);
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
