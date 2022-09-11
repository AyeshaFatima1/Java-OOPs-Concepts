package com.superMethod;

//sub/derived/child class
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
    	System.out.println("Employee class constructor");
    }
	//blocks
    static {
    	deptname="Development";
    }
    //methods
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
    	Organization organization=new Organization();
    }
}
