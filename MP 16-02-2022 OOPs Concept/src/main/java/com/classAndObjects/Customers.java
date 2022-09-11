package com.classAndObjects;

/**
 * class
 * =====
 * 
 * object
 * ======
 *
 */
public class Customers 
{
 //Generally class contains state(variables) and behavior(methods)
	
 //state(variables/Fields)
	int customerId;
	String customerName;
    String customerAddress;
    
 public Customers(int customerId1,String customerName1,String customerAddress1)
 {
	customerId=customerId1;
	customerName=customerName1;
	customerAddress=customerAddress1;

 }
 //behavior(methods)
	public void getcustomerDetails()
	{
	System.out.println(customerId);
	System.out.println(customerName);
	System.out.println(customerAddress);
	}
    public static void main( String[] args )
    {
    Customers customer1=new Customers(345,"Priya","Delhi");
    
    Customers customer2=new Customers(456,"Saba","Pune");
    
    Customers customer3=new Customers(876,"Ayesha","Hyderabad");

    
  /*
   * System.out.println(customer1.hashCode());
   * 
   *System.out.println(customer2.hashCode());   
   *
   */
    
    customer1.getcustomerDetails();
    
    System.out.println("=======================");
    
    customer2.getcustomerDetails();

    System.out.println("=======================");
    
    customer3.getcustomerDetails();

    }
}
