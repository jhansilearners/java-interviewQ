package com.app.google.interviewQ;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sock100 {
  public static void main(String[] args) {
	 List<String> socks=new ArrayList<>();
		 socks.add("Red");
		 socks.add("black1");
		 socks.add("green1");
		 socks.add("Red");
		 socks.add("black1");
		 socks.add("green2");
		 socks.add("Red");
		 socks.add("Yellow");
		 socks.add("black");
		 socks.add("green");
		 socks.add("Red");
		 socks.add("black");
		 socks.add("green");
		 socks.add("Red");
		 socks.add("black");
		 socks.add("green");
		 socks.add("Red");
		 socks.add("black");
		 socks.add("yellow");
		 socks.add("green");
		 socks.add("Red");
		 socks.add("black");
		 socks.add("green");
		 socks.add("Red");
		 socks.add("black");
		 socks.add("green");
		 socks.add("Red");
		 socks.add("black");
		 socks.add("green");
		 socks.add("yellow");
	 Map<String,Integer> count=socks.stream().limit(15).parallel().collect(Collectors.groupingBy(Function.identity(),Collectors.collectingAndThen(Collectors.counting(),x->x.intValue())));
			int res1= count.values().parallelStream().filter(x->x>1).reduce(0,(res,v)->res+v/2);
	 System.out.println(count);
	 System.out.println("res:"+res1);
  }
  
//  public static int pairValue(int a,int b) {
//	  int r=0;
//	  r=a+(b/2);
//	  return r;
//  }
}
