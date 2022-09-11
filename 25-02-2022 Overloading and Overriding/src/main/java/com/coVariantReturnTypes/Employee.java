package com.coVariantReturnTypes;

//sub/derived/child class
 public class Employee { 
       
    //variables
    int id;
    String name;
    double salary;
    
    static String deptname;
    
    //constructor without parameter 
    public Employee() {    
    	id=2978;
    	name="Ayesha";
    	salary=8568.98;
    }
    
	//blocks
    static {
    	deptname="Development";
    }
    //methods without parameters
    public Employee getinfo()//overrides com.polymorphism.Organization.getInformation()
    {
    /**
	 * The return type is incompatible with Organization.getInformation()
	 */
    	System.out.println(id);
    	System.out.println(name);
    	System.out.println(salary);
    	System.out.println(deptname);
    	return null;
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
