package com.multithreading;

import java.util.List;

public class Consumer1 implements Runnable {
	private final List<Integer> stringList;

	public Consumer1(List<Integer> listOfItems) {
		stringList = listOfItems;
	}

	@Override
	public void run() {
		synchronized (stringList) {
			while (stringList.size()>=0) {
				if (stringList.size() == 0) {
					 System.out.println("Queue is empty, Let have some order.\nConsumer Thread Waiting");
					try {
						stringList.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				else {
					Integer removeItems = stringList.remove(0);
                    System.out.println("Consumer : " + removeItems);
                    stringList.notifyAll();
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
