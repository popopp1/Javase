package com.fyx.javase.weapon_homework;
/*
测试程序
 */
public class Test {
    public static void main(String[] args) {
        //构建一个军队
        Army army = new Army(4);//军队有三个武器

        //创建武器对象
        Tank tank = new Tank();
        Tank tank1 = new Tank();
        Tank tank2 = new Tank();
        WuZiJi wuZiJi = new WuZiJi();
        PaiJiPao paiJiPao = new PaiJiPao();


        //添加武器
        try {
            army.addWeapon(tank);
            army.addWeapon(tank1);
            army.addWeapon(tank2);
            army.addWeapon(wuZiJi);
            army.addWeapon(paiJiPao);
        } catch (AllWeaponException e) {
            System.out.println(e.getMessage());
        }
        //让所有能移动的武器移动
        army.moveAll();

        //让所有能攻击的武器攻击
        army.attackAll();
    }
}
