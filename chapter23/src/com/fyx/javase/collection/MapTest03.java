package com.fyx.javase.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
Map集合的遍历
 */
public class MapTest03 {
    public static void main(String[] args) {
        //创建Map集合
        Map<Integer,String> map = new HashMap<>();
        //添加键值对
        map.put(1,"zhangSan");
        map.put(2,"ljy");
        map.put(3,"赖bb");
        map.put(4,"lisi");
        //获取集合中所有的key值，返回一个set集合
        Set<Integer> keys = map.keySet();
        //迭代器遍历
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            //取出key
            Integer key = it.next();
            //通过key值获取value
            String values = map.get(key);
            System.out.println(key + "=" + values);
        }
        System.out.println("==============");
        //foreach循环
        for (Integer key: keys) {
            System.out.println(key + "=" + map.get(key));
        }

        //Set<Map.Entry<K,V>> entrySet()   把Map集合直接全部转换成Set集合
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        //迭代器遍历
        Iterator<Map.Entry<Integer,String>> it2 = set.iterator();
        while (it2.hasNext()){
            Map.Entry<Integer,String> node = it2.next();
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key + "------>" + value);
        }
        //foreach
        for (Map.Entry<Integer,String> node : set) {
            System.out.println(node.getKey() + "" + node.getValue());
        }
    }
}
