package com.fyx.javase.array;
/*
动态初始化二维数组
 */
public class ArrayTest12 {
    public static void main(String[] args) {
        //三个一维数组，每个一维数组当中2个元素
        int[][] array = new int[3][2];
        int[][] a = {{1,2,3,4},{5,6,7,8},{9,0},{11}};
        printArray(a);
    }
    public static void printArray(int[][] array2){
        for (int i = 0; i <array2.length ; i++) {
            for (int j = 0;j<array2[i].length;j++){
                System.out.print(array2[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
