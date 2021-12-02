package com.fyx.javase.collection;

import java.util.TreeSet;

/*
1、TreeSet集合底层实际上是一个TreeMap
2、TreeMap集合底层是一个二叉树
3、放到TreeSet集合中的元素等同于放到TreeMap集合key部分了
4、TreeSet集合中元素：无序不可重复，但是存储元素可以自动按照大小顺序！
称为：可排序集合
 */
public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        //添加String
        ts.add("zhangsan");
        ts.add("lisi");
        ts.add("wnagwu");
        ts.add("wangliu");
        ts.add("ljy");
        //遍历
        for (String s : ts) {
            System.out.println(s);//按照字典顺序，升序
        }

        TreeSet<Integer> ts2 = new TreeSet<>();
        ts2.add(100);
        ts2.add(200);
        ts2.add(900);
        ts2.add(800);
        ts2.add(600);
        ts2.add(20);
        for (Integer i:ts2) {
            System.out.println(i);
        }
    }
}
