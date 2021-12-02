package com.fyx.javase.array;
/*
    冒泡排序算法

 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,2,7,6,8};
        int count = 0;

        for (int i = arr.length-1 ; i > 0; i--) {//外层循环,循环次数
            for (int j = 0; j < i ; j++){//内层循环,比较次数
                count++;
                //交换位置
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("比较次数：" + count);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
