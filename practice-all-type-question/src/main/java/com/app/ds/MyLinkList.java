package com.app.ds;

public class MyLinkList {
	private int capacity;
	private int size=0;
	private Node first;
	private Node last;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
		Node(){
			
		}
	}
	MyLinkList(){
		capacity=10;
	}
	MyLinkList(int capacity){
		this.capacity=capacity;
	}
	// addLast()
	// addLast();
	// addElementAt(int index)
	// getElement
	
	
	public void addLast(int data) {
		Node currentNode=new Node(data);
		if(isEmpty()||first==null) {
			first=last=currentNode;
			size++;
		}else {
			last.next=currentNode;
			last=currentNode;
			size++;
		}
		
	}
	public void addFirst(int data) {
		Node currentNode=new Node(data);
		if(first==null||isEmpty()) {
			first=last=currentNode;
			size++;
		}else {
			currentNode.next=first;
			first=currentNode;
			size++;
		}
	}
	public void addElementAt(int index,int val) {
		if(index<0) {
			throw new IllegalArgumentException();
		} 
		Node currentNode=first;
		while (currentNode!=null) {
			int count=0;
			if(++count==index) {
				Node idxNextNode=currentNode.next;
				currentNode.next=new Node(val);
				if(currentNode.next!=null) {
				  currentNode.next.next=idxNextNode;
				}
				size++;
				break;
			}
		}
		
		
	}
	public void removeFirst() {
		if(first==null||isEmpty()) {
			throw new IllegalArgumentException();
		}
		Node current=first.next;
		first=current;
		size--;
	}
	public void removeLast() {
		if (last==null||first==null||isEmpty()) {
			throw new IllegalArgumentException();
		}
		Node current=first;
		while(current!=null) {
			if(current.next==last) {
				current.next=null;
				last=current;
			}
			current=current.next;
		}
	}
	public void removeAt(int index) {
		if (index<0||index>size||last==null||first==null||isEmpty()) {
			throw new IllegalArgumentException();
		}
		int count=0;
		if(index==0) {
			removeFirst();
			return ;
		}else if(index+1==size) {
			removeLast();
			return ;
		}
		Node currentNode=first;
		while(currentNode!=null) {
			if(++count==index) {
				if(currentNode.next.next!=null) {
				   currentNode.next=currentNode.next.next;
				}else {
				   last=currentNode.next;
				}
				size--;
				break;
			}
			currentNode=currentNode.next;
		}
	}
	/*remove middle element in link list if node are even the remove middle+1*/
	public void removeMiddle() {
	   int middleElementIdx=size/2;
	   removeAt(middleElementIdx);
	}
	/*method to use */
	public void print() {
	    Node currentNode=first;
		while (currentNode!=null) {
		    System.out.println(currentNode.data+"\t");
		    currentNode=currentNode.next;
    	}
	}
	//check for empty
	public boolean isEmpty() {
		return size==0?true:false;
	}

}
