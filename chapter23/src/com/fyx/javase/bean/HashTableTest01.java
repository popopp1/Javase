package com.fyx.javase.bean;

import java.util.Hashtable;
import java.util.Map;

/*
Hashtable的key可以为null吗？
    Hashtable的key和value都是不能为null的
    HashMap集合的key和value都是可以为null的

Hashtable的方法都带有synchronized：线程安全的
线程安全有其他方案，这个Hashtable对线程安全的处理
导致效率较低

Hashtable和HashMap底层都是哈希表
Hashtable的初始化容量是11，加载因子是0.75f
Hashtable扩容：原容量*2+1
 */
public class HashTableTest01 {
    public static void main(String[] args) {
        Map map = new Hashtable();
        map.put(null,"123");
        System.out.println(map.size());//java.lang.NullPointerException

        map.put("123",null);
        System.out.println(map.size());//java.lang.NullPointerException

    }
}
