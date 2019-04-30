package com.multithreading;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
BlockingQueue<Integer> bq=null;
public Producer(BlockingQueue<Integer> bq) {
	this.bq=bq;
}
@Override
public void run() {
	for(int i=0;i<10;i++) {
	System.out.println("producer thread "+i);
	try {
	bq.put(i);
	}catch(InterruptedException e) {
		System.out.println("producer message");
	}
	}
}

}
