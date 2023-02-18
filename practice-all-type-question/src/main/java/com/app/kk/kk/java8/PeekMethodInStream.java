package com.app.kk.kk.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static java.util.Arrays.sort;

public class PeekMethodInStream {
    public static void main(String[] args) {
		Stream.of("anil","ram","kam").peek(x->{System.out.print(" **"+x+"\t");}).filter(x->x.length()==3).forEach(System.out::println);
		List<Integer> ls=new ArrayList<>();
		System.out.println( ls.add(10));
		// before remove or get we have to check element is present or not if not then no need to perform remove operation other wise we will get runtime exception as indexout of bound
	//System.out.println(	ls.remove(1));
	//System.out.println(ls.get(1));
		int a[]=new int[2];
		for (int i : a) {
			System.out.println(i);
		}
		//a[2]=2;
		// System.out.println(a[2]); // RE
		
		int[] res= {1,4,2,6,2,};
		sort(res);
	   System.out.println(res);
	   System.out.println("print :"+1+2+3);
	   System.out.println("print :"+1+2*3);
	}
}
 class Main{ 
    private int i = 1; 
    public static void main(String argv[]){ 
       int i = 2; 
       Main s = new Main (); 
       s.someMethod(); 
    } 
    public static void someMethod(){ 
      // System.out.println(i); //change to static 
    } 
  }
 interface Rideable{
	 String ride();
 }
 abstract class Horse implements Rideable{
//	 String ride() {   // should be public 
//		 return "horse_ride";
//	 }
	 public String ride() {
		 return "horse_ride";
	 }
	 abstract void test();
 }
 
 class MyTest extends Horse{
	 
	 void test() {
		 
	 }
 }