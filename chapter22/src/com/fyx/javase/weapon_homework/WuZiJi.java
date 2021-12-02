package com.fyx.javase.weapon_homework;
/*
    物资运输机，可移动，不可攻击
 */
public class WuZiJi extends Weapon implements Moveable{
    @Override
    public void move() {
        System.out.println("物资运输机移动~~~");
    }
}
