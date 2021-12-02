package com.fyx.javase.array;

public class ArrayTest04 {
    public static void main(String[] args) {
        int[] a = {1,3,3,3};
        printArray(a);
        System.out.println("============================");
        int[] b = new int[3];
        printArray(b);
        System.out.println("============================");
        printArray(new int[4]);
        System.out.println("============================");
        printArray(new int[]{1,2,3,4,});
    }
    public static void printArray(int[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
