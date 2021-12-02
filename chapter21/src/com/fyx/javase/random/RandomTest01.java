package com.fyx.javase.random;

import java.util.Random;

/*
随机数
 */
public class RandomTest01 {
    public static void main(String[] args) {
        Random random = new Random();
        //随机产生一个int类型取值范围的数字
        int num = random.nextInt();
        System.out.println(num);


    }
}
