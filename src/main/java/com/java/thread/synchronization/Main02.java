package com.java.thread.synchronization;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2018/10/8
 */
public class Main02 {

    public static void main(String []args){
    PublicMethod publicMethod01 = new PublicMethod();
    PublicMethod publicMethod02 = new PublicMethod();
    AThread aThread = new AThread(publicMethod01);
    aThread.start();
    BThread bThread = new BThread(publicMethod02);
    bThread.start();
    }
}
