package com.fyx.javase.array;

import java.util.Arrays;

/*
数组工具类
java.util.Arrays;
 */
public class ArraysTest02 {
    public static void main(String[] args) {
        int[] array = {14,23,11,56,4,1,5,8};
        Arrays.sort(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==========================");

        int index = Arrays.binarySearch(array,11);
        System.out.println(index);
    }
}
