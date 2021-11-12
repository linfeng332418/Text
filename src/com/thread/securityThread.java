package com.thread;

public class securityThread {
    public static void main(String[] args) {

        windowThread w1 = new windowThread();
        w1.setName("窗一");
        windowThread w2 = new windowThread();
        w2.setName("窗二");

        w1.start();
        w2.start();

    }
}

class windowThread extends Thread{



   static int count = 60;
    @Override
    public void run() {

            while(true) {
                synchronized (""){
                    if(count<=0){
                        break;
                    }
                    System.out.println(Thread.currentThread().getName()+"买出了第"+count+"张票");

                    count--;
            }
        }

    }
}
