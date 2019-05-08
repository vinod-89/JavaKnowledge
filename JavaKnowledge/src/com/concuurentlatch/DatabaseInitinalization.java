package com.concuurentlatch;

import java.util.concurrent.CountDownLatch;

public class DatabaseInitinalization implements Runnable {
	CountDownLatch latch;

	public DatabaseInitinalization(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
    System.out.println("Database initialization");
    try {
		Thread.sleep(30);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    System.out.println("Done database initiaLIZATIO N");
    latch.countDown();
	}

}
