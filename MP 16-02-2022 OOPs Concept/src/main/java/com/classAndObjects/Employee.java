package com.classAndObjects;

/**
 * class
 * =====
 * 
 * object
 * ======
 *
 */
public class Employee 
{
 //Generally class contains state(variables) and behavior(methods)
	
 //state(variables/Fields)
	int employeeId=345;
	String employeeName="Ayesha";
	double employeeSalary=75523.99;
	String employeeAddress="Hyderabad";
	
 //behavior(methods)
	public void getEmployeeDetails()
	{
	System.out.println(employeeId);
	System.out.println(employeeName);
	System.out.println(employeeSalary);
	System.out.println(employeeAddress);
	}
    public static void main( String[] args )
    {
    Employee employee1=new Employee();
    
 /**
  * From the line 31
  * 
  * 'Employee' is a class name
  * 
  * 'employee1' is an object reference
  * 
  * '=' assingment operator
  * 
  * 'new': it is a keyword, used to allocate memory(in RAM(heap)) to the object
  * 
  * 'Employee()': is a constructor, used to initialize object
  */
    
  System.out.println(employee1.hashCode());
    
   // employee1.getEmployeeDetails();
    }
}
