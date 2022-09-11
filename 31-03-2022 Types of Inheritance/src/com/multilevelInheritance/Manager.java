package com.multilevelInheritance;

class Learner{
	int id;
	String name;
	String course;
	public Learner() {
	 id=501;
	 name="Ayesha";
	 course="Java";
	}
	public void getLinfo() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(course);
	}
}
class Trainer extends Learner{
	int tId;
	String tName;
	public Trainer() {
		tId=171;
		tName="Pooja";
	}
	public void getTinfo() {
		System.out.println(tName);
	}
}
public class Manager extends Trainer  {
  String mName;
  public Manager(String mName) {
	  this.mName=mName;
  }
  public void getMinfo() {
	  System.out.println(mName);
  }
	public static void main(String[] args) {
		Learner ln=new Learner();
		ln.getLinfo();
		Trainer tr=new Trainer();
		tr.getTinfo();
		Manager mn=new Manager("Hafsa");
		mn.getMinfo();
	}
}
