package com.app.google.interviewQ;

import java.util.HashMap;
import java.util.Map;

public class StaticAssignValue {
 static int y=10;
 Map<String,String> map=new HashMap<>();
 public static void main(String[] args) {
	StaticAssignValue sav=new StaticAssignValue();
	int x=20;
	sav.reassignValue(x);
	System.out.println(x+"--x-"+y+"---y");
}
 
 
 public void reassignValue(int x) {
	 x=x*2;
	 y=y*2;
	 
 }
}
//20--x-20---y