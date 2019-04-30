package com.map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrrentHashMAp {
public static void main(String args[]) {
	ConcurrentHashMap<Integer,String> chm=new ConcurrentHashMap<>();
	chm.put(3,"csa");
	System.out.println(chm);
}
}
