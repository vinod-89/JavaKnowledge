package com.ds.tree;

 
import java.util.TreeMap; 
import java.util.Vector;
import java.util.ArrayList;
import java.util.Map.Entry; 

public class VerticalOrderBtree 
{ 
	
	static class Node 
	{ 
		int key; 
		Node left; 
		Node right; 
		
		Node(int data) 
		{ 
			key = data; 
			left = null; 
			right = null; 
		} 
	} 
	
	static void getVerticalOrder(Node root, int hd,TreeMap<Integer,ArrayList<Integer>> m) 
	{ 
		 
		if(root == null) 
			return; 
		
		ArrayList<Integer> get = m.get(hd); 
		
		if(get == null) 
		{ 
			get = new ArrayList<>(); 
			get.add(root.key); 
		} 
		else
			get.add(root.key); 
		
		m.put(hd, get); 
		
		getVerticalOrder(root.left, hd-1, m); 
		
		getVerticalOrder(root.right, hd+1, m); 
	} 
	
	static void printVerticalOrder(Node root) 
	{  
		TreeMap<Integer,ArrayList<Integer>> m = new TreeMap<>(); 
		int hd =0; 
		getVerticalOrder(root,hd,m); 
		
	
		for (Entry<Integer, ArrayList<Integer>> entry : m.entrySet()) 
		{ 
			System.out.println(entry.getValue()); 
		} 
	} 
	
	public static void main(String[] args) { 

		Node root = new Node(1); 
		root.left = new Node(2); 
		root.right = new Node(3); 
		root.left.left = new Node(4); 
		root.left.right = new Node(5); 
		root.right.left = new Node(6); 
		root.right.right = new Node(7); 
		root.right.left.right = new Node(8); 
		root.right.right.right = new Node(9); 
		System.out.println("Vertical Order traversal is"); 
		printVerticalOrder(root); 
	} 
} 
