/**
 * Generated with Acceleo
 */
package com.misc.touse.eef.eefprimer.parts;

/**
 * 
 * 
 */
public class EefprimerViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * Domain view descriptor
	 * 
	 */
	public static class Domain {
		public static class Properties {
	
			
			public static String resources = "eefprimer::Domain::properties::Resources";
			
			
			public static String skills = "eefprimer::Domain::properties::Skills";
			
			
			public static String products = "eefprimer::Domain::properties::Products";
			
			
			public static String plans = "eefprimer::Domain::properties::Plans";
			
	
		}
	
	}

	/**
	 * Employee view descriptor
	 * 
	 */
	public static class Employee {
		public static class Properties {
	
			
			public static String name = "eefprimer::Employee::properties::Name";
			
			
			public static String masteredSkills = "eefprimer::Employee::properties::MasteredSkills";
			
			// Start of user code for CustomElementEditor Employee BirthDate ElementEditor key
			public static String customElementEditorEmployeeBirthDate = "eefprimer::Employee::properties::CustomElementEditor Employee BirthDate";
			// End of user code
			
	
		}
	
	}

	/**
	 * Machine view descriptor
	 * 
	 */
	public static class Machine {
		public static class Properties {
	
			
			public static String name = "eefprimer::Machine::properties::Name";
			
			
			public static String color = "eefprimer::Machine::properties::Color";
			
	
		}
	
	}

	/**
	 * Order view descriptor
	 * 
	 */
	public static class Order {
		public static class Properties {
	
			
			public static String iD = "eefprimer::Order::properties::ID";
			
			
			public static String products = "eefprimer::Order::properties::Products";
			
			
			public static String dueDate = "eefprimer::Order::properties::DueDate";
			
	
		}
	
	}

	/**
	 * Product view descriptor
	 * 
	 */
	public static class Product {
		public static class Properties {
	
			
			public static String requiredSkills = "eefprimer::Product::properties::RequiredSkills";
			
			
			public static String requiredMachines = "eefprimer::Product::properties::RequiredMachines";
			
			
			public static String name = "eefprimer::Product::properties::Name";
			
			
			public static String productionHours = "eefprimer::Product::properties::ProductionHours";
			
	
		}
	
	}

	/**
	 * ProductSkill view descriptor
	 * 
	 */
	public static class ProductSkill {
		public static class Properties {
	
			
			public static String level = "eefprimer::ProductSkill::properties::Level";
			
			
			public static String skill = "eefprimer::ProductSkill::properties::Skill";
			
	
		}
	
	}

	/**
	 * Skill view descriptor
	 * 
	 */
	public static class Skill {
		public static class Properties {
	
			
			public static String name = "eefprimer::Skill::properties::Name";
			
	
		}
	
	}

	/**
	 * EmployeeSkill view descriptor
	 * 
	 */
	public static class EmployeeSkill {
		public static class Properties {
	
			
			public static String level = "eefprimer::EmployeeSkill::properties::Level";
			
			
			public static String skill = "eefprimer::EmployeeSkill::properties::Skill";
			
	
		}
	
	}

	/**
	 * OrderProduct view descriptor
	 * 
	 */
	public static class OrderProduct {
		public static class Properties {
	
			
			public static String product = "eefprimer::OrderProduct::properties::Product";
			
			
			public static String quantity = "eefprimer::OrderProduct::properties::Quantity";
			
	
		}
	
	}

	/**
	 * Plan view descriptor
	 * 
	 */
	public static class Plan {
		public static class Properties {
	
			
			public static String iD = "eefprimer::Plan::properties::ID";
			
			
			public static String orders = "eefprimer::Plan::properties::Orders";
			
			
			public static String resources = "eefprimer::Plan::properties::Resources";
			
	
		}
	
	}

	/**
	 * ResourceAvailable view descriptor
	 * 
	 */
	public static class ResourceAvailable {
		public static class Properties {
	
			
			public static String availableFrom = "eefprimer::ResourceAvailable::properties::AvailableFrom";
			
			
			public static String availableTo = "eefprimer::ResourceAvailable::properties::AvailableTo";
			
			
			public static String resource = "eefprimer::ResourceAvailable::properties::Resource";
			
	
		}
	
	}

}
