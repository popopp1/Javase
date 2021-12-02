package com.fyx.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    测试List接口中常用的方法
        1、List集合存储元素特点：有序可重复
            有序：List集合中的元素有下标
            从0开始，以1递增
            可重复：存储一个1，还可以再存储一个1
        2、List既然是Collection接口的子接口，那么肯定List接口有自己“特色”的方法：
            void add(int index,Object element)
            Object get(int index)
            int indexOf(Object o)
            int lastIndexOf(Object o)
            Object remove(int index)
            Object set(int index,Object element)

 */
public class ListTest01 {
    public static void main(String[] args) {
        //创建List类型的集合
        List myList = new ArrayList();

        //添加元素
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("C");
        myList.add("C");
        myList.add(1,"king");

        //迭代
        Iterator it = myList.iterator();
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }
        //根据下标获取元素
        Object firstObj = myList.get(2);
        System.out.println(firstObj);

        //因为有下标，所有List有它自己比较特殊的遍历方式，通过下标遍历
        for (int i = 0; i <myList.size() ; i++) {
            Object obj = myList.get(i);
            System.out.println(obj);
        }
        //获取指定对象第一次出现出的索引
        System.out.println(myList.indexOf("king"));//1

        //获取指定对象最后一次出现的索引
        System.out.println(myList.lastIndexOf("C"));//5

        //删除指定下标位置的元素
        myList.remove(0);
        System.out.println(myList.size());//5
        System.out.println("=============================");
        //修改指定位置的元素
        myList.set(2,"Soft");
        for (int i = 0; i <myList.size() ; i++) {
            Object o = myList.get(i);
            System.out.println(o);
        }
    }
}
