package com.app.google.interviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FindMissingElement {
	public static void main(String[] args) {
		int arr[]= {5,2,1,4,4};
		int[] sum=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			if(arr[i]==sum[arr[i]-1]) {
				System.out.println(" duplicate :"+arr[i]);
			} 
			sum[arr[i]-1]=arr[i];
		}
		System.out.println(Arrays.toString(sum));
		String s="abcdefghijklmn";
		int k=3;
		String strArr[]=s.split("(?<=\\G.{"+k+"})");
        System.out.println(java.util.Arrays.toString(strArr));
        
        String test="He is a very very good boy, isn't he?";
        System.out.println(test.codePoints().mapToObj(x->(char)Character.toLowerCase(x)).collect(Collectors.toList()));
        ArrayList al=new ArrayList();
	}

}
