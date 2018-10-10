package com.java.thread.synchronization;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2018/9/30
 */
public class BThread extends Thread{
    private PublicMethod publicMethod;

    public BThread(PublicMethod publicMethod){
        super("b_thread");
        this.publicMethod = publicMethod;
    }

    @Override
    public void run(){
        publicMethod.add();
    }
}
