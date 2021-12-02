package com.fyx.javase.string;
/*
关于Java JDK中内置的一个类：java.lang.String
    1、String表示字符串类型，属于引用数据类型。
    2、在java中随便使用双引号括起来的都是String对象。
    3、java规定，双引号括起来的字符串，是不可变的。
    4、在JDK当中双引号括起来的字符串，例如"abc" "def"都是直接存储在"方法区"的"字符串常量池"当中。
 */
public class StringTest01 {
    public static void main(String[] args) {
        String s = "abcd";
        String s2 = "efgh";
        String s3 = s + s2;
        String s4 = "abcd" + "jgh";
        System.out.println(s3);
        System.out.println(s4);

        //new对象的时候一定在堆内存当中开辟空间
        String s5 = new String("ljy");
    }
}
