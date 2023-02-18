package com.app.google.interviewQ;

public class ObjectCount {
	
    public static void main(String[] args) {
    	Object obj=new Object();
    	Object obj2=obj;
    	System.out.println(obj);
    	System.out.println(obj2);
    	obj=null;
    	// how many object created and how many object elizable for garbage collection 
    	System.out.println(obj);
    	System.out.println(obj2);
    	
    	
		
	}
}
