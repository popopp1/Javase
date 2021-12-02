package com.fyx.javase.integer;
/*
自动拆箱和自动装箱
    自动装箱：基本数据类型自动转换成包装类
    自动拆箱：包装类自动转换成基本数据类型
 */
public class IntegerTest05 {
    public static void main(String[] args) {
        //自动装箱
        Integer x = 100;
        //自动拆箱
        int y = x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(y + 1);

        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a == b);//false
    }
}
