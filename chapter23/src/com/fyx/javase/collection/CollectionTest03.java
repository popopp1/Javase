package com.fyx.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest03 {
    public static void main(String[] args) {
        //创建集合对象
        //ArrayList集合：有序可重复
        Collection c = new ArrayList();

        //添加元素
        c.add(123);
        c.add("ljy");
        c.add("bb");
        c.add(new Object());
        c.add(123);
        c.add("ljy");
        c.add("bb");

        //迭代集合
        Iterator it = c.iterator();
        while (it.hasNext()){
            //存进去是什么类型，取出来还是什么类型
            Object o = it.next();
            if (o instanceof Integer){
                System.out.println("Integer类型:"+ o);
            }
            //只不过在输出的时候会转换成字符串
            System.out.println(o);
        }
        System.out.println("========================");
        //HashSet集合：无序不可重复
        Collection c2 = new HashSet();
        c2.add("123bbb");
        c2.add("ljy");
        c2.add("ljy");
        c2.add("bb");
        c2.add("bb");
        Iterator it2 = c2.iterator();
        while(it2.hasNext()){
            Object o2 = it2.next();
            System.out.println(o2);//bb   123bbb  ljy
        }
    }
}
