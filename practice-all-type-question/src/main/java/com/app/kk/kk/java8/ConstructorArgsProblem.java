package com.app.kk.kk.java8;

public class ConstructorArgsProblem extends Parent{
	ConstructorArgsProblem(String s){
		super(s);
		p=2;
	}
   public static void main(String[] args) {
	   ConstructorArgsProblem obj=new ConstructorArgsProblem("test");
   }
}

class Parent {
	int p=0;
	Parent(String s){
		p=1;
	}
}
