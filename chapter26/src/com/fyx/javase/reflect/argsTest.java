package com.fyx.javase.reflect;

/*
可变长度参数
    int...args  这就是可变长度参数
    语法:类型...   (一定是三个点)

    1、可变长度参数要求的参数个数是0~n个
    2、可变长度参数在参数列表中必须在最后一个位置上，而且可变长度参数只能有一个
 */
public class argsTest {
    public static void main(String[] args) {
        m();
        m(10);
        m(10,20);

        m2("abc","def","aaaa","ljy");
        String[] strs = {"i","love","ljy"};
        m2(strs);
    }
    public static void m(int... args){
        System.out.println("m方法执行了！");
    }

    public static void m2(String...args){
        //args有length属性，说明args是一个数组
        for (int i = 0; i <args.length ; i++) {
            System.out.println(args[i]);
        }
    }
}
