package com.fyx.javase.array;
/*
二维数组的遍历
 */
public class ArrayTest11 {
    public static void main(String[] args) {
        String[][] array = {{"java","oracle","c++","python","c#"},{"ljy","fyx","ljyy","ljyyy"},{"lucy","jack","rose"}};
        for (int i = 0; i < array.length; i++) {//外层循环(负责纵向)
            for (int j = 0;j < array[i].length;j++){//负责遍历一维数组
                System.out.print(array[i][j]+" ");
            }
            //换行
            System.out.println();
        }
    }
}
