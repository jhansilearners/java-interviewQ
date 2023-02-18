package com.app.tricky.question;

import java.util.ArrayList;
import java.util.List;

public class RetainAllInCollection {
	
	public static void main(String[] args) {
		List<Integer> num10To30=new ArrayList<>();
		num10To30.add(10);
		num10To30.add(20);
		num10To30.add(30);
		
		List<Integer> num30To50=new ArrayList<>();
		num30To50.add(30);
		num30To50.add(40);
		num30To50.add(50);
		System.out.println(num10To30);
		System.out.println(num30To50);
	    System.out.println("After retain all");
	    num10To30.retainAll(num30To50);
		System.out.println(num10To30);
		System.out.println(num30To50);
	}

}
