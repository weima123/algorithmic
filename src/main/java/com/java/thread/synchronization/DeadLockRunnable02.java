package com.java.thread.synchronization;

/**
 * @author : mawei
 * @description :
 * @since : 2019-10-30 11:42
 */
public class DeadLockRunnable02 implements Runnable {
    private Object object01 ;
    private Object object02 ;

    private String tName ;

    public DeadLockRunnable02(Object object01, Object object02) {
        this.object01 = object01;
        this.object02 = object02;
    }

    @Override
    public void run(){
        tName = Thread.currentThread().getName();
        synchronized (object01){
            System.out.println(tName + "lock"+ object01);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (object02){
                System.out.println(tName + "lock" + object02);
            }
            System.out.println(tName + "release-lock" + object02);
        }
        System.out.println(tName + "release-lock" + object01);
    }
}
