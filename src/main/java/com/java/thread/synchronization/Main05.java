package com.java.thread.synchronization;

/**
 * @author : mawei
 * @description :
 * @since : 2019-10-30 11:28
 */
public class Main05 {
    public static void main(String []args){
      DeadLockRunnable deadLockRunnable01 = new DeadLockRunnable(true);
      DeadLockRunnable deadLockRunnable02 = new DeadLockRunnable(false);

      Thread thread01 = new Thread(deadLockRunnable01);
      thread01.setName("thread01");
      Thread thread02 = new Thread(deadLockRunnable02);
      thread02.setName("thread02");
      thread01.start();
      thread02.start();
    }
}
