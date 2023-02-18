package com.app.kk.kk.java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HkrFindPairsInArr {
    public static void main(String[] args) {
    	int ar[]= {1,2,3,4,3,2,1,5,6,4,5,2,7};
    	//Arrays.stream(ar).mapToObj(x->Integer.valueOf(x)).collect(Collectors.groupingBy(Function.identity())).forEach((k,v)->System.out.println("Key :"+k+" Value :"+v));
    	Arrays.stream(ar).parallel().mapToObj(x->Integer.valueOf(x)).collect(Collectors.groupingBy(Function.identity(),Collectors.collectingAndThen(Collectors.counting(),val->val.intValue()/2))).forEach((k,v)->System.out.println("Key :"+k+" Value :"+v));
    	Integer res=Arrays.stream(ar).parallel().mapToObj(x->Integer.valueOf(x)).collect(Collectors.groupingBy(Function.identity(),Collectors.collectingAndThen(Collectors.counting(),val->val.intValue()/2))).values().parallelStream().reduce(0,(s,v)->s+v);
    	System.out.println("res:"+res);
    	Arrays.asList(ar).parallelStream().collect(Collectors.groupingBy(Function.identity(),Collectors.collectingAndThen(Collectors.counting(),val->val.intValue()/2))).forEach((k,v)->System.out.println("Key :"+k+" Value :"+v));
    	
	} 
}
