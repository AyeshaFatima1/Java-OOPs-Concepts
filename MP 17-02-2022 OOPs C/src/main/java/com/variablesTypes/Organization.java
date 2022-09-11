package com.variablesTypes;

public class Organization {
 
	//Variables:
	
		/**
		 * non-static/instance/object variables: the variables which are not declared with static keyword
		 * ====================================
		 * 
		 * 1. to call these variables we need object creation.
		 */
		
		int organizationId;
		String organizationName;
		
		/**
		 * 
		 * static/class variables: the variables which are declared with static keyword.
		 * ======================
		 * 
		 * 1. to call these variables we do not need object creation
		 */
		
		static String orgType = "Information Technology";
		
		public Organization(int organizationId, String organizationName) 
		{
			this.organizationId = organizationId;
			this.organizationName = organizationName;
		}
		
	public static void main(String[] args) {
		
    Organization organization1 = new Organization(4562, "Google");
		
		System.out.println(organization1.organizationId);
		System.out.println(organization1.organizationName);
		System.out.println(Organization.orgType);
		
		System.out.println("====================");
		
		Organization organization2 = new Organization(2367, "IBM");
		
		System.out.println(organization2.organizationId);
		System.out.println(organization2.organizationName);
		System.out.println(Organization.orgType);
		
		
	}

}
