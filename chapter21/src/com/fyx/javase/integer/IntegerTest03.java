package com.fyx.javase.integer;
/*
关于Integer类的构造方法，有两个
    Integer(int)
    Integer(String)
 */
public class IntegerTest03 {
    public static void main(String[] args) {
        //(int ---->  integer)
        Integer x = new Integer(100);
        System.out.println(x);
        //将String类型的数字，转换成Integer包装类型  (String ---> Integer)
        Integer y = new Integer("123");
        System.out.println(y);
    }
}
