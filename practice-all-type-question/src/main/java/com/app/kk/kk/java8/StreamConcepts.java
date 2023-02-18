package com.app.kk.kk.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcepts {
	static int a=0;
 public static void main(String[] args) {
   List<Integer> marks=new ArrayList<>();
   marks.add(0);
   marks.add(35);
   marks.add(10);
   marks.add(45);
   marks.add(29);
   
  List<Integer> evenMarks= marks.stream().filter(i->i%2==0).collect(Collectors.toList());
  List<Integer> listMarks=marks.stream().map(x->x+10).collect(Collectors.toList());
  System.out.println(evenMarks);
  System.out.println(listMarks);
  
  long count=marks.stream().filter(m->m<30).map(m->m+5).filter(m->m<30).count();
  System.out.println(count);
  List<Integer> dnsortingOrder=marks.stream().sorted().collect(Collectors.toList());
  System.out.println(dnsortingOrder);
  List<Integer> decSortingOrder=marks.stream().sorted((i1,i2)->i1<i2?1:i1>i2?-1:0).collect(Collectors.toList());
  System.out.println(decSortingOrder);
  // reverse with the help of comparable -> compareTo mehtod
  
  List<Integer> decByComparable=marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
  System.out.println(decByComparable);
  
  // get min value of marks
  Integer min=marks.stream().min((i1,i2)->i1.compareTo(i2)).get();
  Integer max=marks.stream().min((i1,i2)->-i1.compareTo(i2)).get();
  // or 
  Integer max1=marks.stream().max((i1,i2)->i1.compareTo(i2)).get();
  System.out.println("min value :"+min+"  max=:"+max+" max1 :"+max1);
  
  // forEach to perform all operation on 
  marks.stream().forEach(System.out::println);
 
  marks.stream().forEach(x->{int b=0;
  a++;
  System.out.println("count :"+a);
  System.out.print(x+"\t");});
  //--------------------- CONVERT STREAM TO ARRAY
  
  Integer iArr[]=marks.stream().toArray(Integer[]::new);
 
  // convert array to stream 
  Stream.of(iArr).forEach(System.out::println);
  
  
  // for map iteration using 
  Map<String,String> map=new HashMap<>();
  
  map.put("1", "anil");
  map.put("2", "pal");
  
  //map.entrySet().stream().forEach((key,value)->System.out.println("key:"+key+"value :"+value));
  
  map.forEach((key,value)->System.out.println("key:"+key+"  value :"+value));
  
  map.entrySet().stream().forEach(e->System.out.println("key :"+e.getKey()+" value :"+e.getValue()));
 }
}
