package com.fyx.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/*
集合ArrayList的构造方法
 */
public class ArrayListTest02 {
    public static void main(String[] args) {
        List myList = new ArrayList();

        //创建初始化容量为100的List集合
        List myList1 = new ArrayList(100);

        //创建一个HashSet集合
        Collection c = new HashSet();
        c.add(100);
        c.add(200);
        c.add(900);
        c.add(50);

        //通过这个构造方法可以将HashSet集合转换成List集合
        List myList2 = new ArrayList(c);
        for (int i = 0; i <myList2.size() ; i++) {
            System.out.println(myList2.get(i));
        }

    }
}
