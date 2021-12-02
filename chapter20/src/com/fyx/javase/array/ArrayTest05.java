package com.fyx.javase.array;
/*
1、main方法上面的”String[] args"有什么用？
    JVM调用main方法的时候，会自动传一个String数组过来。
    这个数组什么时候会有值呢？
        其实这个数组是留给用户，用户可以在控制台上输入参数，这个参数会自动被转换为“String[] args"
 */
public class ArrayTest05 {
    public static void main(String[] args) {
        //JVM默认传递过来的这个数组对象的长度为0
        System.out.println("JVM传递过来的String数组参数，它这个数组的长度是？"+ args.length);
        for (int i = 0; i <args.length ; i++) {
            System.out.println(args[i]);
        }
    }
}
