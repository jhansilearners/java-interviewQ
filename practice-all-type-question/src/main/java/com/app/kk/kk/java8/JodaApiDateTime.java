package com.app.kk.kk.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JodaApiDateTime {
	
   public static void main(String[] args) {
	   String s="anil";
	   System.out.println(s.substring(0,2));
	  Double d=new Double(12345.09);
	  System.out.println(d.toString());
	  LocalDate ld=LocalDate.of(2020, 8, 20) ;
	  System.out.println(ld.getDayOfWeek());
	  System.out.println("-------------Date Time api----------");
	  LocalDate localDate=LocalDate.now();
	  
	  System.out.println(localDate);
	  
	  int dd=localDate.getDayOfMonth();
	  int mm=localDate.getMonthValue();
	  int yy=localDate.getYear();
	  System.out.printf("\n%d-%d-%d",dd,yy,mm);
	  // LocalTime example 
	  LocalTime lt=LocalTime.now();
	  
	  int h=lt.getHour();
	  int minute=lt.getMinute();
	  int second=lt.getSecond();
	  int nano=lt.getNano();
	  
	  System.out.printf("\n %d:%d:%d:%d",h,minute,second,nano);
	  // DateTime
	  LocalDateTime ldt=LocalDateTime.now();
	  // all the method present in LocalDate and LocalTime is by default available in 
	  System.out.println( "local date time :"+ldt.getDayOfMonth()+"day of year "+ldt.getDayOfYear());;
	  
	  System.out.println(LocalDateTime.of(2020, Month.JUNE,01, 8, 19));
	  
	  
	  ZoneId la = ZoneId.of("America/Los_Angeles");
	  
	  System.out.println(la);
	  
	  ZonedDateTime zt=ZonedDateTime.now();
	  System.out.println(zt);

	  LocalDate dob=LocalDate.of(1993, 12, 18);
	  
	  System.out.println(dob);
	  
	  Period p=Period.between( dob,localDate);
	  System.out.println(p);
	  
	  Year year=Year.of(2020);
	  
	  System.out.println("if year is leap "+year.isLeap());
	  
   }

}
