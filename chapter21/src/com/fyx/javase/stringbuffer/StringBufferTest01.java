package com.fyx.javase.stringbuffer;

public class StringBufferTest01 {
    public static void main(String[] args) {
        String s = "";
        //这样做会给java的方法区字符串常量池带来很大的压力
        for (int i = 0; i <100 ; i++) {
            s += i;
            System.out.println(s);
        }
    }
}
