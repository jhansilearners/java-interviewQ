package com.app.ds;

public class GenArray<E> {
   int capacity;
   int size=0;
   Object[] elements;
   GenArray(int capacity){
	   this.capacity=capacity;
	   elements=new Object[capacity];
	   
   }
   GenArray(){
	   this.capacity=10;
	   elements=new Object[capacity];
	   
   }
   
   
   public void add(E item) {
		  if(size<capacity) {
			  Object[] newElements=new Object[capacity*2];
			  for (int i = 0; i < size; i++) {
				  newElements[i]=elements[i];
			  }
			  newElements[size++]=item;
			  elements=newElements;  
		  }else {
			  elements[size++]=item;
		  }
	  }
	  public void removeAt(int index) {
		 if(index>size||index<0) {
			 throw new IllegalArgumentException();
		 }
		 for(int i=index;i<size;i++) {
			 elements[i]=elements[i+1];
		 }
		 size--;
	  }
	  public int indexOf(E item) {
		  int idx=-1;
		  if(item==null) {
			  for(int i=0;i<size;i++) {
				  if(elements[i]==null) {
					  idx=i;
					  break;
				  }
			  }
		  }else {
			  for(int i=0;i<size;i++) {
				  if(item.equals(elements[i])) {
					  idx=i;
					  break;
				  }
			  }
		  }
		  return idx;
	  }
	  public boolean contains(E item) {
		  if(indexOf(item)>0) 
			  return true;
		  else 
			  return false;
	  }
	  @SuppressWarnings("unchecked")
	  public E get(int index) {
		  indexValidate(index);
		  return (E) elements[index];
	  }
	  
	  public boolean isEmpty() {
		  return size==0?true:false;
	  }
	  public void indexValidate(int index) {
		  if(isEmpty()||index<0) {
			  throw new IllegalArgumentException();
		  }
	  }
	  

   
   public void print() {
	   for (int i = 0; i < size; i++) {
		  System.out.println(elements[i]);
	   }
   }
}
