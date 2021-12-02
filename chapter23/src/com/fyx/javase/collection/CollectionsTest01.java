package com.fyx.javase.collection;

import java.util.*;

/*
java.util.Collection  集合接口
java.util.Collections  集合工具类，方便集合的操作
 */
public class CollectionsTest01 {
    public static void main(String[] args) {
        //ArrayList集合不是线程安全的
        List<String> list = new ArrayList<>();
        //变成线程安全的
        Collections.synchronizedList(list);

        //排序
        list.add("abf");
        list.add("abx");
        list.add("abc");
        list.add("abe");

        Collections.sort(list);
        for (String s: list) {
            System.out.println(s);
        }

        List<WuGui2> wuGui2s = new ArrayList<>();
        wuGui2s.add(new WuGui2(1000));
        wuGui2s.add(new WuGui2(8000));
        wuGui2s.add(new WuGui2(500));
        //注意：对List集合中元素排序，需要保证list集合中的元素实现了：Comparable接口
        Collections.sort(wuGui2s);
        for (WuGui2 wg: wuGui2s) {
            System.out.println(wg);
        }

        //对Set集合怎么排序呢？
        Set<String> set = new HashSet<>();
        set.add("king");
        set.add("kingsoft");
        set.add("king2");
        set.add("king1");
        //将set集合转换成List集合
        List<String> myList = new ArrayList<>(set);
        //排序
        Collections.sort(myList);
        //遍历
        for (String s: myList) {
            System.out.println(s);
        }
    }
}

class WuGui2 implements Comparable<WuGui2>{
    int age;

    public WuGui2(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "WuGui2{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(WuGui2 o) {
        return this.age - o.age;
    }
}
