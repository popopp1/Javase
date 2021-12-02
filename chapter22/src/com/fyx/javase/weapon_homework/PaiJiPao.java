package com.fyx.javase.weapon_homework;
/*
迫击炮 不能移动，能射击
 */
public class PaiJiPao extends Weapon implements Shootable{
    @Override
    public void shoot() {
        System.out.println("迫击炮射击！！！");
    }
}
