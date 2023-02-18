package com.app.annotation;


@Course(cId="C-1002",cName="JAVA" ,cFee="10000")
class Student{
	private String sName;
	private String sId;
	
	Student(String sName,String sId){
		this.sName=sName;
		this.sId=sId;
	}
	Student(){
		
	}
	@Course(cId="C-10028",cFee="100000")
	public void getStudentDtl(){
		System.out.println("Student Name :"+sName+" Student Id :"+sId);
	}
	
}