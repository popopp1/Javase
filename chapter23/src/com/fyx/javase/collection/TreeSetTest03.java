package com.fyx.javase.collection;

import java.util.TreeSet;

/*
对自定义的类型来说，TreeSet可以排序吗？
    以下程序对于Person类来说，无法排序，因为没有指定Person对象之间的比较规则
    谁大谁小

    以下程序出现这个异常：
        java.lang.ClassCastException:
            com.fyx.javase.collection.Person
            cannot be cast to java.lang.Comparable
    出现这个异常的原因是因为：
        Person类没有实现java.lang.Comparable接口

 */
public class TreeSetTest03 {
    public static void main(String[] args) {
        Person p1 = new Person(20);
        Person p2 = new Person(30);
        Person p3 = new Person(25);
        Person p4 = new Person(32);

        TreeSet<Person> ts = new TreeSet<>();
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);
        for (Person p : ts) {
            System.out.println(p);
        }//Person cannot be cast to java.lang.Comparable
    }
}

class Person{
    int age;

    public Person(int age) {
        this.age = age;
    }
    //重写toString()方法
    @Override
    public String toString() {
        return "Person{" + "age=" + age + '}';
    }
}