package com.fyx.javase.string;

public class StringTest02 {
    public static void main(String[] args) {
        String ss = "xy";
        String sss = "xy";
        System.out.println(ss==sss);//true

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1==s2);//false
        //通过这两个案例的学习，字符串对象之间的比较不能使用“==”
        //“==”不保险，应该调用String类的equals方法,String类已经重写了equals
        System.out.println(s1.equals(s2));//true
        //"abc"之后能加.因为abc是一个String字符串对象，只要是对象都能调用方法。
        System.out.println("abc".equals(s1));//true
    }
}
