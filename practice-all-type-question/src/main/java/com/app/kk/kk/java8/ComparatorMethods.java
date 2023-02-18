package com.app.kk.kk.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// why comparator has equals method can Functional interface have equals method (yes) because object class override equals method.
public class ComparatorMethods {
	
	static Comparator<SuperHero> comparator = new Comparator<SuperHero>() {
		// here we pass obje of comparator object that need to check with existing comparator compatibility .
	    @Override
	    public boolean equals(final Object obj) {
	        if (!(obj instanceof Comparator)) return false;

	        SuperHero s1 = new SuperHero("1", "Tony", 24);
	        SuperHero s2 = new SuperHero("2", "Steve", 25);
	        
	        // checking if both the comparator returns the same value.
	        return Integer.signum(this.compare(s1, s2)) 
	            == Integer.signum(((Comparator<SuperHero>) obj).compare(s1, s2));
	    }

	    @Override
	    public int compare(final SuperHero s1, final SuperHero s2) {
	        return s1.getAge() - s2.getAge();
	    }
	};


	


	
	 public static void main(String[] args) {
	     List<SuperHero> superHeroes = new ArrayList<>();

	     superHeroes.add(new SuperHero("2", "Iron Man", 35));
	     superHeroes.add(new SuperHero("1", "Captain America", 25));
	     superHeroes.add(new SuperHero("3", "Hulk", 20));
	     
	     Collections.sort(superHeroes);
	/* printing result */
	     superHeroes.forEach(superHero -> 
	                         System.out.println(superHero.toString()));
	     
	     // here we are checking for two comparator is same or not if they are same then both comparator of same type
	     //
	     
	     Comparator<SuperHero> ageComparator 
		    = (s1, s2) -> s1.getAge() - s2.getAge();

		Comparator<SuperHero> nameComparator 
		    = (s1, s2) -> s1.getName().compareTo(s2.getName());

		System.out.println(comparator.equals(ageComparator));
		System.out.println(comparator.equals(nameComparator));
	 }
   
   

}
class MyComparator implements Comparator<Employe>{

	// if o1 has to come after o2 then return -ve
	// if o1 has to come before o2 then return +ve
	// if both object should consider as same then return 0;
	@Override
	public int compare(Employe o1, Employe o2) {
		return o1.age < o2.age ? -1 : o1.age > o2.age ? +1 : 0;
	}
}

@FunctionalInterface
interface MyFunction{
	void testMyData();
	boolean equals(Object obj); // object class method not consider as SAM
	//public final native Class<?> getClass(); // Cannot override the final method from Object
	
}

//1. Implement Comparable interface
class SuperHero implements Comparable<SuperHero> {
 private final String id;
 private final String name;
 private final int age;
 
 public SuperHero(String id, String name, int age) {
     this.id = id;
     this.name = name;
     this.age = age;
 }
 
 // 2. override compareTo method.
 @Override
 public int compareTo(final SuperHero superHero) {
     return this.id.compareTo(superHero.id);
 }
 
 public String getId() { return this.id; }
 
 public String getName() { return this.name; }
 
 public int getAge() { return this.age; }
 
 @Override
 public String toString() {
     return String.format("ID: %s | Name: %s | Age: %d", id, name, age);
 }
}
