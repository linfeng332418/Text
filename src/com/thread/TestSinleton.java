package com.thread;

import java.util.Map;

public class TestSinleton {
    public static void main(String[] args) {
        Sinleton sinleton = Sinleton.sinleton;
        Sinleton sinleton2 =   Sinleton.sinleton;
        System.out.println(sinleton== sinleton2);
    }
}
class Sinleton{

    public static Sinleton sinleton = new Sinleton();

    private Sinleton(){
        
    }
}


class Sinleton2{
    private static Sinleton2 sinleton2;
    private Sinleton2(){

    }
    public static Sinleton2 getInstance(){

        if(sinleton2==null){
            sinleton2 = new Sinleton2();
    }
        return sinleton2;
    }

}