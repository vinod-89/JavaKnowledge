package com.concuurentlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchMain {

	public static void main(String[] args) {
		try {
		CountDownLatch cdl=new CountDownLatch(2);
		UIInitialization u=new UIInitialization(cdl);
		DatabaseInitinalization di=new DatabaseInitinalization(cdl);
		Thread t1=new Thread(u);
		Thread t2=new Thread(di);
		t1.start();
		t2.start();
		cdl.await();
		   
		   System.out.println("Initialization has been completed, main thread can proceed now");
		  } catch (InterruptedException e) {
		 
		   e.printStackTrace();
		  }
	}

}
