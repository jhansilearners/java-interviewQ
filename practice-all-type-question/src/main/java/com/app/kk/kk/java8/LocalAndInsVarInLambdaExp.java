package com.app.kk.kk.java8;

public class LocalAndInsVarInLambdaExp {
	public static void main(String[] args) {
		LocalAndInsVarInLambdaExp obj=new LocalAndInsVarInLambdaExp();
		obj.m2();
	}
	int x=111;
	public void m2() {
		int y=222;
		InterfVarCon fiv=()->{
			int z=888;
			System.out.println("inside lambda experssion ");
			System.out.println("accessing x value :"+x+"  accessing value y:"+y+" accessing z value :"+z);
			/*if you try to modify the x and y value so local variable value can't be modified */
			x=555;
			// y=666; getting compile time error 
			z=999;
			System.out.println("accessing x value :"+x+"  accessing value y:"+y+" accessing z value :"+z);
			
		};
		fiv.m1();
	}

}
interface InterfVarCon{
	public void m1();
}
