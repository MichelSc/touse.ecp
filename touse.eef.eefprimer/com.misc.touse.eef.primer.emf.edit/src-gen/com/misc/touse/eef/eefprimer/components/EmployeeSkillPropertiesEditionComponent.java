/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.components;

// Start of user code for imports
import com.misc.touse.eef.eefprimer.EefPrimerFactory;
import com.misc.touse.eef.eefprimer.EefPrimerPackage;
import com.misc.touse.eef.eefprimer.EmployeeSkill;
import com.misc.touse.eef.eefprimer.Skill;

import com.misc.touse.eef.eefprimer.parts.EefprimerViewsRepository;
import com.misc.touse.eef.eefprimer.parts.EmployeeSkillPropertiesEditionPart;

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
public class EmployeeSkillPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for Skill EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings skillSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public EmployeeSkillPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject employeeSkill, String editing_mode) {
		super(editingContext, employeeSkill, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EefprimerViewsRepository.class;
		partKey = EefprimerViewsRepository.EmployeeSkill.class;
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
			
			final EmployeeSkill employeeSkill = (EmployeeSkill)elt;
			final EmployeeSkillPropertiesEditionPart basePart = (EmployeeSkillPropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EefprimerViewsRepository.EmployeeSkill.Properties.level)) {
				basePart.setLevel(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, employeeSkill.getLevel()));
			}
			
			if (isAccessible(EefprimerViewsRepository.EmployeeSkill.Properties.skill)) {
				// init part
				skillSettings = new EObjectFlatComboSettings(employeeSkill, EefPrimerPackage.eINSTANCE.getEmployeeSkill_Skill());
				basePart.initSkill(skillSettings);
				// set the button mode
				basePart.setSkillButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			if (isAccessible(EefprimerViewsRepository.EmployeeSkill.Properties.skill)) {
				basePart.addFilterToSkill(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof Skill); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for Skill
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
		if (editorKey == EefprimerViewsRepository.EmployeeSkill.Properties.level) {
			return EefPrimerPackage.eINSTANCE.getEmployeeSkill_Level();
		}
		if (editorKey == EefprimerViewsRepository.EmployeeSkill.Properties.skill) {
			return EefPrimerPackage.eINSTANCE.getEmployeeSkill_Skill();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		EmployeeSkill employeeSkill = (EmployeeSkill)semanticObject;
		if (EefprimerViewsRepository.EmployeeSkill.Properties.level == event.getAffectedEditor()) {
			employeeSkill.setLevel((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (EefprimerViewsRepository.EmployeeSkill.Properties.skill == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				skillSettings.setToReference((Skill)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				Skill eObject = EefPrimerFactory.eINSTANCE.createSkill();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				skillSettings.setToReference(eObject);
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
			EmployeeSkillPropertiesEditionPart basePart = (EmployeeSkillPropertiesEditionPart)editingPart;
			if (EefPrimerPackage.eINSTANCE.getEmployeeSkill_Level().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EefprimerViewsRepository.EmployeeSkill.Properties.level)) {
				if (msg.getNewValue() != null) {
					basePart.setLevel(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setLevel("");
				}
			}
			if (EefPrimerPackage.eINSTANCE.getEmployeeSkill_Skill().equals(msg.getFeature()) && basePart != null && isAccessible(EefprimerViewsRepository.EmployeeSkill.Properties.skill))
				basePart.setSkill((EObject)msg.getNewValue());
			
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
			EefPrimerPackage.eINSTANCE.getEmployeeSkill_Level(),
			EefPrimerPackage.eINSTANCE.getEmployeeSkill_Skill()		);
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
				if (EefprimerViewsRepository.EmployeeSkill.Properties.level == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EefPrimerPackage.eINSTANCE.getEmployeeSkill_Level().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EefPrimerPackage.eINSTANCE.getEmployeeSkill_Level().getEAttributeType(), newValue);
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
