package com.classAndObjects;

/**
 * class
 * =====
 * 
 * object
 * ======
 *
 */
public class Customer 
{
 //Generally class contains state(variables) and behavior(methods)
	
 //state(variables/Fields)
	int CustomerId=345;
	String CustomerName="Ayesha";
    String CustomerAddress="Hyderabad";	
 //behavior(methods)
	public void getcustomerDetails()
	{
	System.out.println(CustomerId);
	System.out.println(CustomerName);
	System.out.println(CustomerAddress);
	}
    public static void main( String[] args )
    {
    Customer customer1=new Customer();
    
    Customer customer2=new Customer();
    
 
    /* System.out.println(customer1.hashCode());
   
     System.out.println(customer2.hashCode());*/
  
    customer2.getcustomerDetails();
    }
}
