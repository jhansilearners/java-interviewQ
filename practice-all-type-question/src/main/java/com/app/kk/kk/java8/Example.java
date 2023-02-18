package com.app.kk.kk.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

class Student{    
	   int id;     
	   String name;  
	   int age;           
	   public Student(int id, String name, int age) {   
	       this.id = id;         
	       this.name = name;       
	       this.age = age;      
	   }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	} 
	  
	}  
	public class Example {     
	   public static void main(String[] args) {  
		   
	      List<Student> studentlist = new ArrayList<Student>();       
	      //Adding Students        
	      studentlist.add(new Student(11,"Jon",22));         
	      studentlist.add(new Student(22,"Steve",18));         
	      studentlist.add(new Student(33,"Lucy",22));         
	      studentlist.add(new Student(44,"Sansa",23));         
	      studentlist.add(new Student(55,"Maggie",18)); 
	      studentlist.add(new Student(55,"Maggie",18)); 
	      //Fetching student data as a Set       
	      Set<Student> students = studentlist.stream()
	                           .filter(n-> n.id>22)
	                           .collect(Collectors.toSet());
	      //Iterating Set       
	      for(Student stu : students) { 
	         System.out.println(stu.id+" "+stu.name+" "+stu.age); 
	      }           
	   } 
	}