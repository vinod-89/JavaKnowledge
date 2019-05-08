package com.concuurentlatch;

import java.util.concurrent.CountDownLatch;

public class UIInitialization implements Runnable {
	CountDownLatch latch;

	public UIInitialization(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("UIInitialization successfully ");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Done with UI Initialization");
		latch.countDown();

	}

}
