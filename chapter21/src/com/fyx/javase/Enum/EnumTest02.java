package com.fyx.javase.Enum;
/*
采用枚举类型
总结：
    1、枚举是一种引用数据类型
    2、语法：
        enum 枚举类型名{
            枚举值1，枚举值2
        }
    3、结果只有两个结果的，建议才用boolean
       结果超过两种平且可以一枚一枚的列举出来的，建议使用枚举类型。
 */
public class EnumTest02 {
    public static void main(String[] args) {
        System.out.println(divide(10,2));
    }

    public static Result divide(int a,int b){
        try{
            int c = a / b;
            return Result.SUCCESS;
        }catch (Exception e){
            return Result.FAIL;
        }
    }
}

enum Result{
    SUCCESS,FAIL
}

