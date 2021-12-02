package com.fyx.javase.Enum;

public class SwitchTest {
    public static void main(String[] args) {
        switch(Season.FALL){
            case SPRING:
                System.out.println("这是春天");
                break;
            case SUMMER:
                System.out.println("这是夏天");
                break;
            case FALL:
                System.out.println("这是秋天");
                break;
            case WINTER:
                System.out.println("这是冬天");
        }
    }
}
