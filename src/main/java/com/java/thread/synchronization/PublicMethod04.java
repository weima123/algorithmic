package com.java.thread.synchronization;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2018/10/10
 */
public class PublicMethod04 {
    public static void printA(){
        synchronized (PublicMethod04.class) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " 进入printA");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " 离开printA");
        }
    }

    public static void printB(){
        synchronized (PublicMethod04.class) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " 进入printB");
            System.out.println(threadName + " 离开printB");
        }
    }
}
