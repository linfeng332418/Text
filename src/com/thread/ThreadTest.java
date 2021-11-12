package com.thread;

public class ThreadTest {
    public static void main(String[] args) {

        Thread thread = new Thread(new rabbitThread(),"一");
        Thread thread2 = new Thread(new rabbitThread());
        thread2.setName("二");

        thread.setPriority(9);
        thread2.setPriority(1);

        thread.start();
        thread2.start();

    }
}

class rabbitThread implements  Runnable{

    @Override
    public void run() {

        int i= 1;
        while (i<=100){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "线程跑了");
            i++;
        }
    }
}
