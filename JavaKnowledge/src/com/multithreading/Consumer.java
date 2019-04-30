package com.multithreading;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
BlockingQueue<Integer> bq=null;
public Consumer(BlockingQueue< Integer> bq) {
	this.bq=bq;
}
public void run() {
	while(true) {
		try {
		System.out.println("consume by consumer " +bq.take());
	}catch(InterruptedException e) {
		}
	}
	
}
}
