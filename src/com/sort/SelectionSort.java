package com.sort;

public class SelectionSort {
    public static void main(String[] args) {
        int [ ] a ={8,4,3,2,1,6,5,7};
        for (int i = 0;i<a.length-1;i++){
            //先设定第一个为最小位置
            int minPos =i; //设最小位置为0
            for(int j =i+1;j<a.length;j++){ //j

                if(a[minPos]>a[j]){
                    //就是不断记录最小的小表
                    minPos = j;
                }
            }
            //每次找完最小下标的数 ，就交换
            int temp =  a[minPos];
            a[minPos] = a[i];
            a[i] =temp;
        }

        for(int t=0;t<a.length;t++){
            System.out.println("排序之后的 = " + a[t]);
        }



    }
}
