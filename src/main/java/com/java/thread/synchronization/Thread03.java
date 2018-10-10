package com.java.thread.synchronization;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2018/10/8
 */
public class Thread03 extends Thread {
    private String lock;

    public Thread03(String lock, String threadName) {
        super(threadName);
        this.lock = lock;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        synchronized (lock) {
            try {
                System.out.println(threadName + " 进入同步块代码");
                Thread.sleep(6000);
                System.out.println(threadName + " 离开同步块代码");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
