package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        test2();
    }

   static void test(){

        //无须不可重复
      Set<Object> set = new HashSet<>();
       set.add("z");
       set.add("a");
       set.add("l");
       set.add("i");
       for (Object o : set) {
           System.out.println(o);
       }

   }

    static void test2(){

        HashSet<Student> set = new HashSet<>();
        set.add(new Student("zhang",22));
        set.add(new Student("lisi",23));
        set.add(new Student("zhang",22));

        System.out.println(set);
        for (Student student : set) {
            System.out.println(student);
        }

        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}


class Student{
    private  String name;
    private Integer age;


    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



