/*
package com.sequence;

import java.util.Iterator;

public class SequenceList<T> implements Iterable<T>{
    //存储元素的数组
    private T[] eles;
    //记录当前顺序表中的元素个数
    private int N;

    //构造方法
    public SequenceList(int capacity){
        this.eles =(T[]) new Object[capacity];
        this.N = 0;
    }

    //将一个线性表置为空表
    public void clear(){
        this.N=0;
    }

    //判断当前线性表是否为空表
    public boolean isEmpty(){
        return this.N == 0;
    }

    //获取线性表的长度
    public int length(){
        return N;
    }

    //获取指定位置的元素
    public T get(int i){
        return eles[i];
    }

    //向线型表中添加元素t
    public void insert(T t){
        //
        eles[N++] = t;
    }

    //在i元素处插入元素t
    public void insert(int i,T t){
        //在插入位置的后方的数据全部删除
        for (int index = N; index > i ; index--) {
            eles[index] =  eles[index-1];
        }
        eles[i] = t;
        N++;
    }

    //删除指定位置i处的元素，并返回该元素
    public T remove(int i){
        T t =  eles[i];
        //删除i处的元素
        for (int j = i ; j < N ; j++) {
            eles [j] = eles[j+1];
        }
        N--;
        return  t ;
    }


    //查找t元素第一次出现的位置
    public int indexOf(T t){
        for (int index = 0; index < N ; index++) {
            if(eles[index].equals(t) ){
                return index;
            }
        }
        return  -1;
    }

    //根据参数newSize，重置eles的大小
    public void resize(int newSize){

    }


    @Override
    public Iterator<T> iterator() {

    }

    private class SIterator implements Iterator{

    }
}
*/
