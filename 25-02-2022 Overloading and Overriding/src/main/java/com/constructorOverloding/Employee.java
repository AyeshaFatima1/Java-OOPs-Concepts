package com.constructorOverloding;


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
    
    public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//blocks
    static {
    	deptname="Development";
    }
    //methods(behavior) without parameters
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
    	Employee employee1=new Employee();
    	employee1.getinfo();
    	System.out.println("================");
    	Employee employee2=new Employee(456,"Ayesha",57558.76);
    	employee2.getinfo();
    }
}
