package com.app.kk.kk.java8;

public class MethodRefConstructorRef {
	public static void main(String[] args) {
		MethodRefConstructorRef obj=new MethodRefConstructorRef();
		MyFunctionalInterface mfi=i->{
			System.out.println("using lambda expression ");
			System.out.println("My name is :"+i);
		 
		};
		mfi.displayName(" Anil ");
		MyFunctionalInterface mref=obj::myMethodRef;
		mref.displayName("Naveen");
		//======================= for constructor reference 
		ConsRefFI cons=(name,age)->new Employe(name, age);
		System.out.println(cons.getEmpDtl("nameT", 10));
		ConsRefFI consRef=Employe::new;
		System.out.println(consRef.getEmpDtl("nameCons", 20));
		
		
	}
	public void myMethodRef(String name) {
		System.out.println("using method ref");
		System.out.println("My name is :"+name);
		
	}
}
@FunctionalInterface
interface MyFunctionalInterface{
	public void displayName(String name);
	
}
@FunctionalInterface
interface ConsRefFI{
	public Employe getEmpDtl(String name,int age);
	public default void m1() {
		System.out.println("defender method ");
	}
}

class Employe {
	String name;
	int age;
	Employe(String name, int age){
		this.name=name;
		this.age=age;
		}
	@Override
	public String toString() {
		return "Employe [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
