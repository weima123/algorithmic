package com.java.thread.basicmethod.isalive;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2018/9/30
 */
public class MainThread {
    public static void main(String[] args) {
        AThread aThread = new AThread();
        aThread.start();
        try {
            aThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(aThread.getName()+"isAlive:"+aThread.isAlive());
    }
}
