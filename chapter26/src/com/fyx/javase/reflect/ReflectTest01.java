package com.fyx.javase.reflect;

import java.util.Date;

/*
要操作一个类的字节码，首先需要先获取到这个类的字节码，怎么获取java.lang.Class实例？
    三种方式
        第一种：Class c = Class.forName("完整类名带包名");
        第二种：Class c = 引用.getClass();
        第三种: Class c = 任何数据类型.class
*/
public class ReflectTest01 {
    public static void main(String[] args) throws Exception{
        /*
         Class.forName()
            1、静态方法
            2、方法的参数一个字符串
            3、字符串需要的是一个完整的类名
            4、完整类名必须带有包名
         */
        Class c1 = Class.forName("java.lang.String");
        Class c2 = Class.forName("java.util.Date");
        Class c3 = Class.forName("java.lang.Integer");
        Class c4 = Class.forName("java.lang.System");

        //java中任何一个对象都有一个方法:getClass()
        String s = "abc";
        Class x = s.getClass();  //x代表String.class字节码文件，x代表String类型
        System.out.println(c1 == x); //true(表示c1和x内存地址一样)

        //第三种方式：java语言种任何一种类型，包括基本数据类型，它都有.class属性
        Class z = String.class;     //z代表String类型
        Class k = Date.class;       //k代表Date类型
        Class f = int.class;        //f代表int类型
        Class e = double.class;     //e代表double类型

        System.out.println(x == z);//true

    }
}
