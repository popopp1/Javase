package com.fyx.javase.string;
/*
    关于String类中的构造法
    第一个：String s = new String("");
    第二个：String s = "";最常用
    第三个：String s = new String(char数组);
    第四个：String s = new String(char数组,起始下标,长度);
    第五个：String s = new String(byte数组);
    第六个：String s = new String(byte数组,起始下标,长度);
 */
public class StringTest04 {
    public static void main(String[] args) {
        byte[] bytes = {97,98,99};//97是a，98是b，99是c
        String s =  new String(bytes);
        System.out.println(s);//abc
        /*
            通过输出结果我们得出一个结论:String类已经重写了toString()方法，输出字符串对象的话，
            输出的不是对象的内存地址,而是字符串本身
        */

        //String(字节数组，数组元素下标的起始位置，长度)，将byte数组中的一部分转换成字符串。
        String s2 = new String(bytes,1,2);
        System.out.println(s2);//b,c

        //将char数组全部转换成字符串
        char[] chars = {'我','爱','赖','b','b','！'};
        String s3 = new String(chars);
        System.out.println(s3);
        //将char数组的一部分转换成字符串
        String s4 = new String(chars,2,3);
        System.out.println(s4);
    }
}
