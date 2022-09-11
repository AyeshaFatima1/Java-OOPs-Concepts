package com.inheritance;

//super/base/parent class
public class Organization {
	int id;
	String name;
	
public Organization() {
	id=5678;
	name="Capgemini";
}

public void getorginfo() {
	System.out.println(id);
	System.out.println(name);	
	}

}
