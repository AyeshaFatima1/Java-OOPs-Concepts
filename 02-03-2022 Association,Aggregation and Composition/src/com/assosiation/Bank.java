package com.assosiation;
//class 1
 class Bank {
//variables
	private String name;
	
//constructor
	public Bank() {
			
		}
  public Bank(String name) {
	this.name = name;
}
//method of class Bank
  public String getBankname(){
  	return this.name;
  }
	// main method
		 public static void main(String[] args) {
			
		//creating an objects of bank and employee class
			 Bank bank=new Bank("SBI");
			 
			 Employee1 emp=new Employee1("Ayesha");
			
  System.out.println(emp.getEmployee1name() + " is employee of "+ bank.getBankname());
		}

}
