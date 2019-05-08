package com.multithreading;

import java.util.ArrayList;

public class ProducerConsumerMain {

	public static void main(String[] args) {
	    ArrayList<Integer> task =new ArrayList<Integer>();
	    final int maxSize = 10;
		Producer1 p1 = new Producer1(task,maxSize);
		Consumer1 c1 = new Consumer1(task);
		new Thread(p1).start();
		new Thread(c1).start();

	}

}
