package com.java.thread.basicmethod.join;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2018/9/30
 */
public class ThreadB extends Thread {

    ThreadA threadA;
    public ThreadB(ThreadA threadA){
        super("[ThreadB]");
        this.threadA = threadA;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName+"start ..");
        try {
            threadA.join();
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(threadName+"exception ..");
        }
        System.out.println(threadName+"end ..");
    }
}
