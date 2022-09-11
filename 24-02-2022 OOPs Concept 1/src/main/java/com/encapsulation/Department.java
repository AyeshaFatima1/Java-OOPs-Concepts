package com.encapsulation;

/**
 * 
 * Encapsulation:The process of binding of variables(state) and  
 * ============= methods(behavior) in a single unit
 * 
 */
 public class Department { 
 
    //variables
    int Id;
    String Name;
   
    static String organizationName;
    
    //constructors
    public Department() {    
    	Id=5678;
    	Name="Development";
    }
    //blocks
    static {
    	organizationName="Infosys";
    }
    //methods(behavior)
    public void getinfo() {
    	System.out.println(Id);
    	System.out.println(Name);
    	System.out.println(organizationName);
    }
    //main
    public static void main( String[] args )
    {
    //objects
    	Department department=new Department();
    	department.getinfo();
    }
}
