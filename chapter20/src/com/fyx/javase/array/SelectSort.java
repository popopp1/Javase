package com.fyx.javase.array;
/*
    选择排序算法

 */
public class SelectSort {
    public static void main(String[] args) {
        int[] array = {3,1,6,2,5};
        int count = 0;
        for (int i = 0; i < array.length-1 ;i++){//五条数据，外层循环4次
            //假设起点i下标位置上的元素是最小的
            int min = i;
            //i正好是”参加比较的这堆数据中“最左边的那个元素的下标。
            for (int j = i+1;j < array.length;j++){
                count++;
                if (array[j] < array[min]){
                    min = j; //最小值的元素是j
                }
            }
            //当i和min相同时，证明假设是正确的
            //当i和min不相同时，证明假设是错误的，有比这个元素更小的元素
            //需要拿着这个更小的元素和最左边的元素交换位置。
            if (min != i){
                 int temp = array[min];
                 array[min] = array[i];
                 array[i] = temp;
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
        System.out.println("比较次数:" + count);
    }
}
