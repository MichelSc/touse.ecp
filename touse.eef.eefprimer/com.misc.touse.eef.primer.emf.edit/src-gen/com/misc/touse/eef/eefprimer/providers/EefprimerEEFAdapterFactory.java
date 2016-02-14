/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.providers;

import com.misc.touse.eef.eefprimer.util.EefPrimerAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;

/**
 * 
 * 
 */
public class EefprimerEEFAdapterFactory extends EefPrimerAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see com.misc.touse.eef.eefprimer.util.EefPrimerAdapterFactory#createDomainAdapter()
	 * 
	 */
	public Adapter createDomainAdapter() {
		return new DomainPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.misc.touse.eef.eefprimer.util.EefPrimerAdapterFactory#createEmployeeAdapter()
	 * 
	 */
	public Adapter createEmployeeAdapter() {
		return new EmployeePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.misc.touse.eef.eefprimer.util.EefPrimerAdapterFactory#createMachineAdapter()
	 * 
	 */
	public Adapter createMachineAdapter() {
		return new MachinePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.misc.touse.eef.eefprimer.util.EefPrimerAdapterFactory#createOrderAdapter()
	 * 
	 */
	public Adapter createOrderAdapter() {
		return new OrderPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.misc.touse.eef.eefprimer.util.EefPrimerAdapterFactory#createProductAdapter()
	 * 
	 */
	public Adapter createProductAdapter() {
		return new ProductPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.misc.touse.eef.eefprimer.util.EefPrimerAdapterFactory#createProductSkillAdapter()
	 * 
	 */
	public Adapter createProductSkillAdapter() {
		return new ProductSkillPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.misc.touse.eef.eefprimer.util.EefPrimerAdapterFactory#createSkillAdapter()
	 * 
	 */
	public Adapter createSkillAdapter() {
		return new SkillPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.misc.touse.eef.eefprimer.util.EefPrimerAdapterFactory#createEmployeeSkillAdapter()
	 * 
	 */
	public Adapter createEmployeeSkillAdapter() {
		return new EmployeeSkillPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.misc.touse.eef.eefprimer.util.EefPrimerAdapterFactory#createOrderProductAdapter()
	 * 
	 */
	public Adapter createOrderProductAdapter() {
		return new OrderProductPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.misc.touse.eef.eefprimer.util.EefPrimerAdapterFactory#createPlanAdapter()
	 * 
	 */
	public Adapter createPlanAdapter() {
		return new PlanPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see com.misc.touse.eef.eefprimer.util.EefPrimerAdapterFactory#createResourceAvailableAdapter()
	 * 
	 */
	public Adapter createResourceAvailableAdapter() {
		return new ResourceAvailablePropertiesEditionProvider();
	}

}
