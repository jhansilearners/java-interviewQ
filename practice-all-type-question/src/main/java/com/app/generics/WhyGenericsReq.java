package com.app.generics;

import java.util.ArrayList;
import java.util.List;

public class WhyGenericsReq {
    public static void main(String[] args) {
		/*
		 * if we have object class that can hold all type of element then why we need generic
		 * 
		 * 1) Generic main purpose provide strong type safety 
		 * 2) At run time we no need to type cast while getting object
		 * 3) we can implement generic algorithms 
		 * 
		 * 
		 * */
    	// here we are trying to get object 
    	try {
    	checkGenerics();
    	}catch(RuntimeException r){
    		System.out.println(r);
    	}finally {
		   System.out.println("inside finally");	
		}
    	// benifits of generic
    	usingGenerics();
    
	}
    public static  void checkGenerics() {
    	List l=new ArrayList();
    	l.add("test");
    	l.add(1);
    	l.add(new StringBuffer());
    	//String s=l.get(0);// giving ce:Type mismatch: cannot convert from Object to String
    	// to avoid this programmer is responsible for their type at run time so it is not generic
    	String s=(String)l.get(0);
    	System.out.println(s);
    	// here if programmer don't know runtime object then we will get runtime exception class cast exception 
        // for example 
    	String s2=(String)l.get(1);
    	System.out.println("-----------");
    	System.out.println(s2);// java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
    	System.out.println("-----------");
    	
    }
    
    public static void usingGenerics() {
    	List<String> listFrutes=new ArrayList<>();
    	listFrutes.add("apple");
    	listFrutes.add("orange");
    	listFrutes.add("banana");
    	// it provide type safety 
    	System.out.println(listFrutes.get(1));
    	
    }
    
}
