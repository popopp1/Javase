package com.fyx.javase.array;
/*
数组的元素查找
    数组元素查找有两种方法：
        第一种方式：一个一个查找，直到找到为止
        第二种方式：二分法查找（算法），这个效率较高。
 */
public class ArraySearch {
    public static void main(String[] args) {
        //第一种方式
        int[] array = {4,5,6,87,8};
        //需求：找出87的下标，如果没有返回-1
//        for (int i = 0; i <array.length ; i++) {
//            if (array[i] == 87){
//                System.out.println("87元素的下标是：" + i);
//                return;
//            }
//        }
//        System.out.println("元素87不存在");

        int number = arraySearch(array,87);
        System.out.println(number == -1 ? "该元素不存在" : "该元素下标是：" + number);
    }

    public static int arraySearch(int[] array, int number){
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]){
                return i;
            }
        }
        return -1;
    }
}
