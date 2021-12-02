package com.fyx.javase.random;

import java.util.Random;

public class RandomTest03 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i <array.length ; i++) {
            array[i] = -1;
        }

        //循环，生成随机数
        int index = 0;
        while (index < array.length){
            //随机生成0-5的数字
            int number = random.nextInt(6);
            //判断这个数组是否包含number
            if(!(contains(array,number))){
                array[index++] = number;
            }
        }
        for (int i= 0;i < array.length;i++){
            System.out.println(array[i]);
        }
    }

    //定义一个方法，判断数组是否已经包含已经生成的number，以防重复
    public static boolean contains(int[] array,int key){
        for (int i = 0;i < array.length;i++){
            if (array[i] == key){
            return true;
            }
        }
        return false;
    }
}