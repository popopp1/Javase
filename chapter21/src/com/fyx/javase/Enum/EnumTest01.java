package com.fyx.javase.Enum;

public class EnumTest01 {
    public static void main(String[] args) {
        boolean result = divide(10,2);
        System.out.println(result ? "计算成功" : "计算失败");
    }
    public static boolean divide(int a,int b){
        try{
            int c= a / b;
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
