/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.providers;

import com.misc.touse.eef.eefprimer.parts.EefprimerViewsRepository;

import com.misc.touse.eef.eefprimer.parts.forms.DomainPropertiesEditionPartForm;
import com.misc.touse.eef.eefprimer.parts.forms.EmployeePropertiesEditionPartForm;
import com.misc.touse.eef.eefprimer.parts.forms.EmployeeSkillPropertiesEditionPartForm;
import com.misc.touse.eef.eefprimer.parts.forms.MachinePropertiesEditionPartForm;
import com.misc.touse.eef.eefprimer.parts.forms.OrderProductPropertiesEditionPartForm;
import com.misc.touse.eef.eefprimer.parts.forms.OrderPropertiesEditionPartForm;
import com.misc.touse.eef.eefprimer.parts.forms.PlanPropertiesEditionPartForm;
import com.misc.touse.eef.eefprimer.parts.forms.ProductPropertiesEditionPartForm;
import com.misc.touse.eef.eefprimer.parts.forms.ProductSkillPropertiesEditionPartForm;
import com.misc.touse.eef.eefprimer.parts.forms.ResourceAvailablePropertiesEditionPartForm;
import com.misc.touse.eef.eefprimer.parts.forms.SkillPropertiesEditionPartForm;

import com.misc.touse.eef.eefprimer.parts.impl.DomainPropertiesEditionPartImpl;
import com.misc.touse.eef.eefprimer.parts.impl.EmployeePropertiesEditionPartImpl;
import com.misc.touse.eef.eefprimer.parts.impl.EmployeeSkillPropertiesEditionPartImpl;
import com.misc.touse.eef.eefprimer.parts.impl.MachinePropertiesEditionPartImpl;
import com.misc.touse.eef.eefprimer.parts.impl.OrderProductPropertiesEditionPartImpl;
import com.misc.touse.eef.eefprimer.parts.impl.OrderPropertiesEditionPartImpl;
import com.misc.touse.eef.eefprimer.parts.impl.PlanPropertiesEditionPartImpl;
import com.misc.touse.eef.eefprimer.parts.impl.ProductPropertiesEditionPartImpl;
import com.misc.touse.eef.eefprimer.parts.impl.ProductSkillPropertiesEditionPartImpl;
import com.misc.touse.eef.eefprimer.parts.impl.ResourceAvailablePropertiesEditionPartImpl;
import com.misc.touse.eef.eefprimer.parts.impl.SkillPropertiesEditionPartImpl;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

/**
 * 
 * 
 */
public class EefprimerPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == EefprimerViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == EefprimerViewsRepository.Domain.class) {
			if (kind == EefprimerViewsRepository.SWT_KIND)
				return new DomainPropertiesEditionPartImpl(component);
			if (kind == EefprimerViewsRepository.FORM_KIND)
				return new DomainPropertiesEditionPartForm(component);
		}
		if (key == EefprimerViewsRepository.Employee.class) {
			if (kind == EefprimerViewsRepository.SWT_KIND)
				return new EmployeePropertiesEditionPartImpl(component);
			if (kind == EefprimerViewsRepository.FORM_KIND)
				return new EmployeePropertiesEditionPartForm(component);
		}
		if (key == EefprimerViewsRepository.Machine.class) {
			if (kind == EefprimerViewsRepository.SWT_KIND)
				return new MachinePropertiesEditionPartImpl(component);
			if (kind == EefprimerViewsRepository.FORM_KIND)
				return new MachinePropertiesEditionPartForm(component);
		}
		if (key == EefprimerViewsRepository.Order.class) {
			if (kind == EefprimerViewsRepository.SWT_KIND)
				return new OrderPropertiesEditionPartImpl(component);
			if (kind == EefprimerViewsRepository.FORM_KIND)
				return new OrderPropertiesEditionPartForm(component);
		}
		if (key == EefprimerViewsRepository.Product.class) {
			if (kind == EefprimerViewsRepository.SWT_KIND)
				return new ProductPropertiesEditionPartImpl(component);
			if (kind == EefprimerViewsRepository.FORM_KIND)
				return new ProductPropertiesEditionPartForm(component);
		}
		if (key == EefprimerViewsRepository.ProductSkill.class) {
			if (kind == EefprimerViewsRepository.SWT_KIND)
				return new ProductSkillPropertiesEditionPartImpl(component);
			if (kind == EefprimerViewsRepository.FORM_KIND)
				return new ProductSkillPropertiesEditionPartForm(component);
		}
		if (key == EefprimerViewsRepository.Skill.class) {
			if (kind == EefprimerViewsRepository.SWT_KIND)
				return new SkillPropertiesEditionPartImpl(component);
			if (kind == EefprimerViewsRepository.FORM_KIND)
				return new SkillPropertiesEditionPartForm(component);
		}
		if (key == EefprimerViewsRepository.EmployeeSkill.class) {
			if (kind == EefprimerViewsRepository.SWT_KIND)
				return new EmployeeSkillPropertiesEditionPartImpl(component);
			if (kind == EefprimerViewsRepository.FORM_KIND)
				return new EmployeeSkillPropertiesEditionPartForm(component);
		}
		if (key == EefprimerViewsRepository.OrderProduct.class) {
			if (kind == EefprimerViewsRepository.SWT_KIND)
				return new OrderProductPropertiesEditionPartImpl(component);
			if (kind == EefprimerViewsRepository.FORM_KIND)
				return new OrderProductPropertiesEditionPartForm(component);
		}
		if (key == EefprimerViewsRepository.Plan.class) {
			if (kind == EefprimerViewsRepository.SWT_KIND)
				return new PlanPropertiesEditionPartImpl(component);
			if (kind == EefprimerViewsRepository.FORM_KIND)
				return new PlanPropertiesEditionPartForm(component);
		}
		if (key == EefprimerViewsRepository.ResourceAvailable.class) {
			if (kind == EefprimerViewsRepository.SWT_KIND)
				return new ResourceAvailablePropertiesEditionPartImpl(component);
			if (kind == EefprimerViewsRepository.FORM_KIND)
				return new ResourceAvailablePropertiesEditionPartForm(component);
		}
		return null;
	}

}
