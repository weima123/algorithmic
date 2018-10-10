package com.java.thread.synchronization;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2018/10/10
 */
public class Main04 {
    public static void main(String []args){
         Thread04A thread04A = new Thread04A();
         Thread04B thread04B = new Thread04B();
         thread04A.start();
         thread04B.start();
    }
}
