package com.java.thread.synchronization;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2018/9/30
 */
public class AThread extends Thread {

    private PublicMethod publicMethod;

    public AThread(PublicMethod publicMethod){
        super("a_thread");
        this.publicMethod = publicMethod;
    }

    @Override
    public void run(){
        this.publicMethod.add();
    }
}
