package com.fyx.javase.integer;
/*
总结一下之前所学的经典异常：
    空指针异常：NullPointerException
    类型转换异常：ClassCastException
    数组下标越界异常：ArrayIndexOutOfBoundsException
    数字格式化异常：NumberFormatException
Integer常用的方法
 */
public class IntegerTest07 {
    public static void main(String[] args) {
        //装箱
        Integer x = new Integer(1000);

        //编译没问题，运行时出现异常
//        Integer a = new Integer("中文");

        //拆箱
        int y = x.intValue();
        System.out.println(y);
//        System.out.println(a);//java.lang.NumberFormatException: For input string: "中文"

        //重点方法
        //static int parseInt(String s)
        //静态方法，传参String，返回int
        int retValue = Integer.parseInt("123");   //String ---> int
        System.out.println(retValue + 100);

        //-------------------------------------------以下方法了解就行----------------------------------------------

        //static String toBinaryString(int i)
        //将十进制转换成二进制的字符串
        String binaryString = Integer.toBinaryString(3);
        System.out.println(binaryString);

        //static String toHexString(int i)
        //将十进制转换成十六进制的字符串
        String tohexString = Integer.toHexString(16);
        System.out.println(tohexString);
    }
}
