package com.designpattern;

public class MainSingleton {

	public static void main(String[] args) {
		SingletonInner in=SingletonInner.getInstatce();
		System.out.println(in);
	}

}
