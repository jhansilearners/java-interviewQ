package com.app.ds;

import java.math.BigInteger;
import java.util.Arrays;

//Dynamic programing store common repeated computation 
class DpFibnoseries{
	static int n=5;
	static Integer dpArr[]=new Integer[n+1];
	public static void main(String args[]){
		//Scanner s=new Scanner(System.in);
		
		System.out.println(fib(n));
		//maxCharPrintBySOP();
		findFib(50000);
	}
	
	public static int fib(int n){
		int res=0;
		if(dpArr[n]!=null){
			res=dpArr[n];
		}else{
			if(n==0){
				 dpArr[0]=0;
				 res =dpArr[0];
			}else if(n==1){
				 res=dpArr[1]=1;
			}else{
				res=fib(n-1)+fib(n-2);
			    dpArr[n]=res;
			}
	    }
     return res;		
	}
	
	// using tabular or bottom up apporch.
	public static void findFib(int num) {
		BigInteger dpTblArr[]=new BigInteger[num+1];
		dpTblArr[0]=BigInteger.ZERO;
		dpTblArr[1]=BigInteger.ONE;
		for(int i=2;i<=num;i++) {
			dpTblArr[i]= dpTblArr[i-2].add(dpTblArr[i-1]);
		}
		//System.out.println(Arrays.toString(dpTblArr));
		System.out.println("--------------");
		System.out.println(":"+dpTblArr[num]+":");
	}
	public static void maxCharPrintBySOP() {
		for(int i = 0; i < Integer.MAX_VALUE; i++){
            System.out.println(i+" "+(char)i);
            if(i == 270){
                break;
            }
        }
	}
}

