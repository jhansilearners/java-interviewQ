package com.app.kk.kk.java8;

import java.util.*;
import java.util.stream.*;
public class TestNagarro{
  public static void main(String arg[]){
	  String strArr[]={"anil","pal","ajay","anit","rajneesh","kumar","xyza"};
	  Comparator<String> comp=(o1,o2)->o1.length()==o2.length()?new StringBuffer(o1).reverse().toString().compareTo(new StringBuffer(o2).reverse().toString()):Integer.valueOf(o1.length()).compareTo(o2.length()); 
	  Stream.of(strArr).sorted(comp).collect(Collectors.toList()).forEach(System.out::println);
	  
  }

}