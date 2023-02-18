package com.app.google.interviewQ;

 class A {
    
   // if we enable m1 then ambigues 
//	public void m1(String str) {
//    	System.out.println("m1:str "+str);
//    }
   public void m1(Object obj) {
    	System.out.println("m1:obj :"+obj);
   }
    public void m1(Integer integer) {
    	System.out.println("m1:inte :"+integer);
    }
	public static void main(String[] args) {
		A a=new A();
		//String str=null;
		//a.m1(str); // string method call 
		a.m1(null);
	}
}