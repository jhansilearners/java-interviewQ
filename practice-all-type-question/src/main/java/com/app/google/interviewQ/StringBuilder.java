package com.app.google.interviewQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StringBuilder {
     public static void main(String[] args) {
		List<StringBuffer> listSb=new ArrayList<>();
		StringBuffer sb1=new StringBuffer("abc");
		StringBuffer sb2=new StringBuffer("efg");
		StringBuffer sb3=new StringBuffer("abc");
		listSb.add(sb1);
		listSb.add(sb2);
		listSb.add(sb3);
		System.out.println(listSb);
		System.out.println("------------------------");
		Collections.sort(listSb, (s1,s2)->s1.toString().compareTo(s2.toString()));
		System.out.println(listSb);
		Set<StringBuffer> setSb=new LinkedHashSet<>(listSb);
		System.out.println(listSb); 
		TreeSet<StringBuffer> treeSetSb1=new TreeSet<>(listSb);
		System.out.println(treeSetSb1);
		/*
		 [abc, efg, abc]
         ------------------------
         [abc, abc, efg]
         [abc, abc, efg] 
		 */
		Set<StringBuffer> treeSetSb=new TreeSet<>( (s1,s2)->s1.toString().compareTo(s2.toString()));
		treeSetSb.addAll(listSb); 
		System.out.println(treeSetSb);
		
		
	}
}
