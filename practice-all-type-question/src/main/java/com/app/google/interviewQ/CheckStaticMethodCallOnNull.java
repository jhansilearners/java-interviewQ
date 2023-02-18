package com.app.google.interviewQ;

public class CheckStaticMethodCallOnNull {
   public static void staticMethod() {
	   System.out.println(" staticMethod :-");
   }
   public static void main(String[] args) {
	   CheckStaticMethodCallOnNull chk=null;
	   chk.staticMethod();
	   
   }
}
