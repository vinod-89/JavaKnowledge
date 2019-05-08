package com.multithreading;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer1 implements Runnable {

	private final List<Integer> in;
	private final int MAX_SIZE;
	 private AtomicInteger itemNumber = new AtomicInteger(1);

	public Producer1(List<Integer> i, final int max) {
		in = i;
		MAX_SIZE = max;
	}

	@Override
	public void run() {
		synchronized (in) {
			while (in.size()<=MAX_SIZE) {
				if (in.size() == MAX_SIZE) {
					System.out.println("Queue is full waiting for empty");
					try {
						in.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					 Integer addItems = Integer.valueOf(itemNumber.getAndIncrement());
					   System.out.println("Produce : " + addItems);
                          in.add(addItems);
                          in.notifyAll();
                          try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
			}
		}

	}

}
