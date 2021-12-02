package com.fyx.javase.array;
/*
    什么时候采用静态初始化方式，什么时候采用动态初始化方式？
        当你创建数组的时候，确定数组中存储哪些具体的元素时，采用静态初始化方式。
        当你创建数组的时候，不确定将来数组中存储哪些数据，采用动态初始化方式，预先分配内存空间。
 */
public class ArrayTest02 {
    public static void main(String[] args) {
        //采用动态初始化的方式定义一个一维数组
        int[] a = new int[4];
        for (int i = 0; i < a.length; i++) {
            System.out.println("数组中下标元素为"+ i +"的元素是:"+ a[i]);
        }
        System.out.println("======================");

        Object[] object = new Object[3];
        for (int i = 0; i <object.length ; i++) {
            System.out.println(object[i]);
        }
        System.out.println("======================");

        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println("======================");

        //存储Object，采用静态初始化
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object[] objects = {o1,o2,o3};
        for (int i = 0; i <objects.length ; i++) {
            System.out.println(objects[i]);
        }
    }
}
