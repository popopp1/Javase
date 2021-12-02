package com.fyx.javase.danLink;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
         //创建一个集合对象
         Link link = new Link();

         //往集合中添加元素
         link.add(100);
         link.add(200);
         link.add(300);

         //获取元素个数
        System.out.println(link.size());
    }
}
