package com.finalKeyword;

//The type Employee cannot subclass/extends the final class Organization
 public class Employee { 
       
    //variables
    int id;
    String name;
    double salary;
    
    static String deptname;
    
    //constructor  
    public Employee() {    
    	id=2978;
    	name="Ayesha";
    	salary=8568.98;
    }
    
	//blocks
    static {
    	deptname="Development";
    }
    //methods
    public void getinfo()
    {
        /**
         * Cannot override the final method from Organization
         */
         
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
    	System.out.println("=================");
    	Organization organization=new Organization();
    	organization.getinfo();
    }
}
