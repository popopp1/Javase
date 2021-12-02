package com.fyx.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
深入Collection集合的contains方法：
    boolean contains(Object o)
        判断集合中是否包含某个对象o
        如果包含返回true，不包含返回false
    contains方法是用来判断集合中某个元素的方法，
    底层调用了equals方法进行比对
    equals方法返回true，就表示包含这个元素
 */
public class CollectionTest04 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();
        //向集合中存储元素
        String s1 = new String("abc");
        c.add(s1);
        String s2 = new String("def");
        c.add(s2);
        System.out.println("元素的个数是：" + c.size());//2

        String x = new String("abc");
        System.out.println(c.contains(x));//true

    }
}
