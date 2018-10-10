package com.java.thread.synchronization;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2018/10/10
 */
public class Thread04B extends Thread {

    public Thread04B() {
        super("b_thread");
    }

    @Override
    public void run() {
        super.run();
        PublicMethod04.printB();
    }
}
