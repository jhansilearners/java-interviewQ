package com.app.kk.kk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Features {
//	public static  String getReversed(String data) {
//		
//	}
    public static void main(String[] args) {
		// forEach and forEachOrdered
      List<String> list=new ArrayList<>();
      list.add("a");
      list.add("c");
      list.add("b");
      list.add("e");
      
      list.stream().parallel().forEach(System.out::println);
      System.out.println("-------------------");
      list.stream().parallel().forEachOrdered(System.out::println);
      
      String toReverse="My is data     is   youR is";
     // String toReverse="My is data";
      String data=Stream.of(toReverse.split(" ")).map(s->new StringBuffer(s).reverse()).reduce((s1,s2)->s1.append(" ").append(s2)).get().toString().trim();
    	System.out.print(data);
    	
    	// sort data by value
    	Map<String,String> mapData=new HashMap<>();
    	mapData.put("A", "2");
    	mapData.put("D", "1");
    	mapData.put("M", "2");
    	LinkedHashMap<String, String> sortedByValue=new LinkedHashMap<String, String>();
    	sortedByValue.putAll(mapData);
    	
    	List<Map.Entry<String, String>> entriesList=new ArrayList<>(mapData.entrySet());
    	Collections.sort(entriesList, (e1,e2)->e1.getValue().compareTo(e2.getValue()));
    	//TreeSet<Map.Entry<String, String>> tset=new TreeSet<Map.Entry<String,String>>((e1,e2)->e1.getValue().compareTo(e2.getValue()));
    	//Collections.sort(entries,new ByValueComparator() );
//    	for (Map.Entry<String, String> entry : mapData.entrySet()) {
//    		tset.add(entry);
//		}
    	System.out.println();
    	System.out.println(entriesList);
    	Set<String> set = Arrays.stream(toReverse.split(" ")).collect(Collectors.toCollection(TreeSet::new));
    	System.out.println(set);
	}
}
//class ByValueComparator implements Comparator<Map.Entry<String, String>>{
//
//	@Override
//	public int compare(Entry<String, String> o1, Entry<String, String> o2) {
//	  return o1.getValue().compareTo(o2.getValue());
//	
//	}
//	
//}