package com.reflection;

import java.util.*;

public class ListInJava {
	public static void main(String args[]) {
	List<Integer> l1=new ArrayList<Integer>();
	l1.add(4);
	l1.add(5);
	l1.add(6);
	l1.add(7);	
	l1.add(23);
	List<Integer> l2=new ArrayList<Integer>();
	l2.add(6);
	l2.add(4);
	l2.add(4);
	l2.add(5);
	l2.add(23);
	l2.add(5);
	l2.addAll(l1);
	for(Integer i:l2) {
		System.out.println(i);
		l2.remove(1);
	}
	
	System.out.println("add "+l2);
	//l2.remove(3);
	System.out.println("add remove "+l2);
	l2.clear();
	System.out.println("clear "+l2);
	
	
	
}
}