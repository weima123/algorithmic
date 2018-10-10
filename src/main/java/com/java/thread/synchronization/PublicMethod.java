package com.java.thread.synchronization;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2018/9/30
 */
public class PublicMethod {
    private int num;

    public PublicMethod(int num) {
        this.num = num;
    }

    public PublicMethod() {
    }

    public int getNum() {
        return num;
    }


    public void setNum(int num) {
        this.num = num;
    }

    synchronized  public void add() {
        {
            String threadName = Thread.currentThread().getName();
            if ("a_thread".equalsIgnoreCase(threadName)) {
                num = 100;
                System.out.println("a_thread set num over ");
                try {
                    Thread.sleep(6000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                num = 200;
                System.out.println("b_thread set num over ");
            }

            System.out.println(threadName + " num =" + num);
        }
    }
}
