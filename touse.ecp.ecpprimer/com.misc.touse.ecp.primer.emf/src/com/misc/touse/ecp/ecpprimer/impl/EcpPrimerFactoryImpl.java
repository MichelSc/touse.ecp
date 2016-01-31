/**
 */
package com.misc.touse.ecp.ecpprimer.impl;

import com.misc.touse.ecp.ecpprimer.*;

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
public class EcpPrimerFactoryImpl extends EFactoryImpl implements EcpPrimerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcpPrimerFactory init() {
		try {
			EcpPrimerFactory theEcpPrimerFactory = (EcpPrimerFactory)EPackage.Registry.INSTANCE.getEFactory(EcpPrimerPackage.eNS_URI);
			if (theEcpPrimerFactory != null) {
				return theEcpPrimerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcpPrimerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcpPrimerFactoryImpl() {
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
			case EcpPrimerPackage.DOMAIN: return createDomain();
			case EcpPrimerPackage.RESOURCE: return createResource();
			case EcpPrimerPackage.EMPLOYEE: return createEmployee();
			case EcpPrimerPackage.MACHINE: return createMachine();
			case EcpPrimerPackage.ORDER: return createOrder();
			case EcpPrimerPackage.PRODUCT: return createProduct();
			case EcpPrimerPackage.PRODUCT_SKILL: return createProductSkill();
			case EcpPrimerPackage.SKILL: return createSkill();
			case EcpPrimerPackage.EMPLOYEE_SKILL: return createEmployeeSkill();
			case EcpPrimerPackage.ORDER_PRODUCT: return createOrderProduct();
			case EcpPrimerPackage.PLAN: return createPlan();
			case EcpPrimerPackage.RESOURCE_AVAILABLE: return createResourceAvailable();
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
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
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
	public EcpPrimerPackage getEcpPrimerPackage() {
		return (EcpPrimerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcpPrimerPackage getPackage() {
		return EcpPrimerPackage.eINSTANCE;
	}

} //EcpPrimerFactoryImpl
