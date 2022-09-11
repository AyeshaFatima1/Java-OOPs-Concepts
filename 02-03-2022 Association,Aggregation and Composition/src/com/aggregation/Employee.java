package com.aggregation;

public class Employee {
//Variables
	int id;  
	String name;  
	Address address;  
//Constructor
	public Employee(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
			}  
//method
	void display(){  
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);  
			}  
//main
	public static void main(String[] args) {  
		Address address1=new Address("Hyderabad","Telangana","India");  
		Address address2=new Address("Nizambad","Telangana","India");  
	//Objects
		Employee e=new Employee(101,"Ayesha",address1); 
		Employee e2=new Employee(102,"Sanvitha",address2);  
				      
		e.display();
				
		System.out.println("=========================");
				
		e2.display();
				      
				}  
		}
