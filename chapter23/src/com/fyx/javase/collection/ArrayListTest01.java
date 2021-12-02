package com.fyx.javase.collection;

import java.util.ArrayList;
import java.util.List;

/*
ArrayList
    1、默认初始化容量是10(底层先创建一个长度为0的数组，当添加第一个元素时，初始化容量10)
    2、集合底层是一个Object[]数组。
    3、构造方法：
        new ArrayList();
        new ArrayList(20)
    4、ArrayList集合的扩容
        增长到原容量的1.5倍
        ArrayList集合底层是数组，尽可能少的扩容。因为数组扩容效率比较低，建议在使用ArrayList集合的时候与估计元素的个数
        给定一个初始化容量
    5、数组优缺点：
        优点：检索效率比较高
        缺点：随机增删元素效率比较低
    6、向数组末尾添加元素，效率很高，不受影响
    7、这么多集合中，用的最多就是：ArrayList集合
    8、ArrayList集合是非线程安全的。
 */
public class ArrayListTest01 {
    public static void main(String[] args) {
        //默认初始化容量是10   数组的长度是10
        List list1 = new ArrayList();

        //指定初始化容量为20   数组的长度是20
        List list2 = new ArrayList(20);
        System.out.println(list2.size());//0

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        System.out.println(list1.size());//10

        list1.add(11);
        System.out.println(list1.size());//11

    }
}
