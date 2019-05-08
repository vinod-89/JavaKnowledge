package com.designpattern;

public class SingletonInner {
	private SingletonInner() {
	}
    private static class SingletonHelper{
    	private static final SingletonInner INSTANCE=new SingletonInner();
    }
    public static SingletonInner getInstatce() {
    	return SingletonHelper.INSTANCE;
    }
}
