package com.encapsulation;

/**
 * 
 * Encapsulation:The process of binding of variables(state) and  
 * ============= methods(behavior) in a single unit
 * 
 */
 public class Patient { 
 
    //variables
    int id;
    String name;
    double bill;
    
    static String consultantname;
    
    //constructors
    public Patient() {    
    	id=3478;
    	name="Shiree";
    	bill=68.98;
    }
    //blocks
    static {
    	consultantname="Divya";
    }
    //methods(behavior)
    public void getinfo() {
    	System.out.println(id);
    	System.out.println(name);
    	System.out.println(bill);
    	System.out.println(consultantname);
    }
    //main
    public static void main( String[] args )
    {
    //objects
    	Patient p=new Patient();
    	p.getinfo();
    }
}
