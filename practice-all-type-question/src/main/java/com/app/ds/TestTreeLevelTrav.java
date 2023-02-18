package com.app.ds;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

//Tree level traversal 
class Node {
		int data;
		Node leftNode;
		Node rightNode;
		Node(int data){
			this.data=data;
		}
	}


class TreeLevelTrav{
	Node root ;
	
	 
	

	public List<List<Integer>> printLevelByLevel(Node root){
		Queue<Node> q=new LinkedList<>();
		List<List<Integer>> levelOfTrav=new ArrayList<>();
		q.add(root);
		//int size=q.size();
		List<Integer> levelNodesData=null;
		while(!q.isEmpty()){
			levelNodesData=new ArrayList<Integer>();
			Node current=null;
			while(q.size()>0){
				current=q.remove();
				levelNodesData.add(current.data);
				System.out.print(current.data+"  -->  ");
				if(current.leftNode!=null){
					q.add(current.leftNode);
				}
				if(current.rightNode!=null){
					q.add(current.rightNode);
				}
			}
			System.out.println();
			levelOfTrav.add(levelNodesData);
		}
		return levelOfTrav;
	}
	
	
}

class TestTreeLevelTrav{
	public static void main(String ...args){
		TreeLevelTrav  binaryTree=new TreeLevelTrav();
		binaryTree.root = new Node(1);
     binaryTree.root.leftNode = new Node(2);
     binaryTree.root.rightNode = new Node(3);
     binaryTree.root.leftNode.leftNode = new Node(4);
     binaryTree.root.rightNode.leftNode = new Node(5);

		System.out.println(binaryTree.printLevelByLevel(binaryTree.root));
	   
		
	}
}