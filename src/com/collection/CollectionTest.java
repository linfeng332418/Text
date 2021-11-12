package com.collection;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {


      List<Object> objects = new ArrayList<>();
        test5();

    }



    public static void Collectiontest1(){

        Collection<Object> objects = new ArrayList<>();
        objects.add("z");
        objects.add("l");
        objects.add("f");

        System.out.println(objects);
    }

    public static void Collectiontest2(){

        Collection<Object> c = new ArrayList<>();
        c.add("z");
        c.add("l");
        c.add("f");

    
        System.out.println(c);
        c.remove("l");
        System.out.println(c);
    }

    public static void test3(){
        Collection<Object> c = new ArrayList<>();
        c.add("z");
        c.add("l");
        c.add("f");
        Iterator<Object> iterator = c.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public static void test4(){
        Collection<Object> c = new ArrayList<>();
        c.add("z");
        c.add("l");
        c.add("f");
        for (Object o : c) {
            String o1 = (String) o;
            String s = o1.toUpperCase();
            System.out.println(s);
        }


    }


    public static void test5(){
        Collection<Integer> c = new ArrayList<>();
        c.add(12);
        c.add(14);
        c.add(15);
        c.add(11);

        Iterator<Integer> iterator = c.iterator();

         while (iterator.hasNext()){
            if(iterator.next()==15){
                /**
                 * 只能这样删除
                 * 不能c.remove()方法，不然会抛异常
                 */
               iterator.remove();
            }

        }

        for (Integer integer : c) {
            System.out.println(integer);
        }
    }
    public static void test6(){
        List<String> list = new ArrayList<>();

        list.add("zhnagsan");
        list.add("lisi");
        list.add("wangwu");
        String[] strings = list.toArray(new String[]{});

        System.out.println(strings);

    }
    public static void test7(){
        /**
         * 遍历list集合的几种情况
         */
        List<String> list = new ArrayList<>();
        list.add("zhang");
        list.add("li");
        list.add("zhansgan");
        //1
        for (String s : list) {
            System.out.println(s);
        }
        //2通过数组的大小，list的get(索引)
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
        //3.iterator迭代器遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasPrevious()){
            System.out.println("list  Iterator.previous() = " + listIterator.previous());
        }

    }
    public static void test8(){

    }



}
