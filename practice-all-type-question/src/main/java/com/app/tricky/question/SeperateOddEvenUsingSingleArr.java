package com.app.tricky.question;

import java.util.Arrays;

public class SeperateOddEvenUsingSingleArr {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,7,9,5,8};
		System.out.println("input array :"+Arrays.toString(arr));
		for (int i = 0,j=arr.length-1; i < j; ) {
			
			if(arr[i]%2!=0&&arr[j]%2==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;j--;
			}else {
				if(arr[i]%2==0) {
					i++;
				}
				if (arr[j]%2!=0) {
					j--;
				}
			}
		}
		System.out.println("output array :"+Arrays.toString(arr));
	}

}
