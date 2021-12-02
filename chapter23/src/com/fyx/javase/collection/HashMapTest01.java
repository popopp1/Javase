package com.fyx.javase.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
HashMap集合：
    1、HashMap集合底层是哈希表/散列表的数据结构
    2、哈希表是一个数组和单向链表的结合体
    3、HashMap集合的默认初始化容量是16，默认加载因子是0.75
        默认加载因子是当HashMap集合底层数组的容量达到75%时，数组开始扩容
        重点：HashMap集合初始化容量必须时2的倍数，这是因为达到散列均匀，为了提高HashMap集合的效率，所必须的
    4、
 */
public class HashMapTest01 {
    public static void main(String[] args) {
        //测试HashMap集合key部分的元素特点
        //Integer是key，它的hashCode和equals都重写了
        Map<Integer,String> map = new HashMap<>();
        map.put(111,"zhangsan");
        map.put(222,"lisi");
        map.put(444,"wangwu");
        map.put(777,"zhaoliu");
        map.put(777,"king");//key重复的时候value会自动覆盖

        System.out.println(map.size());//4
        //遍历Map集合
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer,String> entry: set) {
            //验证结果：HashMap集合key部分元素：无序不可重复
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
