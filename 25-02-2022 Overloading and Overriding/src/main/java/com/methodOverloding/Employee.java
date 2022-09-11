package com.methodOverloding;


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
    public void getinfo() {
    	System.out.println(id);
    	System.out.println(name);
    	System.out.println(salary);
    	System.out.println(deptname);
    }
    //methods with parameters
    public void getinfo(int id, String name, double salary) {
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
    	
    	employee.getinfo(678,"Alina",45678.89);
    }
}
