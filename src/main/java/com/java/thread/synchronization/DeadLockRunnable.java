package com.java.thread.synchronization;

/**
 * @author : mawei
 * @description :
 * @since : 2019-10-30 11:17
 */
public class DeadLockRunnable implements Runnable {
    private static Object object01 = new Object();
    private static Object object02 = new Object();

    private Boolean isLocked;

    private  String threadName;

    public DeadLockRunnable(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    @Override
    public void run(){
        threadName = Thread.currentThread().getName();
        if (this.isLocked){
            synchronized (object01){
                System.out.println(threadName +"locked by object01");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object02){
                    System.out.println(threadName + "locked by object02");
                }
            }

        }else {
            synchronized (object02){
                System.out.println(threadName + "locked by object02");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (object01){
                    System.out.println(threadName + "locked by object01");
                }
            }

        }
    }
}
