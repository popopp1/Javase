package com.fyx.javase.collection;

import java.util.HashSet;
import java.util.Set;

/*
HashSet集合：
    无序不可重复
 */
public class HashSetTest01 {
    public static void main(String[] args) {
        Set<String> strs = new HashSet<>();
        strs.add("hello4");
        strs.add("hello2");
        strs.add("hello1");
        strs.add("hello3");
        strs.add("hello1");
        strs.add("hello3");
        strs.add("hello2");
        strs.add("hello4");
        strs.add("hello1");

        /*1、存储时的顺序和取出的顺序不一样
          2、不可重复
          3、放到HashSet集合中的元素实际上是放到HashMap集合的key部分了。
         */
        for (String s :strs) {
            System.out.println(s);
        }
    }
}
