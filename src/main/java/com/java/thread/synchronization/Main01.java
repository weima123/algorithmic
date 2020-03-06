package com.java.thread.synchronization;


/**
 * @author : mawei
 * @description : TODO
 * @since : 2018/10/8
 */
public class Main01 {
    public static void main(String []args){
        PublicMethod publicMethod = new PublicMethod();
        AThread aThread = new AThread(publicMethod);
        BThread bThread = new BThread(publicMethod);
        aThread.start();
        bThread.start();
    }
}
