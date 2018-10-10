package com.java.thread.basicmethod.join;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2018/9/30
 */
public class MainThread {
    public static void main(String []args){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName+" start..");
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB(threadA);
        threadB.start();
        threadA.start();
        try {
            threadA.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(threadName+" exception ..");
        }
        System.out.println(threadName+" end ..");

    }
}
