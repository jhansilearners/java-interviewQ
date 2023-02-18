package com.app.tricky.question;

import java.util.ArrayList;
import java.util.List;

public class TrickyQuestion {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		m2(list);
		m1(list);
		System.out.println(list.size());
	}
	public static void m2(List list) {
		list.add(30);
		list.add(40);
	}
	public static void m1(List list) {
		//list=null;
		//list=new ArrayList();
		list.add(10);
		"ram".equals(null);
	}
	

}
