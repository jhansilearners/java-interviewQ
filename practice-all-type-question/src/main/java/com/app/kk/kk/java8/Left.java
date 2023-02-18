package com.app.kk.kk.java8;

public interface Left {
    /*we can write main method in interface */
	public static void main(String args[]) {
    	System.out.println("inside left interface main method");
    }
	/*we can also write default method in interface */
	default void m1() {
		System.out.println("inside left interace of default method m1");
	}
	//void displaySamLeft();
    
}
interface Right {
	default void m1() {
		System.out.println("inside right interace of default method m1");
	}
	//void displaySamRight();
}
interface FunIntf<T,T1 ,R>{
    R sum(T t,T1 t1);
}
