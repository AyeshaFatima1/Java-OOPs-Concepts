package com.methodTypes;

public class Organization {
	
	int organizationId;
	String organizationName;


	static String orgType = "Information Technology";

	public Organization(int organizationId, String organizationName) 
	{
		this.organizationId = organizationId;
		this.organizationName = organizationName;
	}
	//Methods:
	/**
	 * non-static/instance/object methods: the methods which are not declared with static keyword
	 * ==================================
	 * 
	 * 1. to call these methods we need object creation.
	 */
	
	public void getOrgInfo()
	{
		//these methods will support all variables
		System.out.println(organizationId);
		System.out.println(organizationName);
		System.out.println(orgType);
	}
	/**
	 * 
	 * static/class methods: the methods which are declared with static keyword.
	 * ====================
	 * 
	 * 1. to call these methods we do not need object creation.
	 */
	public static void getOrgType()
	{
		//these methods support only static variables
		System.out.println(orgType);
	}

	public static void main(String[] args) 
	{

		Organization organization1 = new Organization(7854, "Google");

		organization1.getOrgInfo();
		
		System.out.println("-----------------------");
		
		Organization.getOrgType();

		System.out.println("====================");

		Organization organization2 = new Organization(6743, "IBM");

		organization2.getOrgInfo();
		
		System.out.println("-----------------------");
		
		Organization.getOrgType();

	}

}
