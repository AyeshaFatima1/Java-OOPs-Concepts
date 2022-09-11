package com.hybridInheritance;

class Manager  {
	String mName;
    public Manager() {
    	mName="Rajesh";
	}
    public void getMinfo() {
	  System.out.println(mName);
	}
}
class Trainer1 extends Manager{
	int id;
	String name;
	public Trainer1() {
		id=150;
		name="Namdev";
	}
	public void getT1info() {
		System.out.println(name);
	}
}
class Trainer2 extends Manager{
	int id;
	String name;
	public Trainer2() {
		id=159;
		name="Pooja";
	}
	public void getT2info() {
		System.out.println(name);
	}
}
public class Learner extends Trainer1 {
  int id;
  String name;
  String course;
	public Learner(int id, String name, String course) {
	super();
	this.id = id;
	this.name = name;
	this.course = course;
  }
  public void getlInfo() {
	 System.out.println(id); 
	 System.out.println(name);
	 System.out.println(course);
  }
	public static void main(String[] args) {
		Manager m=new Manager();
		m.getMinfo();
		System.out.println("----------------------");
		Trainer1 t1=new Trainer1();
		t1.getT1info();
		System.out.println("----------------------");
		Trainer2 t2=new Trainer2();
		t2.getT2info();
		System.out.println("----------------------");
		Learner l=new Learner(11, "Ayesha", "Python");
		l.getlInfo();
	}

}
