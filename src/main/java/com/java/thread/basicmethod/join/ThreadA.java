package com.java.thread.basicmethod.join;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2018/9/30
 */
public class ThreadA extends Thread {
    public ThreadA() {
        super("[ThreadA]");
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName+"thread start ..");
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(threadName+"thread exception..");
        }
        System.out.println(threadName + " end ..");
    }
}
