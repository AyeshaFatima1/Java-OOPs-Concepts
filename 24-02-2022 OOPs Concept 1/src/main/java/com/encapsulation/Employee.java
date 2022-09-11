package com.encapsulation;

/**
 * 
 * Encapsulation:The process of binding of variables(state) and  
 * ============= methods(behavior) in a single unit
 * 
 */
 public class Employee { 
 
    //variables
    int id;
    String name;
    double salary;
    
    static String deptname;
    
    //constructors
    public Employee() {    
    	id=3478;
    	name="Sana";
    	salary=7868.98;
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
    }
}
