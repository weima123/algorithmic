package com.java.thread.synchronization;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2018/10/10
 */
public class Thread04A extends Thread {
    public Thread04A() {
        super("a_thread");
    }

    @Override
    public void run() {
        PublicMethod04.printB();
    }
}
