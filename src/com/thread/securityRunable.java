package com.thread;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class securityRunable {


    public static void main(String[] args) {
        windowThread2 windowThread2 = new windowThread2();
        Thread t1 = new Thread(windowThread2,"一");
        Thread t2= new Thread(windowThread2,"二");
        t1.start();
        t2.start();

    }
}
class windowThread2 implements Runnable{



    static int count = 60;
    @Override
    public void run() {

        while(true) {
            synchronized (this){
                if(count<=0){
                    break;
                }
                System.out.println(Thread.currentThread().getName()+"买出了第"+count+"张票");

                count--;
            }
        }

    }
}
