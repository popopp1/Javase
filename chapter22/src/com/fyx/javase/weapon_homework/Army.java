package com.fyx.javase.weapon_homework;
/*
    军队
 */
public class Army{
    private Weapon[] weapons = null;

    //无参构造，传一个int类型的count，传进去武器Weapon[]数组里面，武器数量
    public Army(int count) {
        weapons = new Weapon[count];
    }

    //将武器放入数组
    public void addWeapon(Weapon weapon) throws AllWeaponException {
        for (int i = 0; i <weapons.length ; i++) {
            //把武器添加到空的数组中
            if (null == weapons[i]){
                weapons[i] = weapon;
                System.out.println(weapon + "武器添加成功");
                return;
            }
        }
        //程序如果执行到此处，说明武器没有添加成功
        throw new AllWeaponException("武器数量已达到上限");
    }

    //所有可攻击的武器
    public void attackAll(){
        for (int i = 0; i <weapons.length ; i++) {
            //调用子类特有的方法，向下转型
            if(weapons[i] instanceof Shootable){
                Shootable shootable = (Shootable)weapons[i];
                shootable.shoot();
            }
        }
    }

    //所有可移动的武器
    public void moveAll(){
        for (int i = 0; i <weapons.length ; i++) {
            //调用子类特有的方法，向下转型
            if (weapons[i] instanceof Moveable){
                Moveable moveable = (Moveable)weapons[i];
                moveable.move();
            }
        }
    }
}
