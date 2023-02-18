package com.app.kk.kk.java8;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredefineFunctionDemo<T> {
   /*working of Predicate in java8*/
	public static void main(String[] args) {
		/*predicate is used for conditional check return type of predicate is boolean and input can be anything */
		// check number is even or odd 
		Predicate<Integer> isEven=num->num%2==0;
		System.out.println("if it return true it means number is even other wise odd :"+isEven.test(10));
		System.out.println("if it return true it means number is even other wise odd :"+isEven.test(13));
		
		/*function is accept and type and return any type */
		Function<Integer,String> sqrOfNum=num->{
			return "squar of "+num+" is :"+num*num;
		};
		
		System.out.println(sqrOfNum.apply(12));
		BiPredicate<Integer, Integer> sumOfnumIsEven=(i1,i2)-> (i1+i2)%2==0;
		System.out.println("is sum of two num is sum :"+sumOfnumIsEven.test(10, 20));
		
		BiFunction<Integer,Integer,String> sumOfnum=(i1,i2)->"sum of "+i1+" and "+i2+" ="+(i1+i2);
		
		System.out.println(sumOfnum.apply(10, 20));
		
		Predicate<Integer> isGraterThan10=i->i>10;
	    int arr[]= {1,2,3,10,12,14}		;
	    System.out.println("----------grater than 10 and even -----------");
	    processIntArrByPre(isGraterThan10.and(isEven), arr);
	    System.out.println("--------grater than 10 or even -------");
	    processIntArrByPre(isGraterThan10.or(isEven), arr);
	    System.out.println("-------odd number--------");
	    processIntArrByPre(isEven.negate(), arr);
	    Function<String,String> toUperCase=s->s.toUpperCase();
	    System.out.println("to combine two function "+sqrOfNum.andThen(toUperCase).apply(10));
	    
	}
	
	public static void processIntArrByPre(Predicate<Integer> predicate,int[] arr) {
		for (int i : arr) {
			System.out.println("printed as per predicate applyed :"+i+" : "+predicate.test(i));
		}
	}

}
