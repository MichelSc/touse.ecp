/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.components;

// Start of user code for imports
import com.misc.touse.eef.eefprimer.EefPrimerPackage;
import com.misc.touse.eef.eefprimer.Employee;
import com.misc.touse.eef.eefprimer.EmployeeSkill;

import com.misc.touse.eef.eefprimer.parts.EefprimerViewsRepository;
import com.misc.touse.eef.eefprimer.parts.EmployeePropertiesEditionPart;

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
public class EmployeePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for MasteredSkills ReferencesTable
	 */
	protected ReferencesTableSettings masteredSkillsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public EmployeePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject employee, String editing_mode) {
		super(editingContext, employee, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefprimerViewsRepository.class;
		partKey = EefprimerViewsRepository.Employee.class;
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
			
			final Employee employee = (Employee)elt;
			final EmployeePropertiesEditionPart basePart = (EmployeePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EefprimerViewsRepository.Employee.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, employee.getName()));
			
			if (isAccessible(EefprimerViewsRepository.Employee.Properties.masteredSkills)) {
				masteredSkillsSettings = new ReferencesTableSettings(employee, EefPrimerPackage.eINSTANCE.getEmployee_MasteredSkills());
				basePart.initMasteredSkills(masteredSkillsSettings);
			}
			// Start of user code  for BirthDate command update
			// End of user code
			
			// init filters
			
			if (isAccessible(EefprimerViewsRepository.Employee.Properties.masteredSkills)) {
				basePart.addFilterToMasteredSkills(new ViewerFilter() {
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof EmployeeSkill); //$NON-NLS-1$ 
					}
			
				});
				// Start of user code for additional businessfilters for MasteredSkills
				// End of user code
			}
			// Start of user code  for BirthDate filter update
			// End of user code
			
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
		if (editorKey == EefprimerViewsRepository.Employee.Properties.name) {
			return EefPrimerPackage.eINSTANCE.getResource_Name();
		}
		if (editorKey == EefprimerViewsRepository.Employee.Properties.masteredSkills) {
			return EefPrimerPackage.eINSTANCE.getEmployee_MasteredSkills();
		}
		if (editorKey == EefprimerViewsRepository.Employee.Properties.customElementEditorEmployeeBirthDate) {
			return EefPrimerPackage.eINSTANCE.getEmployee_BirthDate();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		Employee employee = (Employee)semanticObject;
		if (EefprimerViewsRepository.Employee.Properties.name == event.getAffectedEditor()) {
			employee.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (EefprimerViewsRepository.Employee.Properties.masteredSkills == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, masteredSkillsSettings, editingContext.getAdapterFactory());
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
				masteredSkillsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				masteredSkillsSettings.move(event.getNewIndex(), (EmployeeSkill) event.getNewValue());
			}
		}
		if (EefprimerViewsRepository.Employee.Properties.customElementEditorEmployeeBirthDate == event.getAffectedEditor()) {
			// Start of user code for updateBirthDate method body
			// End of user code
			
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			EmployeePropertiesEditionPart basePart = (EmployeePropertiesEditionPart)editingPart;
			if (EefPrimerPackage.eINSTANCE.getResource_Name().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EefprimerViewsRepository.Employee.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (EefPrimerPackage.eINSTANCE.getEmployee_MasteredSkills().equals(msg.getFeature()) && isAccessible(EefprimerViewsRepository.Employee.Properties.masteredSkills))
				basePart.updateMasteredSkills();
					// Start of user code for BirthDate live update
					
					// End of user code
			
			
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
			EefPrimerPackage.eINSTANCE.getResource_Name(),
			EefPrimerPackage.eINSTANCE.getEmployee_MasteredSkills(),
			EefPrimerPackage.eINSTANCE.getEmployee_BirthDate()		);
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
				if (EefprimerViewsRepository.Employee.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EefPrimerPackage.eINSTANCE.getResource_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefPrimerPackage.eINSTANCE.getResource_Name().getEAttributeType(), newValue);
				}
				if (EefprimerViewsRepository.Employee.Properties.customElementEditorEmployeeBirthDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EefPrimerPackage.eINSTANCE.getEmployee_BirthDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefPrimerPackage.eINSTANCE.getEmployee_BirthDate().getEAttributeType(), newValue);
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
