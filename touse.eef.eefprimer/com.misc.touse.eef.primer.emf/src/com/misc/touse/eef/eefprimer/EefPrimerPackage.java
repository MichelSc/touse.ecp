/**
 */
package com.misc.touse.eef.eefprimer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.misc.touse.eef.eefprimer.EefPrimerFactory
 * @model kind="package"
 * @generated
 */
public interface EefPrimerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eefprimer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.misc.com/touse/eef/eefprimer/model/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eef";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EefPrimerPackage eINSTANCE = com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.misc.touse.eef.eefprimer.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.eef.eefprimer.impl.DomainImpl
	 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__RESOURCES = 0;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SKILLS = 1;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PRODUCTS = 2;

	/**
	 * The feature id for the '<em><b>Plans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PLANS = 3;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.eef.eefprimer.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.eef.eefprimer.impl.ResourceImpl
	 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.eef.eefprimer.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.eef.eefprimer.impl.EmployeeImpl
	 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Mastered Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__MASTERED_SKILLS = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__BIRTH_DATE = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.eef.eefprimer.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.eef.eefprimer.impl.MachineImpl
	 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__COLOR = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.eef.eefprimer.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.eef.eefprimer.impl.OrderImpl
	 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ID = 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PRODUCTS = 1;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__DUE_DATE = 2;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.eef.eefprimer.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.eef.eefprimer.impl.ProductImpl
	 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 5;

	/**
	 * The feature id for the '<em><b>Required Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__REQUIRED_SKILLS = 0;

	/**
	 * The feature id for the '<em><b>Required Machines</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__REQUIRED_MACHINES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Production Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCTION_HOURS = 3;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.eef.eefprimer.impl.ProductSkillImpl <em>Product Skill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.eef.eefprimer.impl.ProductSkillImpl
	 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getProductSkill()
	 * @generated
	 */
	int PRODUCT_SKILL = 6;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SKILL__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Skill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SKILL__SKILL = 1;

	/**
	 * The number of structural features of the '<em>Product Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SKILL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Product Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_SKILL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.eef.eefprimer.impl.SkillImpl <em>Skill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.eef.eefprimer.impl.SkillImpl
	 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getSkill()
	 * @generated
	 */
	int SKILL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.eef.eefprimer.impl.EmployeeSkillImpl <em>Employee Skill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.eef.eefprimer.impl.EmployeeSkillImpl
	 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getEmployeeSkill()
	 * @generated
	 */
	int EMPLOYEE_SKILL = 8;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_SKILL__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Skill</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_SKILL__SKILL = 1;

	/**
	 * The number of structural features of the '<em>Employee Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_SKILL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Employee Skill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_SKILL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.eef.eefprimer.impl.OrderProductImpl <em>Order Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.eef.eefprimer.impl.OrderProductImpl
	 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getOrderProduct()
	 * @generated
	 */
	int ORDER_PRODUCT = 9;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PRODUCT__PRODUCT = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PRODUCT__QUANTITY = 1;

	/**
	 * The number of structural features of the '<em>Order Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PRODUCT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Order Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.eef.eefprimer.impl.PlanImpl <em>Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.eef.eefprimer.impl.PlanImpl
	 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getPlan()
	 * @generated
	 */
	int PLAN = 10;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__ID = 0;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__ORDERS = 1;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN__RESOURCES = 2;

	/**
	 * The number of structural features of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.misc.touse.eef.eefprimer.impl.ResourceAvailableImpl <em>Resource Available</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.misc.touse.eef.eefprimer.impl.ResourceAvailableImpl
	 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getResourceAvailable()
	 * @generated
	 */
	int RESOURCE_AVAILABLE = 11;

	/**
	 * The feature id for the '<em><b>Available From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AVAILABLE__AVAILABLE_FROM = 0;

	/**
	 * The feature id for the '<em><b>Available To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AVAILABLE__AVAILABLE_TO = 1;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AVAILABLE__RESOURCE = 2;

	/**
	 * The number of structural features of the '<em>Resource Available</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AVAILABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource Available</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_AVAILABLE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.misc.touse.eef.eefprimer.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see com.misc.touse.eef.eefprimer.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.eef.eefprimer.Domain#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see com.misc.touse.eef.eefprimer.Domain#getResources()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Resources();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.eef.eefprimer.Domain#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skills</em>'.
	 * @see com.misc.touse.eef.eefprimer.Domain#getSkills()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Skills();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.eef.eefprimer.Domain#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see com.misc.touse.eef.eefprimer.Domain#getProducts()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.eef.eefprimer.Domain#getPlans <em>Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plans</em>'.
	 * @see com.misc.touse.eef.eefprimer.Domain#getPlans()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Plans();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.eef.eefprimer.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see com.misc.touse.eef.eefprimer.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.eef.eefprimer.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.eef.eefprimer.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.eef.eefprimer.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see com.misc.touse.eef.eefprimer.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.eef.eefprimer.Employee#getMasteredSkills <em>Mastered Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mastered Skills</em>'.
	 * @see com.misc.touse.eef.eefprimer.Employee#getMasteredSkills()
	 * @see #getEmployee()
	 * @generated
	 */
	EReference getEmployee_MasteredSkills();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.eef.eefprimer.Employee#getBirthDate <em>Birth Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Date</em>'.
	 * @see com.misc.touse.eef.eefprimer.Employee#getBirthDate()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_BirthDate();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.eef.eefprimer.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see com.misc.touse.eef.eefprimer.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.eef.eefprimer.Machine#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see com.misc.touse.eef.eefprimer.Machine#getColor()
	 * @see #getMachine()
	 * @generated
	 */
	EAttribute getMachine_Color();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.eef.eefprimer.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see com.misc.touse.eef.eefprimer.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.eef.eefprimer.Order#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see com.misc.touse.eef.eefprimer.Order#getID()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.eef.eefprimer.Order#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see com.misc.touse.eef.eefprimer.Order#getProducts()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Products();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.eef.eefprimer.Order#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see com.misc.touse.eef.eefprimer.Order#getDueDate()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_DueDate();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.eef.eefprimer.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see com.misc.touse.eef.eefprimer.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.eef.eefprimer.Product#getRequiredSkills <em>Required Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Skills</em>'.
	 * @see com.misc.touse.eef.eefprimer.Product#getRequiredSkills()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_RequiredSkills();

	/**
	 * Returns the meta object for the reference list '{@link com.misc.touse.eef.eefprimer.Product#getRequiredMachines <em>Required Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Machines</em>'.
	 * @see com.misc.touse.eef.eefprimer.Product#getRequiredMachines()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_RequiredMachines();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.eef.eefprimer.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.eef.eefprimer.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.eef.eefprimer.Product#getProductionHours <em>Production Hours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Production Hours</em>'.
	 * @see com.misc.touse.eef.eefprimer.Product#getProductionHours()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_ProductionHours();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.eef.eefprimer.ProductSkill <em>Product Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Skill</em>'.
	 * @see com.misc.touse.eef.eefprimer.ProductSkill
	 * @generated
	 */
	EClass getProductSkill();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.eef.eefprimer.ProductSkill#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see com.misc.touse.eef.eefprimer.ProductSkill#getLevel()
	 * @see #getProductSkill()
	 * @generated
	 */
	EAttribute getProductSkill_Level();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.eef.eefprimer.ProductSkill#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Skill</em>'.
	 * @see com.misc.touse.eef.eefprimer.ProductSkill#getSkill()
	 * @see #getProductSkill()
	 * @generated
	 */
	EReference getProductSkill_Skill();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.eef.eefprimer.Skill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill</em>'.
	 * @see com.misc.touse.eef.eefprimer.Skill
	 * @generated
	 */
	EClass getSkill();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.eef.eefprimer.Skill#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.misc.touse.eef.eefprimer.Skill#getName()
	 * @see #getSkill()
	 * @generated
	 */
	EAttribute getSkill_Name();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.eef.eefprimer.EmployeeSkill <em>Employee Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee Skill</em>'.
	 * @see com.misc.touse.eef.eefprimer.EmployeeSkill
	 * @generated
	 */
	EClass getEmployeeSkill();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.eef.eefprimer.EmployeeSkill#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see com.misc.touse.eef.eefprimer.EmployeeSkill#getLevel()
	 * @see #getEmployeeSkill()
	 * @generated
	 */
	EAttribute getEmployeeSkill_Level();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.eef.eefprimer.EmployeeSkill#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Skill</em>'.
	 * @see com.misc.touse.eef.eefprimer.EmployeeSkill#getSkill()
	 * @see #getEmployeeSkill()
	 * @generated
	 */
	EReference getEmployeeSkill_Skill();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.eef.eefprimer.OrderProduct <em>Order Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Product</em>'.
	 * @see com.misc.touse.eef.eefprimer.OrderProduct
	 * @generated
	 */
	EClass getOrderProduct();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.eef.eefprimer.OrderProduct#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see com.misc.touse.eef.eefprimer.OrderProduct#getProduct()
	 * @see #getOrderProduct()
	 * @generated
	 */
	EReference getOrderProduct_Product();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.eef.eefprimer.OrderProduct#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see com.misc.touse.eef.eefprimer.OrderProduct#getQuantity()
	 * @see #getOrderProduct()
	 * @generated
	 */
	EAttribute getOrderProduct_Quantity();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.eef.eefprimer.Plan <em>Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plan</em>'.
	 * @see com.misc.touse.eef.eefprimer.Plan
	 * @generated
	 */
	EClass getPlan();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.eef.eefprimer.Plan#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see com.misc.touse.eef.eefprimer.Plan#getID()
	 * @see #getPlan()
	 * @generated
	 */
	EAttribute getPlan_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.eef.eefprimer.Plan#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orders</em>'.
	 * @see com.misc.touse.eef.eefprimer.Plan#getOrders()
	 * @see #getPlan()
	 * @generated
	 */
	EReference getPlan_Orders();

	/**
	 * Returns the meta object for the containment reference list '{@link com.misc.touse.eef.eefprimer.Plan#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resources</em>'.
	 * @see com.misc.touse.eef.eefprimer.Plan#getResources()
	 * @see #getPlan()
	 * @generated
	 */
	EReference getPlan_Resources();

	/**
	 * Returns the meta object for class '{@link com.misc.touse.eef.eefprimer.ResourceAvailable <em>Resource Available</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Available</em>'.
	 * @see com.misc.touse.eef.eefprimer.ResourceAvailable
	 * @generated
	 */
	EClass getResourceAvailable();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.eef.eefprimer.ResourceAvailable#getAvailableFrom <em>Available From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available From</em>'.
	 * @see com.misc.touse.eef.eefprimer.ResourceAvailable#getAvailableFrom()
	 * @see #getResourceAvailable()
	 * @generated
	 */
	EAttribute getResourceAvailable_AvailableFrom();

	/**
	 * Returns the meta object for the attribute '{@link com.misc.touse.eef.eefprimer.ResourceAvailable#getAvailableTo <em>Available To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Available To</em>'.
	 * @see com.misc.touse.eef.eefprimer.ResourceAvailable#getAvailableTo()
	 * @see #getResourceAvailable()
	 * @generated
	 */
	EAttribute getResourceAvailable_AvailableTo();

	/**
	 * Returns the meta object for the reference '{@link com.misc.touse.eef.eefprimer.ResourceAvailable#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource</em>'.
	 * @see com.misc.touse.eef.eefprimer.ResourceAvailable#getResource()
	 * @see #getResourceAvailable()
	 * @generated
	 */
	EReference getResourceAvailable_Resource();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EefPrimerFactory getEefPrimerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.misc.touse.eef.eefprimer.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.eef.eefprimer.impl.DomainImpl
		 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__RESOURCES = eINSTANCE.getDomain_Resources();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__SKILLS = eINSTANCE.getDomain_Skills();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__PRODUCTS = eINSTANCE.getDomain_Products();

		/**
		 * The meta object literal for the '<em><b>Plans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__PLANS = eINSTANCE.getDomain_Plans();

		/**
		 * The meta object literal for the '{@link com.misc.touse.eef.eefprimer.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.eef.eefprimer.impl.ResourceImpl
		 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '{@link com.misc.touse.eef.eefprimer.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.eef.eefprimer.impl.EmployeeImpl
		 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Mastered Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE__MASTERED_SKILLS = eINSTANCE.getEmployee_MasteredSkills();

		/**
		 * The meta object literal for the '<em><b>Birth Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__BIRTH_DATE = eINSTANCE.getEmployee_BirthDate();

		/**
		 * The meta object literal for the '{@link com.misc.touse.eef.eefprimer.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.eef.eefprimer.impl.MachineImpl
		 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACHINE__COLOR = eINSTANCE.getMachine_Color();

		/**
		 * The meta object literal for the '{@link com.misc.touse.eef.eefprimer.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.eef.eefprimer.impl.OrderImpl
		 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ID = eINSTANCE.getOrder_ID();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__PRODUCTS = eINSTANCE.getOrder_Products();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__DUE_DATE = eINSTANCE.getOrder_DueDate();

		/**
		 * The meta object literal for the '{@link com.misc.touse.eef.eefprimer.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.eef.eefprimer.impl.ProductImpl
		 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Required Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__REQUIRED_SKILLS = eINSTANCE.getProduct_RequiredSkills();

		/**
		 * The meta object literal for the '<em><b>Required Machines</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__REQUIRED_MACHINES = eINSTANCE.getProduct_RequiredMachines();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Production Hours</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__PRODUCTION_HOURS = eINSTANCE.getProduct_ProductionHours();

		/**
		 * The meta object literal for the '{@link com.misc.touse.eef.eefprimer.impl.ProductSkillImpl <em>Product Skill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.eef.eefprimer.impl.ProductSkillImpl
		 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getProductSkill()
		 * @generated
		 */
		EClass PRODUCT_SKILL = eINSTANCE.getProductSkill();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_SKILL__LEVEL = eINSTANCE.getProductSkill_Level();

		/**
		 * The meta object literal for the '<em><b>Skill</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_SKILL__SKILL = eINSTANCE.getProductSkill_Skill();

		/**
		 * The meta object literal for the '{@link com.misc.touse.eef.eefprimer.impl.SkillImpl <em>Skill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.eef.eefprimer.impl.SkillImpl
		 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getSkill()
		 * @generated
		 */
		EClass SKILL = eINSTANCE.getSkill();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL__NAME = eINSTANCE.getSkill_Name();

		/**
		 * The meta object literal for the '{@link com.misc.touse.eef.eefprimer.impl.EmployeeSkillImpl <em>Employee Skill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.eef.eefprimer.impl.EmployeeSkillImpl
		 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getEmployeeSkill()
		 * @generated
		 */
		EClass EMPLOYEE_SKILL = eINSTANCE.getEmployeeSkill();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE_SKILL__LEVEL = eINSTANCE.getEmployeeSkill_Level();

		/**
		 * The meta object literal for the '<em><b>Skill</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPLOYEE_SKILL__SKILL = eINSTANCE.getEmployeeSkill_Skill();

		/**
		 * The meta object literal for the '{@link com.misc.touse.eef.eefprimer.impl.OrderProductImpl <em>Order Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.eef.eefprimer.impl.OrderProductImpl
		 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getOrderProduct()
		 * @generated
		 */
		EClass ORDER_PRODUCT = eINSTANCE.getOrderProduct();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_PRODUCT__PRODUCT = eINSTANCE.getOrderProduct_Product();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_PRODUCT__QUANTITY = eINSTANCE.getOrderProduct_Quantity();

		/**
		 * The meta object literal for the '{@link com.misc.touse.eef.eefprimer.impl.PlanImpl <em>Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.eef.eefprimer.impl.PlanImpl
		 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getPlan()
		 * @generated
		 */
		EClass PLAN = eINSTANCE.getPlan();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAN__ID = eINSTANCE.getPlan_ID();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN__ORDERS = eINSTANCE.getPlan_Orders();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAN__RESOURCES = eINSTANCE.getPlan_Resources();

		/**
		 * The meta object literal for the '{@link com.misc.touse.eef.eefprimer.impl.ResourceAvailableImpl <em>Resource Available</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.misc.touse.eef.eefprimer.impl.ResourceAvailableImpl
		 * @see com.misc.touse.eef.eefprimer.impl.EefPrimerPackageImpl#getResourceAvailable()
		 * @generated
		 */
		EClass RESOURCE_AVAILABLE = eINSTANCE.getResourceAvailable();

		/**
		 * The meta object literal for the '<em><b>Available From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_AVAILABLE__AVAILABLE_FROM = eINSTANCE.getResourceAvailable_AvailableFrom();

		/**
		 * The meta object literal for the '<em><b>Available To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_AVAILABLE__AVAILABLE_TO = eINSTANCE.getResourceAvailable_AvailableTo();

		/**
		 * The meta object literal for the '<em><b>Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_AVAILABLE__RESOURCE = eINSTANCE.getResourceAvailable_Resource();

	}

} //EefPrimerPackage
