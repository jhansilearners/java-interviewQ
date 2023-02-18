package com.app.kk.kk.java8;

public class Java8NewFeature implements Left,Right {
    public static void main(String[] args) {
    	Java8NewFeature jnf=new Java8NewFeature();
    	jnf.m1();
    	/*lambda  expression */
    	FunIntf<Integer,Integer,Integer> sum=(i1,i2)->i1+i2;
    	System.out.println(sum.sum(10, 20));
    	FunIntf<String,String,String> concatStr=(s1,s2)->s1+s2;
    	System.out.println(concatStr.sum("Anil", "pal"));
    }
    /*here if we have two interface having same default method then it must required to override */
    @Override
	public void m1() {
    	Left.super.m1();
		System.out.println("inside the m1 of Java8NewFeature ----");
	}
    

}
