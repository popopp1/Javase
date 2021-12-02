package com.fyx.javase.array;
/*
关于二维数组中元素的：读和改
    a[二维数组中的一维数组的下标][一维数组的下标]
    a[0][0]:表示二维数组a中的第1个一维数组的第1个元素。
    a[3][110]:表示二维数组a中的第4个一维数组的第111个元素。
 */
public class ArrayTest10 {
    public static void main(String[] args) {
        //二维数组
        int[][] a = {{1,2,3,4},{4,5,6,7},{11,23,34},{33,55,88}};

        //取出第一个一维数组
        int[] a0 = a[0];
        int x = a0[0];
        //合并,取出第一个一维数组的第一个元素
        System.out.println(a[0][0]);

        //改
        //修改二维数组a中的第3个一维数组的第2个元素。
        a[2][1] = 100;
        System.out.println(a[2][1]);
    }
}
