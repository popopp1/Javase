package com.fyx.javase.bean;

import java.util.HashMap;
import java.util.Map;

/*
HashMap集合key部分允许null吗？
    允许
    但是注意：HashMap集合的key null值只有一个
 */
public class HashMapTest03 {
    public static void main(String[] args) {
        Map map = new HashMap();

        //HashMap集合允许key为null
        map.put(null,null);
        System.out.println(map.size());//1

        //key重复的话value是覆盖
        map.put(null,100);
        System.out.println(map.size());//1

        //通过key获取value
        Object o = map.get(null);
        System.out.println(o);//100
    }
}
