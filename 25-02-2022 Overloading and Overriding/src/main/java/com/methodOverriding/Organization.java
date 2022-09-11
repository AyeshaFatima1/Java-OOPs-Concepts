package com.methodOverriding;

//super/base/parent class
public class Organization {
	int id;
	String name;
	
public Organization() {
	id=5678;
	name="Capgemini";
}

public void getinfo() {
	System.out.println(id);
	System.out.println(name);	
	}

}
