package com.hierarchicalnheritance;

class Trainer{
	String name;
	public Trainer() {
		name="Pooja";
	}
		public void getInfo() {
		System.out.println("Trainer name:"+name);
		System.out.println("****************************");
	}
}
class Learner1 extends Trainer{
	int lId;
	String lName;
	String lCourse;
	public Learner1(int lId, String lName, String lCourse) {
		super();
		this.lId = lId;
		this.lName = lName;
		this.lCourse = lCourse;
	}
   public void getl1Info() {
	   System.out.println(lId);
	   System.out.println(lName);
	   System.out.println(lCourse); 
	   System.out.println("****************************");
   }
}
class Learner2 extends Trainer{
	int lId;
	String lName;
	String lCourse;
	public Learner2(int lId, String lName, String lCourse) {
		super();
		this.lId = lId;
		this.lName = lName;
		this.lCourse = lCourse;
	}
   public void getl2Info() {
	   System.out.println(lId);
	   System.out.println(lName);
	   System.out.println(lCourse);
	   System.out.println("****************************");
   }
}
public class Learner3 extends Trainer {
	int lId;
	String lName;
	String lCourse;
	public Learner3(int lId, String lName, String lCourse) {
		super();
		this.lId = lId;
		this.lName = lName;
		this.lCourse = lCourse;
	}
   public void getl3Info() {
	   System.out.println(lId);
	   System.out.println(lName);
	   System.out.println(lCourse); 
	   System.out.println("****************************");
   }
	public static void main(String[] args) {
		Trainer tr=new Trainer();
		tr.getInfo();
		Learner1 l1=new Learner1(121, "Ayesha", "Java");
		l1.getl1Info();
		Learner2 l2=new Learner2(122, "Pavani", "Java");
		l2.getl2Info();
		Learner3 l3=new Learner3(123, "Sanvi", "Java");
		l3.getl3Info();
	}

}
