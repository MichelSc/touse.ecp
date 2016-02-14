/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.components;

// Start of user code for imports
import com.misc.touse.eef.eefprimer.Domain;
import com.misc.touse.eef.eefprimer.EefPrimerPackage;
import com.misc.touse.eef.eefprimer.Plan;
import com.misc.touse.eef.eefprimer.Product;
import com.misc.touse.eef.eefprimer.Resource;
import com.misc.touse.eef.eefprimer.Skill;

import com.misc.touse.eef.eefprimer.parts.DomainPropertiesEditionPart;
import com.misc.touse.eef.eefprimer.parts.EefprimerViewsRepository;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.resource.ResourceSet;

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
public class DomainPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for Resources ReferencesTable
	 */
	protected ReferencesTableSettings resourcesSettings;
	
	/**
	 * Settings for Skills ReferencesTable
	 */
	protected ReferencesTableSettings skillsSettings;
	
	/**
	 * Settings for Products ReferencesTable
	 */
	protected ReferencesTableSettings productsSettings;
	
	/**
	 * Settings for Plans ReferencesTable
	 */
	protected ReferencesTableSettings plansSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public DomainPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject domain, String editing_mode) {
		super(editingContext, domain, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefprimerViewsRepository.class;
		partKey = EefprimerViewsRepository.Domain.class;
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
			
			final Domain domain = (Domain)elt;
			final DomainPropertiesEditionPart basePart = (DomainPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EefprimerViewsRepository.Domain.Properties.resources)) {
				resourcesSettings = new ReferencesTableSettings(domain, EefPrimerPackage.eINSTANCE.getDomain_Resources());
				basePart.initResources(resourcesSettings);
			}
			if (isAccessible(EefprimerViewsRepository.Domain.Properties.skills)) {
				skillsSettings = new ReferencesTableSettings(domain, EefPrimerPackage.eINSTANCE.getDomain_Skills());
				basePart.initSkills(skillsSettings);
			}
			if (isAccessible(EefprimerViewsRepository.Domain.Properties.products)) {
				productsSettings = new ReferencesTableSettings(domain, EefPrimerPackage.eINSTANCE.getDomain_Products());
				basePart.initProducts(productsSettings);
			}
			if (isAccessible(EefprimerViewsRepository.Domain.Properties.plans)) {
				plansSettings = new ReferencesTableSettings(domain, EefPrimerPackage.eINSTANCE.getDomain_Plans());
				basePart.initPlans(plansSettings);
			}
			// init filters
			if (isAccessible(EefprimerViewsRepository.Domain.Properties.resources)) {
				basePart.addFilterToResources(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Resource); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for Resources
				// End of user code
			}
			if (isAccessible(EefprimerViewsRepository.Domain.Properties.skills)) {
				basePart.addFilterToSkills(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Skill); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for Skills
				// End of user code
			}
			if (isAccessible(EefprimerViewsRepository.Domain.Properties.products)) {
				basePart.addFilterToProducts(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Product); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for Products
				// End of user code
			}
			if (isAccessible(EefprimerViewsRepository.Domain.Properties.plans)) {
				basePart.addFilterToPlans(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Plan); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for Plans
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
		if (editorKey == EefprimerViewsRepository.Domain.Properties.resources) {
			return EefPrimerPackage.eINSTANCE.getDomain_Resources();
		}
		if (editorKey == EefprimerViewsRepository.Domain.Properties.skills) {
			return EefPrimerPackage.eINSTANCE.getDomain_Skills();
		}
		if (editorKey == EefprimerViewsRepository.Domain.Properties.products) {
			return EefPrimerPackage.eINSTANCE.getDomain_Products();
		}
		if (editorKey == EefprimerViewsRepository.Domain.Properties.plans) {
			return EefPrimerPackage.eINSTANCE.getDomain_Plans();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Domain domain = (Domain)semanticObject;
		if (EefprimerViewsRepository.Domain.Properties.resources == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, resourcesSettings, editingContext.getAdapterFactory());
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
				resourcesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				resourcesSettings.move(event.getNewIndex(), (Resource) event.getNewValue());
			}
		}
		if (EefprimerViewsRepository.Domain.Properties.skills == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, skillsSettings, editingContext.getAdapterFactory());
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
				skillsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				skillsSettings.move(event.getNewIndex(), (Skill) event.getNewValue());
			}
		}
		if (EefprimerViewsRepository.Domain.Properties.products == event.getAffectedEditor()) {
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
				productsSettings.move(event.getNewIndex(), (Product) event.getNewValue());
			}
		}
		if (EefprimerViewsRepository.Domain.Properties.plans == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, plansSettings, editingContext.getAdapterFactory());
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
				plansSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				plansSettings.move(event.getNewIndex(), (Plan) event.getNewValue());
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
			DomainPropertiesEditionPart basePart = (DomainPropertiesEditionPart)editingPart;
			if (EefPrimerPackage.eINSTANCE.getDomain_Resources().equals(msg.getFeature()) && isAccessible(EefprimerViewsRepository.Domain.Properties.resources))
				basePart.updateResources();
			if (EefPrimerPackage.eINSTANCE.getDomain_Skills().equals(msg.getFeature()) && isAccessible(EefprimerViewsRepository.Domain.Properties.skills))
				basePart.updateSkills();
			if (EefPrimerPackage.eINSTANCE.getDomain_Products().equals(msg.getFeature()) && isAccessible(EefprimerViewsRepository.Domain.Properties.products))
				basePart.updateProducts();
			if (EefPrimerPackage.eINSTANCE.getDomain_Plans().equals(msg.getFeature()) && isAccessible(EefprimerViewsRepository.Domain.Properties.plans))
				basePart.updatePlans();
			
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
			EefPrimerPackage.eINSTANCE.getDomain_Resources(),
			EefPrimerPackage.eINSTANCE.getDomain_Skills(),
			EefPrimerPackage.eINSTANCE.getDomain_Products(),
			EefPrimerPackage.eINSTANCE.getDomain_Plans()		);
		return new NotificationFilter[] {filter,};
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
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
