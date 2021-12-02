package com.fyx.javase.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
java.util.Map接口中常用的方法：
    1、Map和collection没有继承关系
    2、Map集合以key和value的方式存储数据：键值对
       key和value都是引用数据类型
       key和value都是存储对象的内存地址
       key起到主导的地位，value是key的一个附属品
    3、Map接口中常用的方法：
        V put(K key,V value) 向Map集合中添加键值对
        V get(Object key)   通过key获取value
        void clear()  清空Map集合
        boolean containsKey(Object key)  判断Map中是否包含某个Key
        boolean containsValue(Object value)  判断Map中是否包含某个value
        boolean isEmpty()   判断Map集合中元素个数是否为0
        Set<K> keySet()  获取Map集合中所有的key
        V remove(Object key)  通过key删除键值对
        int size()  获取Map集合中键值对的个数
        Collection<V> values()  获取Map集合中所有的value，返回一个Collection
        Set<Map.Entry<K,V>> entrySet()
            将Map集合转换成Set集合
 */
public class MapTest01 {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<Integer,String> map = new HashMap<>();
        //向Map集合中添加键值对
        map.put(1,"ljy");
        map.put(2,"赖bb");
        map.put(3,"fyx");
        map.put(4,"ljyyy");
        //通过key来获取value
        String value = map.get(2);
        System.out.println(value);
        //获取键值对的数量
        System.out.println("键值对的数量：" + map.size());
        map.remove(3);
        System.out.println("键值对的数量：" + map.size());
        //判断是否包含某个key
        //contains方法底层调用的都是equals方法，所以自定义的类型要重写equals方法
        System.out.println(map.containsKey(4));//true
        //判断是否包含某个value
        System.out.println(map.containsValue("赖bb"));//true

        //获取所有的value
        Collection<String> values = map.values();
        for (String s : values){
            System.out.println(s);
        }

        //清空Map集合
        map.clear();
        System.out.println("键值对的数量：" + map.size());
        //判断是否为空
        System.out.println(map.isEmpty());//true
    }
}
