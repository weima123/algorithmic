package com.java.thread.basicmethod.wait;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2020-03-01 17:20
 */
public class WaitTest {
    public static volatile List<String> list = new ArrayList<>();

    public static Object lock = new Object();

    public static void main(String[] args) {
        Thread thread01 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(Thread.currentThread().getName() + "添加了第" + i + "个元素");
                        if (i == 5) {
                            System.out.println("thread01向thread02发送通知");
                            lock.notify();
                        }
                    }
                }
            }
        });
        Thread thread02 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("thread02启动");
                    if (list.size()<5){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("thread02被唤醒");
                    System.out.println("thread02开始执行任务");
                }

            }
        });

        thread02.start();
        thread01.start();

    }
}
