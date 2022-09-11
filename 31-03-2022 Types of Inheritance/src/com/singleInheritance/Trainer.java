package com.singleInheritance;

class Learner {
	 int lid;
	 String lname;
	 String lcourse;
	 public Learner() {
		 lid=102;
		 lname="Ayesha";
		 lcourse="JFS";
	 }
	 public void getLinfo() {
		 System.out.println(lid);
		 System.out.println(lname);
		 System.out.println(lcourse);
	 }
	}
	public class Trainer extends Learner{
			int tid;
			String tname;
			
			public Trainer(int tid, String tname) {
				this.tid = tid;
				this.tname = tname;
			}
		public void getTinfo() {
			System.out.println(tid);
			System.out.println(tname);
		}

		public static void main(String[] args) {
		
	        Learner l=new Learner();
	        l.getLinfo();
	        
	        System.out.println("===============");

	        Trainer t=new Trainer(11,"Sona");
			t.getTinfo();

	    }

	}