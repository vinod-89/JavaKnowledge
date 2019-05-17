package com.collection;

import java.util.*;

public class GFG {
	public static void main(String[] args) {
		Geek g1 = new Geek("aditya2", 2);
		Geek g2 = new Geek("aditya", 1);

		Map<Geek, String> map = new HashMap<Geek, String>();
		map.put(g1, "CSE");
		map.put(g2, "IT");
       System.out.println("this is equal object " +g1.equals(g2));
		for (Geek geek : map.keySet()) {
			System.out.println(map.get(geek).toString());
		}

	}
}
