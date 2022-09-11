package com.constructorTypes;

public class Employee 
{
    //state(variables)
	int id;
	String name;
	double salary;
	String address;
	
	/**
	 * Constructor:constructor is a block,used to initialize an object.
	 * 1.Constructor name and class name is same.
	 * 2.Constructor do not have return type.
	 * 3.In java we have two types of constructors
	 *   =>default/zero-parameterized constructor
	 *   =>parameterized constructor
	 * 
	 */
	public Employee() {
	id=2345;
	name="Fatima";
	salary=89675.89;
	address="Mumbai";
	}
	public Employee( int id1, String name1, double salary1, String address1) 
	{
		id=id1;
		name=name1;
		salary=salary1;
		address=address1;
		}
	//methods/behavior
	public void getInfo()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(address);

	}
    public static void main( String[] args )
    {
    	Employee employee1=new Employee();
    	employee1.getInfo();
        //System.out.println(employee1.hashCode());
    	
    	System.out.println("====================");
    	
    	Employee employee2=new Employee();
    	employee2.getInfo();
        //System.out.println(employee1.hashCode());
    	
    	System.out.println("--------------------------");
    	
    	Employee employee11=new Employee(11,"Ayesha",90675.89,"Delhi");
    	employee11.getInfo();
    	
    	Employee employee12=new Employee(12,"Neha",80675.89,"Hyderabad");
    	employee12.getInfo();
    }
}
