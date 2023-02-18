package com.app.google.interviewQ;

public class StringDataParse {
	public static void main(String[] args) {
		System.out.println("Bangalore,30|Hyderabad,32|Dehlhi,38|$Bangalore ,Evening,Monday|$Delhi ,Morning,wednesday|$Hyderabad,Afternoon,Sunday");
		String data = "Bangalore,30|Hyderabad,32|Dehlhi,38|$Bangalore ,Evening,Monday|$Delhi ,Morning,wednesday|$Hyderabad,Afternoon,Sunday";
		
		String mixData[]=data.split("|");
		System.out.println(mixData);
		//for()
	}

}
