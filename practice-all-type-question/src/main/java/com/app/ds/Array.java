package com.app.ds;

public class Array {
  private int size=0;
  private int capacity;
   int[] itemArr =new int[capacity];
   Array(int capacity){
	   this.capacity=capacity;
   }
   Array() {
	capacity=10;
  }
  public void add(int item) {
	  if(size<capacity) {
		  int[] newItemArr=new int[capacity*2];
		  for (int i = 0; i < size; i++) {
			 newItemArr[i]=itemArr[i];
		  }
		  newItemArr[size++]=item;
		  itemArr=newItemArr;  
	  }else {
		  itemArr[size++]=item;
	  }
  }
  public void removeAt(int index) {
	 if(index>size||index<0) {
		 throw new IllegalArgumentException();
	 }
	 for(int i=index;i<size;i++) {
		 itemArr[i]=itemArr[i+1];
	 }
	 size--;
  }
  public int indexOf(int item) {
	  int idx=-1;
	  for(int i=0;i<size;i++) {
		  if(itemArr[i]==item) {
			  idx=i;
			  break;
		  }
	  }
	  return idx;
  }
  public boolean contains(int item) {
	  if(indexOf(item)>0) 
		  return true;
	  else 
		  return false;
  }
  public void print() {
	  for (int i = 0; i < size; i++) {
		 System.out.println(itemArr[i]);
	  }
  }
}
