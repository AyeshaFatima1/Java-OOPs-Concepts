package com.inheritance;

/**
 * 
 * Inheritance: The process of reusing one class properties from the another class
 * ===========
 *
 */
//sub/derived/child class
 public class Employee extends Organization { 
        /**
		 * from the statement line 11 indicates that,
		 * 
		 * Employee is sub/derived/child class
		 * 
		 * and
		 * 
		 * Organization is super/base/parent class
		 * 
		 * Note: From Organization class id and name properties are reused by Employee class
		 */
		
    //variables
    int id;
    String name;
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
    public void getinfo() {
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
