package com.fyx.javase.integer;
/*
1、java中8中基本数据类型又对应准备8种包装类型。8种包装类属于引用数据类型，父类是Object。
2、为什么要提供8种包装类？
    因为8种基本数据类型不够用。
    所以SUN公司又提供对应的8种包装类型。
 */
public class IntegerTest01 {
    public static void main(String[] args) {
        //把100这个数字通过构造方法包装成对象。
        MyInt myInt = new MyInt(100);
        //doSome方法虽然不能直接传100，但是可以传一个100对应的包装类型。
        doSome(myInt);
    }
    public static void doSome(Object obj){
        System.out.println(obj);
    }
}

class MyInt{
    int value;

    public MyInt() {
    }

    public MyInt(int value) {
        this.value = value;
    }
    //重写toString()方法
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
