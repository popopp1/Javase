package com.fyx.javase.collection;
/*
位运算符>>
 */
public class BinaryTest {
    public static void main(String[] args) {
        //   >> 1  二进制右移1位
        //   >> 2  二进制右移2位
        //   10的二进制是1010   右移1位就是101   101的十进制就是5
        System.out.println(10 >> 1);//5   右移一位就是除以2
        //10的二进制左移1位    10100
        System.out.println(10 << 1);//20
    }
}
