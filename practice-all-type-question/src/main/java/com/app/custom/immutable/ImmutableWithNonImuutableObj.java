package com.app.custom.immutable;

import java.util.Date;

//Employee.java
final class Employee {
private final String empName;
private final int age;
private final Address address;
public Employee(String name, int age, Address address) {
   super();
   this.empName = name;
   this.age = age;
   this.address = address;
}
public String getEmpName() {
   return empName;
}
public int getAge() {
   return age;
}
/* public Address getAddress() {
   return address;
   }
*/
public Address getAddress() throws CloneNotSupportedException {
   return (Address) address.clone();
}
}
//Address.java
class Address implements Cloneable {
public String addressType;
public String address;
public String city;
public Date date;
public Address(String addressType, String address, String city,Date date) {
   super();
   this.addressType = addressType;
   this.address = address;
   this.city = city;
   this.date=date;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public String getAddressType() {
   return addressType;
}
public void setAddressType(String addressType) {
   this.addressType = addressType;
}
public String getAddress() {
   return address;
}
public void setAddress(String address) {
   this.address = address;
}
public String getCity() {
   return city;
}
public void setCity(String city) {
   this.city = city;
}
public Object clone() throws CloneNotSupportedException {
   return super.clone();
}

@Override
public String toString() {
   return "Address Type - "+addressType+", address - "+address+", city - "+city+" Date ="+date;
}
}
//MainClass.java
public class ImmutableWithNonImuutableObj {
public static void main(String[] args) throws Exception {
   Employee emp = new Employee("Adithya", 34, new Address("Home", "Madhapur", "Hyderabad",new Date()));
   Address address = emp.getAddress();
   System.out.println(address);
   Thread.sleep(100000);
   address.setAddress("Hi-tech City");
   address.setAddressType("Office");
   address.setCity("Hyderabad");
   address.setDate(new Date());
   System.out.println(emp.getAddress());
}
}