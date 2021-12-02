package com.fyx.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
    关于集合遍历/迭代专题
        注意：
                以下讲解的遍历/迭代方式，是所有Collection通用的一种方式
                在Map集合中不能使用，在所有的Collection以及子类中使用
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(new Object());
        //对集合Collection进行遍历/迭代
        //获取集合对象的迭代器对象Iterator
        Iterator it = c.iterator();
        //通过以上获取的迭代器对象开始遍历/迭代集合。
        /*
            以下两个方法是迭代器对象Iterator中的方法：
                boolean hasNext()   如果仍有元素可以迭代，返回true
                Object next()       返回迭代的下一个元素
         */
//        boolean hasNext = it.hasNext();
//        System.out.println(hasNext);//true
//        if (hasNext){
//            Object o = it.next();
//            System.out.println(o);//abc
//        }
//
//        boolean hasNext2 = it.hasNext();
//        System.out.println(hasNext2);
//        if (hasNext2){
//            Object o2 = it.next();
//            System.out.println(o2);//def
//        }
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }
    }
}
