package com.fyx.javase.array;

import java.util.Arrays;

/*

 */
public class ArraysTest01 {
    public static void main(String[] args) {
        int[] array = {111,23,12,30,4,6};
        Arrays.sort(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
