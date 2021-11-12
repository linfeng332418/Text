package com.demo;

import javax.naming.LimitExceededException;

public class Sort {

    public static void main(String[] args) {
        int[] arr = {5, 3,9, 2, 1, 4, 8, 10};

        quickSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

//
    public static void doubbSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {

                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }


            }
        }
    }



/*    */

    //选择排序
    public static void secetionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minPos]) {
                    minPos = j;
                }
            }

            int temp = a[minPos];
            a[minPos] = a[i];
            a[i] = temp;


        }

    }

    //插入排序:打牌的思想，比如从第二张牌开始 ，
    public static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }

    }
/*
    //希尔排序
    public static void xierSort(int [] a) {

    }*/

    //快速排序
    public static void quickSort(int[] a){
        //1.确定数组的0- 7号表 所有的数组
        int lo = 0;
        int hi = a.length -1 ;
        qsort(a,lo,hi);
    }

    public static void qsort(int[] a, int lo, int hi) {
        if(lo>=hi){
            return;
        }
        //分组：左子组，右子组
        int pratition = pratition(a, lo, hi);
        //递归左子组
        qsort(a,lo,pratition-1);
        //递归右子组
        qsort(a,pratition+1,hi);

    }

    public static int pratition(int[] a, int lo, int ri){
        /**\
         * 如何找到咋们的那个中间索引
         */
        int key  =a[lo];
        int left = lo ;
        int right = ri+1;
        while (true){
            while(a[--right]>key){//移动左指针
                if(right == lo){
                    break;
                }
            }
            while (a[++left]<key){//移动右指针
                if(left == ri){
                    break;
                }
            }
            if(left>=right){
                break; //返回一个right
            }else{
                //交换
                int temp = a[right];
                a[right] =a [left];
                a[left] = temp;
            }
        }
        int temp = a [right];
        a[right]=a[lo];
        a[lo] = temp;
        return right;
    }



}