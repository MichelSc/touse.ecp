/**
 */
package com.misc.touse.eef.eefprimer.impl;

import com.misc.touse.eef.eefprimer.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EefPrimerFactoryImpl extends EFactoryImpl implements EefPrimerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EefPrimerFactory init() {
		try {
			EefPrimerFactory theEefPrimerFactory = (EefPrimerFactory)EPackage.Registry.INSTANCE.getEFactory(EefPrimerPackage.eNS_URI);
			if (theEefPrimerFactory != null) {
				return theEefPrimerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EefPrimerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EefPrimerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EefPrimerPackage.DOMAIN: return createDomain();
			case EefPrimerPackage.EMPLOYEE: return createEmployee();
			case EefPrimerPackage.MACHINE: return createMachine();
			case EefPrimerPackage.ORDER: return createOrder();
			case EefPrimerPackage.PRODUCT: return createProduct();
			case EefPrimerPackage.PRODUCT_SKILL: return createProductSkill();
			case EefPrimerPackage.SKILL: return createSkill();
			case EefPrimerPackage.EMPLOYEE_SKILL: return createEmployeeSkill();
			case EefPrimerPackage.ORDER_PRODUCT: return createOrderProduct();
			case EefPrimerPackage.PLAN: return createPlan();
			case EefPrimerPackage.RESOURCE_AVAILABLE: return createResourceAvailable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine createMachine() {
		MachineImpl machine = new MachineImpl();
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductSkill createProductSkill() {
		ProductSkillImpl productSkill = new ProductSkillImpl();
		return productSkill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Skill createSkill() {
		SkillImpl skill = new SkillImpl();
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployeeSkill createEmployeeSkill() {
		EmployeeSkillImpl employeeSkill = new EmployeeSkillImpl();
		return employeeSkill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderProduct createOrderProduct() {
		OrderProductImpl orderProduct = new OrderProductImpl();
		return orderProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plan createPlan() {
		PlanImpl plan = new PlanImpl();
		return plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAvailable createResourceAvailable() {
		ResourceAvailableImpl resourceAvailable = new ResourceAvailableImpl();
		return resourceAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EefPrimerPackage getEefPrimerPackage() {
		return (EefPrimerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EefPrimerPackage getPackage() {
		return EefPrimerPackage.eINSTANCE;
	}

} //EefPrimerFactoryImpl
