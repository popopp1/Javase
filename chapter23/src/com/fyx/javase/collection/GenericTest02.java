package com.fyx.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
自动类型推断机制(又称为钻石表达式)
 */
public class GenericTest02 {
    public static void main(String[] args) {
        //ArrayList<这里的类型会自动推断>()，前提是JDK8之后才允许
        //自动类型推断，钻石表达式
        List<Animal> myList = new ArrayList<>();

        myList.add(new Animal());
        myList.add(new Cat());
        myList.add(new Bird());

        //遍历
        Iterator<Animal> it = myList.iterator();
        while (it.hasNext()){
            Animal a = it.next();
            a.move();
        }


        List<String> strList = new ArrayList<>();
        strList.add("http://www.qq.com");
        strList.add("http://www.baidu.com");
        strList.add("http://www.126.com");

        Iterator<String> it2 = strList.iterator();
        while (it2.hasNext()){
            String s = it2.next();
            //截取7位，运行
            String newStr = s.substring(7);
            System.out.println(newStr);
        }
    }
}
