package com.fyx.javase.array;
//当一个方法的参数是一个数组的时候
public class ArrayTest03 {
    public static void main(String[] args) {
        int[] x = {1,2,3,4};
        printArray(x);

        String[] strings = {"12312","ljy","fyx"};
        printArray2(strings);
        printArray2(new String[3]);
    }
    public static void printArray(int[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
    public static void printArray2(String[] array2){
        for (int i = 0; i <array2.length ; i++) {
            System.out.println("String数组中的元素："+array2[i]);
        }
    }
}
