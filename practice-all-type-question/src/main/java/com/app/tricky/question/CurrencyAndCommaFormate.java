package com.app.tricky.question;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyAndCommaFormate {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------\n");
        double payment = scanner.nextDouble();
        
        String paymentStr=new Double(payment).toString();
        
        String digBADec[]=paymentStr.split("\\.");
       
        System.out.println(digBADec[0]);
        System.out.println(digBADec[1]);
        StringBuilder amt=new StringBuilder(digBADec[0]).reverse();
        StringBuilder sb=new StringBuilder();
        int commIdx=3;
        for(int i=0;i<amt.length();i++){
        	if(i==commIdx&&amt.length()-1>=i){
                sb.append(",");
                commIdx+=3;
            }
            sb.append(amt.charAt(i));
            
        }
        amt=sb.reverse();
        amt.append(".");
        // consider only two digits 
        if(digBADec[1]==null||Integer.parseInt(digBADec[1])==0){
            amt.append("00");
        }else if(digBADec[1].length()==1){
              amt.append(digBADec[1]+"0");
        }else if(digBADec[1].length()>=3){
            if(Character.getNumericValue(digBADec[1].charAt(2))>5){
                amt.append(Integer.parseInt(digBADec[1].substring(0,2))+1+"");
            }else{
                amt.append(digBADec[1].substring(0,2));
            }
        }else{
            amt.append(digBADec[1].substring(0,2));
        }

       
        scanner.close();

        // Write your code here.
       
        System.out.println("US: " + "$"+amt.toString());
        System.out.println("India: " + "Rs."+amt.toString());
        System.out.println("China: " + "¥"+amt.toString());

         String famt=amt.toString();
         String rCommBy=famt.replaceAll(",", " ");
         System.out.println(rCommBy+" :after , replace ");
        System.out.println("France: " + rCommBy.replaceAll("\\.",",")+" €");
    }
}