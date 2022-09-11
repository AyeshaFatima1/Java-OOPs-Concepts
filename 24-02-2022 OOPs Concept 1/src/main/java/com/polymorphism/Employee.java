package com.polymorphism;

/**
 * 
 * Polymorphism: One entity in many forms
 * 
 */
//sub/derived/child class
 public class Employee extends Organization { 
		
    //variables
    double salary;
    
    static String deptname;
    
    //constructors
    public Employee() {    
      id=2978;
      name="Ayesha";
      salary=8568.98;
    }
    //blocks
    static {
    	deptname="Development";
    }
    //methods(behavior)
    public void getinfo()//overrides com.polymorphism.Organization.getInformation()
	{
    	System.out.println(id);
    	System.out.println(name);
    	System.out.println(salary);
    	System.out.println(deptname);
    }
    //main
    public static void main( String[] args )
    {
    //objects
    	Employee employee=new Employee();
    	employee.getinfo();
    	System.out.println("================");
    	Organization organization=new Organization();
    	organization.getinfo();
    }
}
