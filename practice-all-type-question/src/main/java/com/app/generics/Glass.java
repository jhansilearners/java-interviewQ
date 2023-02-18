package com.app.generics;
/*here we can define the generic using the type parameter at class level so we can use this as on the class level */
public class Glass<T> {
   T liquid;
   
   // we can also define generic method 
   public static <Y> void getOper(Y obj) {
	  // return obj;
	   System.out.println("object passed to method is :"+obj.getClass().getName());
   }
   
}
interface Liquid{
	public String getTest();
}
class Juice implements Liquid{

	@Override
	public String getTest() {
		return "sweet";
	}
	
}
class Water implements Liquid{

	@Override
	public String getTest() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
class OrangeJuice extends Juice{
	
}
class Bins{
	
}
