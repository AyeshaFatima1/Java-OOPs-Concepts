package com.finalKeyword;

//3.final keyword with class
// public final class Organization
public class Organization {

	//1.final keyword with variable
	// final int id=3549;
	int id;
	String name;
	
public Organization() {
	id=5678;//The final field Organization.id cannot be reassigned/modified
	name="Capgemini";
}
    //2. final keyword with method
	//public final void getinfo()
	//Cannot override the final method to sub class
public void getinfo()
{
	System.out.println(id);
	System.out.println(name);	
	}

}
