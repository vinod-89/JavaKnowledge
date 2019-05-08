package com.tester.thread.produce.consumer.utils;

import java.util.concurrent.TimeUnit;

public enum ThreadUtils {
    ONE_SECOND {
        @Override
        public void sleep() {
            _sleep(ordinal());
        }
    }, TWO_SECOND {
        @Override
        public void sleep() {
            _sleep(ordinal());
        }
    };

    public abstract void sleep();

    protected void _sleep(int unit) {
        try {
            System.out.println("Unit: " + unit);
            TimeUnit.SECONDS.sleep(unit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}