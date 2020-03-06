package com.java.thread.synchronization;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2019-10-30 11:48
 */
public class Main06 {

    public static void  main(String [] args){
        Object object01 = new Object();
        Object object02 = new Object();

        DeadLockRunnable02 runnable01 = new DeadLockRunnable02(object01,object02);
        DeadLockRunnable02 runnable02 = new DeadLockRunnable02(object02,object01);

        Thread thread01 = new Thread(runnable01,"thread01");
        Thread thread02 = new Thread(runnable02,"thread02");

        thread01.start();
        thread02.start();
    }
}
