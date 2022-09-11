package com.constructorChaining;

//constructors
public class Employee 
{
    //state(variables)
	int id;
	String name;
	double salary;
	String address;
	
	//default
	public Employee() 
	{
		this(12,"Neha",80675.89,"Hyderabad");//default constructor is calling parameterized constructor
		id=2345;
		name="Fatima";
		salary=89675.89;
		address="Mumbai";
		System.out.println("Default");
		}
	
	//parameterized
	public Employee( int id1, String name1, double salary1, String address1) 
	{
		//Constructor call must be the first statement in a constructor
		//this();//parameterized constructor is calling default constructor
		this.id=id1;
		this.name=name1;
		this.salary=salary1;
		this.address=address1;
		System.out.println("Parameterized");
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
    	
    	System.out.println("======================================");
    	
    	Employee employee12=new Employee(12,"Neha",80675.89,"Hyderabad");
    	
    }
}
