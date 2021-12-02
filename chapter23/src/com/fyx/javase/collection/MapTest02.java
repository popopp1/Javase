package com.fyx.javase.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合的遍历

 */
public class MapTest02 {
    public static void main(String[] args) {
        //第一种方式：获取所有的key，通过遍历key，来遍历value
        Map<Integer,String> map  = new HashMap<>();
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        map.put(4,"zhaoliu");
        //遍历Map集合
        //获取所有的key，所有的key是一个set集合
        Set<Integer> keys = map.keySet();

        //遍历key，通过key获取value
        //迭代器
        /*
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            //取出一个key
            Integer key = it.next();
            //通过key获取value
            String values = map.get(key);
            System.out.println(key + "=" + values);
        }
         */
        //foreach
        for (Integer key : keys) {
            System.out.println(key + "=" + map.get(key));
        }

        //第二种方法：Set<Map.Entry<K,V>> entrySet()
        //以上这个方法是把Map集合直接全部转换成Set集合。
        //Set集合中元素的类型是：Map.Entry
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        //遍历Set集合，每一次取出一个Node
        Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String> node = it.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key + "=" + value);
        }
        //foreach
        //这种方式效率比较高，因为获取key和value都是直接从node对象中获取的属性值
        //这种方式比较适用于大量数据
        for (Map.Entry<Integer,String> node: set) {
            System.out.println(node.getKey() + "------------>" + node.getValue());
        }
    }
}
