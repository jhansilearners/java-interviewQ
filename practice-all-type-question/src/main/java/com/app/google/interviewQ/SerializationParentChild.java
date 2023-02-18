package com.app.google.interviewQ;

import java.io.Serializable;

public class SerializationParentChild {

}

class Parent implements Serializable{
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}

class Child extends Parent{
	private Integer age;
	private String hight;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getHight() {
		return hight;
	}
	public void setHight(String hight) {
		this.hight = hight;
	}
	
	// need to override method like and throw some exception 
	public void readObject() {
		
	}
	public void wirteObject() {
		
	}
	
}