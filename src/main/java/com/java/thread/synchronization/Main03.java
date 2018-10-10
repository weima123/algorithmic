package com.java.thread.synchronization;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2018/10/8
 */
public class Main03 {
    public static void main(String[] args) {
        String lock = new String("345");
        String lock02 = new String("456");
        Thread03 a_thread = new Thread03(lock,"a_thread");
        a_thread.start();
        Thread03 b_thread = new Thread03(lock02,"b_thread");
        b_thread.start();
    }
}
