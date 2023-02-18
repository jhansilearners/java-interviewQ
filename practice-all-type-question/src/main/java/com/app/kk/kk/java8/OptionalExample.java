package com.app.kk.kk.java8;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalExample {
    public static void main(String[] args) {
    	// of method is used to create Optional it is used when data should not null if it is null then it will give null pointer exception 
		Optional<String> optData=Optional.of("test");
		System.out.println("isPresent :"+optData.isPresent()+"optData.get():"+optData.get());
//		Optional<String> data=Optional.of(null);// this give null pointer exception
//		System.out.println("data.isPresent():"+data.isPresent()+"data.isEmpty():");
		Optional<String> test=Optional.empty();
		System.out.println("test :"+test.isPresent());
		//System.out.println( "test.get()"+test.get());// here we will get NoSuchElementException 
		System.out.println(test.isPresent());
		
		Optional<String> ofNullable=Optional.ofNullable("test data");
		System.out.println(ofNullable.get());
		System.out.println(ofNullable.isPresent());
		
		
		//-------------
		
		// Test for the object comparision 
		//Predicate<T> test3=()->{};
		Supplier<String> test2= ()->"test";
		
	}
}
