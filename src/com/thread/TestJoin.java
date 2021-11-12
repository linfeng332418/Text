package com.thread;

public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        RunableTest1 RunableTest1 = new RunableTest1();
        Thread t1  =new Thread(RunableTest1,"线程一");
        t1.start();

        for (int i = 0; i <15 ; i++) {
            if(i == 10){
                //线程一插队  可放时间哦
                t1.join();
            }
            System.out.println("主线程"+i);
        }


    }
}


class RunableTest1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <15 ; i++) {
            System.out.println(Thread.currentThread().getName()+"跑了----"+i);
        }


    }
}
