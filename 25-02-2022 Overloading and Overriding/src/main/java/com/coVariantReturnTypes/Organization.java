package com.coVariantReturnTypes;

//super/base/parent class
public class Organization {
	
	int id;
	String name;
	
public Organization() {
	id=5678;
	name="Capgemini";
}
//here return type is Organization
public Organization getinfo() {
	System.out.println(id);
	System.out.println(name);
	return null;
	}

}
