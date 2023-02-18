package com.app.kk.kk.java8;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;



public class TesEmpGroupingBy {
   public static void main(String[] args) {
	   List<Employee> empList = Arrays.asList(new Employee(1, "Ritin", "dept1"), new Employee(2, "Ved", "dept2"),
				new Employee(3, "Rajnish", "dept1"), new Employee(4, "Priyanka", "dept2"), new Employee(5, "Shubhi", "dept1"), new Employee(6, "Anil", "dept2"));
	  
	   TesEmpGroupingBy testObj=new TesEmpGroupingBy();
	   System.out.println("-----------case 1----------------");
	   testObj.printEmpNameByDept(empList);
	   System.out.println("-----------case 2----------------");
	   testObj.sortEmpByDeptAndDecEmpName(empList);
	   TreeSet<Employee> newTs=new TreeSet<>();
	    System.out.println(newTs.get(1));
	   
   }
   /**
    * case 1  implementation 
    * */
	public void printEmpNameByDept(List<Employee> empList) {
		empList.stream()
				.collect(Collectors.groupingBy(e -> e.getDepartment(),
						Collectors.mapping(Employee::getName, Collectors.toList())))
				.forEach((dept, empNames) -> System.out.println(dept + "   " + empNames));
	}
   /**
    * case 2 implementation 
    * */
   public void sortEmpByDeptAndDecEmpName(List<Employee> empList) {
	   TreeSet<Employee> sortedEmpByComparable=new TreeSet<Employee>(empList);
	   sortedEmpByComparable.stream().forEach(System.out::println);
   }
   
}
