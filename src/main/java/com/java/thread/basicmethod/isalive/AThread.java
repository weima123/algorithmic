package com.java.thread.basicmethod.isalive;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2018/9/30
 */
public class AThread extends Thread {

    public AThread() {
        super("[AThread]");
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName+"isAlive:"+Thread.currentThread().isAlive());
    }
}
