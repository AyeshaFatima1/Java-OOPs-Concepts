package com.thisKeyword;

//this keyword: class fields/variables we can differentiate from parameters of constructors/methods
public class Employee 
{
    //state(variables)
	int id;
	String name;
	double salary;
	String address;
	
	public Employee( int id1, String name1, double salary1, String address1) 
	{
		this.id=id1;
		this.name=name1;
		this.salary=salary1;
		this.address=address1;
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
    	
    	Employee employee11=new Employee(11,"Ayesha",90675.89,"Delhi");
    	employee11.getInfo();
    	
    	System.out.println("======================================");
    	
    	Employee employee12=new Employee(12,"Neha",80675.89,"Hyderabad");
    	employee12.getInfo();
    }
}
