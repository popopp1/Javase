package com.fyx.javase.reflect;

/*
    只希望一个类的静态代码块执行，其他代码一律不执行
    可以使用：
         Class.forName("完整类名")
    这个方法的执行会导致类加载，类加载时，静态代码块执行
 */
public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            Class.forName("com.fyx.javase.reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class MyClass{
    static {
        System.out.println("MyClass类的静态代码块执行了");
    }
}