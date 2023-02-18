package com.app.hrank;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MinIncrementForUnique {
	// function to find minimum increment required
	public static int minIncrementForUnique(int[] A) {
		//here we have to find duplicate element for array int[] A = {6,2,3,5,6,3,2,4};
		TreeMap<Integer,Integer> countByNumberInSortedForm=Arrays.stream(A).mapToObj(x -> Integer.valueOf(x)).collect(
				Collectors.groupingBy(x -> x,TreeMap::new, Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
		System.out.println(countByNumberInSortedForm);//{2=2, 3=2, 4=1, 5=1, 6=2}
		
		// sort the array in increasing order
		
		Arrays.sort(A);
		System.out.println(Arrays.toString(A));
		// counter for no of operations
		int ops = 0;
		// iterate over the array
		for (int i = 1; i < A.length; i++) {
			if (A[i] <= A[i - 1]) {
				ops += A[i - 1] - A[i] + 1;
				A[i] = A[i - 1] + 1;
			}
		}
		System.out.println(Arrays.toString(A));
		// return no of operations required
		return ops;
	}

	// Driver code
	public static void main(String[] args) {
		int[] A = {6,2,3,5,6,3}; //{ 1, 2, 1 }; // { 3, 2, 1, 2, 1, 7 };
		
		
		
		System.out.println(Arrays.toString(A));
		System.out.println("Minimum number of increment operations required: " + minIncrementForUnique(A));
	}
}
