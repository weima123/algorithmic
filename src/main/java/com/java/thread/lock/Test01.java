package com.java.thread.lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2019-10-31 14:27
 */
public class Test01 implements Runnable {


    private List<Integer> numList = new ArrayList<>();
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        try {
            lock.lockInterruptibly();
        } catch (InterruptedException e) {
            System.out.println(tName + "中断");
        }
        System.out.println(tName + "获得了锁");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++) {
            numList.add(i);
        }
        lock.unlock();
        System.out.println(tName + "释放了锁");

    }

    public static void main(String[] args) throws InterruptedException {
        Test01 test01 = new Test01();
        Thread thread01 = new Thread(test01, "thread01");
        Thread thread02 = new Thread(test01, "thread02");
        thread01.start();
        thread02.start();
        Thread.sleep(1500);
        thread02.interrupt();
    }


}
