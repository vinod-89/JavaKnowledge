package com.multithreading;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueue {
public static void main(String args[]) {
	java.util.concurrent.BlockingQueue<Integer> queue=new ArrayBlockingQueue<Integer>(10);
	
	Producer p=new Producer(queue);
	Consumer c=new Consumer(queue);
	new Thread(p).start();
	new Thread(c).start();
}
}
