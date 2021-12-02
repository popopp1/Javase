package com.fyx.javase.integer;
/*
String int Integer之间互相转换
 */
public class IntegerTest08 {
    public static void main(String[] args) {
        //String --> int
        String s1 = "100";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1 + 1);//101

        //int --> String
        String s2 = i1 + "";
        System.out.println(s2 + 1);//1001
        System.out.println(String.valueOf(100));

        //int --> Integer
        //自动装箱
        Integer x = 1000;
        System.out.println(x);

        //Integer --> int
        //自动拆箱
        int y = x;
        System.out.println(y);

        //String --> Integer
        Integer i = Integer.valueOf("123");
        System.out.println(i);

        //Integer --> String
        String j = String.valueOf(i);
        System.out.println(j);
    }
}
