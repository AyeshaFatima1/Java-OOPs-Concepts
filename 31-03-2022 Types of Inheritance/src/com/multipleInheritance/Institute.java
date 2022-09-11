package com.multipleInheritance;

interface Trainer1{
    int id = 121;
	String name="Saba";
	
	//public void getT1Info();
	default void getTInfo() {
	System.out.println(id);
		System.out.println(name);
	}
}
class Trainer2{
	int id;
	String name;
	public Trainer2() {
		id=122;
		name="Neha";
	}
	public void getT2Info() {
		System.out.println(id);
		System.out.println(name);
	}
}
public class Institute extends Trainer2 implements Trainer1 {
	String name="edubridge";
	public void getIinfo() {
		System.out.println(name);
	}
	//implement method of interface 
	/*public void getT1Info() {
	}*/
	public static void main(String[] args) {
		Institute i=new Institute();
		i.getIinfo();
		System.out.println("**************");
		i.getTInfo();
		System.out.println("**************");
		i.getT2Info();
	}
}
