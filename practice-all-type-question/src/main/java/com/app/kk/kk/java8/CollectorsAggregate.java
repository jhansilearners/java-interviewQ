package com.app.kk.kk.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsAggregate {
    public static void main(String[] args) {
	// find the employee by max id
    	Comparator<Employee> byId=(e1,e2)->e1.getId()-e2.getId();
     Optional<Employee> maxIdEmp= createEmployee().stream().max(byId);
      System.out.println(maxIdEmp);
      // if we want employee name min id
      System.out.println(createEmployee().stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getName))));
      // if we don't want option then we can transform it.
		String name = createEmployee().stream().collect(Collectors.collectingAndThen(Collectors
				.maxBy(Comparator.comparing(Employee::getId)), em -> em.map(Employee::getName).orElse("")));
		System.out.println(name +" name is for max id");
		
		// here we are getting all names grouping by department
		Map<String, List<String>> empNameGroupingBydept=createEmployee().stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println("empNameGroupingBydept:-"+empNameGroupingBydept);
		
		System.out.println(createEmployee().stream().flatMap(employee->Arrays.asList(employee.getName().split("")).stream()).collect(Collectors.toList()));
		// here we are getting all names charactor grouping by department
		//
		//System.out.println(createEmployee().stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.flatMapping(employee->Arrays.asList(employee.getName().split("")).stream(), Collectors.toList())))); // 
//		Map<String, List<Character>> empNameCharsGroupingBydept=createEmployee().stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.flatMapping(emp->Stream.of(emp.getName().split("")), Collectors.toList())));
//		System.out.println("empNameGroupingBydept:-"+empNameGroupingBydept); flatmapping introduce in other version of java so in the current system we have installed java 8
		
		// if we want another level of transformation for Character of names which is group by department should be in Upper case and unique
		
		// System.out.println(createEmployee().stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(emA->emA.getName().toUpperCase(),Collectors.flatMapping(name1->Arrays.asList(name1.split("")).stream(), Collectors.toSet())))));// {ACC=[P, A, B, Z, L, O], Dev=[A, I, L, N]}
	}
    private static List<Employee> createEmployee() {
        return Arrays.asList(new Employee(1, "Anil", "Dev"),new Employee(2, "Anil", "Dev"),new Employee(4, "Pal", "ACC"),new Employee(3, "zob", "ACC"));
	}
}

//
//Optional[Employee [id=3, name=zob, department=ACC]]
//Pal name is for max id
//empNameGroupingBydept:-{ACC=[Pal, zob], Dev=[Anil, Anil]}
//{ACC=[P, a, l, z, o, b], Dev=[A, n, i, l, A, n, i, l]}