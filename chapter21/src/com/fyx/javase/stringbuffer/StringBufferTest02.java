package com.fyx.javase.stringbuffer;
/*
    如果以后要进行大量的字符串的拼接操作，建议使用JDK自带的
    java.lang.StringBuffer
    java.lang.StringBuilder

    在创建StringBuffer的时候尽可能给一定一个初始化容量
    预估计以下，给一个大一点的初始化容量
    关键点:给一个适合的初始化容量
 */
public class StringBufferTest02 {
    public static void main(String[] args) {
        //创建一个初始化容量为16个byte[]  数组。（字符串缓冲区对象）
        StringBuffer stringBuffer = new StringBuffer();

        //拼接字符串，以后拼接字符串统一调用append()方法
        //append方法底层在进行追加的时候，如果byte[]数组满了，会自动扩容。
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("c");
        stringBuffer.append(3.14);
        System.out.println(stringBuffer.toString());//abc3.14

        //创建一个指定初始化容量的StringBuffer对象(字符串缓冲区对象)
        StringBuffer sb = new StringBuffer(100);
        sb.append("hello ");
        sb.append("ljy,");
        sb.append("hello");
        sb.append("kitty");
        System.out.println(sb.toString());
    }
}
