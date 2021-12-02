package com.fyx.javase.random;

import java.util.Arrays;
import java.util.Random;

/*
    随机生成5个不重复的随机数[0-5]。重复的话重新生成。
    最终生成的5个随机数放到数组中，要求数组中这5个随机数不重复。
 */
public class RandomTest02 {
    public static void main(String[] args) {
        //创建一个random对象
        Random random = new Random();
        //定义一个长度为5的一维数组
        int[] array = new int[5];
        //数组的默认值改为-1
        for (int i = 0; i <array.length ; i++) {
            array[i] = -1;
        }
        int index = 0;
        while(index < array.length){
            //随机生成[0-5]的数字
            int num = random.nextInt(6);
            //判断这个数组array有没有包含这个num
            if (!contains(array,num)){
                array[index++] =num;
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
    public static boolean contains(int[] array,int num){
        for (int i = 0;i< array.length;i++){
            if (array[i] == num){
                return true;
            }
        }
        return false;
    }
}
