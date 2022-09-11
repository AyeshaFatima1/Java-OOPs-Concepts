package com.abstraction;
/**
 * 
 * Abstraction: The process of hiding the properties of one
 * ===========  class from another class.
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
    public void getinfo()
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
    	organization.getorginfo();
    }
}
