package com.fyx.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
关于集合元素的remove
    重点：当集合的结构发生改变时，迭代器必须重新获取，如果还是用以前老的迭代器，会出现异常：
    java.util.ConcurrentModificationException
    出现异常根本原因：集合中元素删除了，但是没有更新迭代器（迭代器不知道集合变化了）

    重点：在迭代集合元素的过程中，不能调用集合对象的remove方法，删除元素：
        c.remove(o);迭代过程中不能这样

    重点:
        在迭代器元素的过程中，一定要使用迭代器iterator的remove方法，删除元素，不要使用集合自带的remove方法
 */
public class CollectionTest06 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();
        //添加对象
        c.add(1);//Integer类型
        c.add(2);
        c.add(3);

        //获取迭代器
        Iterator it = c.iterator();
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }

        Collection cc = new ArrayList();
        cc.add("abc");
        cc.add("def");
        cc.add("xyz");

        Iterator it2 = cc.iterator();
        while (it2.hasNext()){
            Object o2 = it2.next();
//          cc.remove(o2);    直接通过集合去删除元素，没有通知迭代器（导致迭代器的快照和原集合状态不同）
            //删除元素，删除元素之后，集合的结构发生了变化，应该重新去获取迭代器，但是
            //循环下一次的时候并没有重新获取迭代器，所以会出现异常
            //迭代器删除时，会自动更新迭代器，并且更新集合（删除集合中的元素）
            it2.remove();//删除的一定是迭代器指向的当前元素
            System.out.println(o2);
        }
        System.out.println(cc.size());
    }
}
