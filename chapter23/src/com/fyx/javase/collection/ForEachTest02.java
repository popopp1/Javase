package com.fyx.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
集合使用foreach
 */
public class ForEachTest02 {
    public static void main(String[] args) {
        //创建List集合
        List<String> strList = new ArrayList<>();
        strList.add("hello");
        strList.add("world!");
        strList.add("kitty!");
        Iterator<String> it = strList.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        //使用foreach,因为泛型使用的是String类型，所以是：String s
        for (String s : strList){
            System.out.println(s);
        }
    }
}
