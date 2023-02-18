package com.app.ds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
	public static void main(String[] args) {
		Array arr=new Array(3);
		System.out.println();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.print();
		System.out.println("----------------");
		arr.removeAt(2);
		arr.removeAt(1);
		arr.print();
		System.out.println("element in arr :"+(arr.contains(20)? " present ":" Not present "));
		//arr.add(40);
		
		GenArray<String> nameList=new GenArray<>();
		nameList.add("anil");
		nameList.add("pal");
		nameList.add("ajay");
		nameList.add("pal");
		nameList.print();
		System.out.println(nameList.indexOf("pal"));
		nameList.removeAt(0);
		nameList.print();
		
		String s=new String("test");
		s.indexOf("t");
		ConcurrentHashMap<String, String> map=new ConcurrentHashMap<>();
		System.out.println("****************");
		// Here trying to put data in MyLinkList
		MyLinkList myList=new MyLinkList();
		myList.addLast(100);
		myList.addLast(200);
		myList.addLast(300);
		myList.addLast(400);
		myList.addFirst(99);
		myList.print();
		System.out.println("----- remove first -------");
		myList.removeFirst();
		myList.print();
		System.out.println("------remove last------");
		myList.removeLast();
		myList.print();
		System.out.println("------ remove at index 1------");
		myList.removeAt(1);
		myList.print();
		System.out.println("------ remove at index middle------");
		myList.addLast(999);
		myList.removeMiddle();
		myList.print();
		System.out.println("------ add 888 at index 1------");
		//myList.addLast(999);
		myList.addElementAt(1,888);
		myList.print();
		System.out.println("------ remove at index 2------");
		myList.removeAt(2);
		myList.print();
	//	AtomicReference<BigDecimal> value=new AtomicReference<BigDecimal>();
		
		LinkedList list=new LinkedList();
		list.add(10);
		list.add(3, 3);
		System.out.println(list);
		List<String> str=new ArrayList<>();
		Collection<?> c=new ArrayList();
		Map<String,String> map1=new HashMap<>();
		//Arrays.
		
		
	}

}
