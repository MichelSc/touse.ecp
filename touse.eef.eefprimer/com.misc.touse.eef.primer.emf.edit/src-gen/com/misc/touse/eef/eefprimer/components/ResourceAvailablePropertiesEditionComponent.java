/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.components;

// Start of user code for imports
import com.misc.touse.eef.eefprimer.EefPrimerPackage;
import com.misc.touse.eef.eefprimer.Resource;
import com.misc.touse.eef.eefprimer.ResourceAvailable;

import com.misc.touse.eef.eefprimer.parts.EefprimerViewsRepository;
import com.misc.touse.eef.eefprimer.parts.ResourceAvailablePropertiesEditionPart;

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

import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;

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
public class ResourceAvailablePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for Resource EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings resourceSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public ResourceAvailablePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject resourceAvailable, String editing_mode) {
		super(editingContext, resourceAvailable, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefprimerViewsRepository.class;
		partKey = EefprimerViewsRepository.ResourceAvailable.class;
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
			
			final ResourceAvailable resourceAvailable = (ResourceAvailable)elt;
			final ResourceAvailablePropertiesEditionPart basePart = (ResourceAvailablePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom))
				basePart.setAvailableFrom(EEFConverterUtil.convertToString(EcorePackage.Literals.EDATE, resourceAvailable.getAvailableFrom()));
			
			if (isAccessible(EefprimerViewsRepository.ResourceAvailable.Properties.availableTo))
				basePart.setAvailableTo(EEFConverterUtil.convertToString(EcorePackage.Literals.EDATE, resourceAvailable.getAvailableTo()));
			
			if (isAccessible(EefprimerViewsRepository.ResourceAvailable.Properties.resource)) {
				// init part
				resourceSettings = new EObjectFlatComboSettings(resourceAvailable, EefPrimerPackage.eINSTANCE.getResourceAvailable_Resource());
				basePart.initResource(resourceSettings);
				// set the button mode
				basePart.setResourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			if (isAccessible(EefprimerViewsRepository.ResourceAvailable.Properties.resource)) {
				basePart.addFilterToResource(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof Resource);
					}
					
				});
				// Start of user code for additional businessfilters for Resource
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
		if (editorKey == EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom) {
			return EefPrimerPackage.eINSTANCE.getResourceAvailable_AvailableFrom();
		}
		if (editorKey == EefprimerViewsRepository.ResourceAvailable.Properties.availableTo) {
			return EefPrimerPackage.eINSTANCE.getResourceAvailable_AvailableTo();
		}
		if (editorKey == EefprimerViewsRepository.ResourceAvailable.Properties.resource) {
			return EefPrimerPackage.eINSTANCE.getResourceAvailable_Resource();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ResourceAvailable resourceAvailable = (ResourceAvailable)semanticObject;
		if (EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom == event.getAffectedEditor()) {
			resourceAvailable.setAvailableFrom((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.Literals.EDATE, (String)event.getNewValue()));
		}
		if (EefprimerViewsRepository.ResourceAvailable.Properties.availableTo == event.getAffectedEditor()) {
			resourceAvailable.setAvailableTo((java.util.Date)EEFConverterUtil.createFromString(EcorePackage.Literals.EDATE, (String)event.getNewValue()));
		}
		if (EefprimerViewsRepository.ResourceAvailable.Properties.resource == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				resourceSettings.setToReference((Resource)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, resourceSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ResourceAvailablePropertiesEditionPart basePart = (ResourceAvailablePropertiesEditionPart)editingPart;
			if (EefPrimerPackage.eINSTANCE.getResourceAvailable_AvailableFrom().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom)) {
				if (msg.getNewValue() != null) {
					basePart.setAvailableFrom(EcoreUtil.convertToString(EcorePackage.Literals.EDATE, msg.getNewValue()));
				} else {
					basePart.setAvailableFrom("");
				}
			}
			if (EefPrimerPackage.eINSTANCE.getResourceAvailable_AvailableTo().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EefprimerViewsRepository.ResourceAvailable.Properties.availableTo)) {
				if (msg.getNewValue() != null) {
					basePart.setAvailableTo(EcoreUtil.convertToString(EcorePackage.Literals.EDATE, msg.getNewValue()));
				} else {
					basePart.setAvailableTo("");
				}
			}
			if (EefPrimerPackage.eINSTANCE.getResourceAvailable_Resource().equals(msg.getFeature()) && basePart != null && isAccessible(EefprimerViewsRepository.ResourceAvailable.Properties.resource))
				basePart.setResource((EObject)msg.getNewValue());
			
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
			EefPrimerPackage.eINSTANCE.getResourceAvailable_AvailableFrom(),
			EefPrimerPackage.eINSTANCE.getResourceAvailable_AvailableTo(),
			EefPrimerPackage.eINSTANCE.getResourceAvailable_Resource()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom || key == EefprimerViewsRepository.ResourceAvailable.Properties.availableTo || key == EefprimerViewsRepository.ResourceAvailable.Properties.resource;
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
				if (EefprimerViewsRepository.ResourceAvailable.Properties.availableFrom == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EefPrimerPackage.eINSTANCE.getResourceAvailable_AvailableFrom().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefPrimerPackage.eINSTANCE.getResourceAvailable_AvailableFrom().getEAttributeType(), newValue);
				}
				if (EefprimerViewsRepository.ResourceAvailable.Properties.availableTo == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EefPrimerPackage.eINSTANCE.getResourceAvailable_AvailableTo().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefPrimerPackage.eINSTANCE.getResourceAvailable_AvailableTo().getEAttributeType(), newValue);
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
