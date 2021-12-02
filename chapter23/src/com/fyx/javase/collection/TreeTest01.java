package com.fyx.javase.collection;

import java.util.Set;
import java.util.TreeSet;

/*
TreeSet集合存储元素特点：
    1、无序不可重复，但是存储元素可以自动按照大小顺序！
    称为：可排序集合
 */
public class TreeTest01 {
    public static void main(String[] args) {
        Set<String> strs = new TreeSet<>();
        strs.add("A");
        strs.add("B");
        strs.add("Z");
        strs.add("Y");
        strs.add("P");
        strs.add("K");
        strs.add("M");
        for (String s : strs){
            System.out.println(s);//从小到大排序
        }
    }
}
