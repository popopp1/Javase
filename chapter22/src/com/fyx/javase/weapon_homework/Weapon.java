package com.fyx.javase.weapon_homework;
/*
所有武器的父类
 */
public class Weapon {
     private String name;
     private String number;

    public Weapon(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Weapon() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
