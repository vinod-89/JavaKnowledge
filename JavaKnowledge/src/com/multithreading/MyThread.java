package com.multithreading;

public class MyThread{
public static void main(String args[]) {
	
	
	Thread t=new Thread(new Runnable() {
		@Override
		public void run() {
System.out.println("anonymonus object");			
		}
		
	});
	t.start();
	System.out.println("fsdsd");
}
}
