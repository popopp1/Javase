package com.fyx.javase.array.homework;

import java.math.RoundingMode;

/*
酒店的房间
 */
public class Room {
    public static void main(String[] args) {
        Room room = new Room(101,"单人间",true);
        System.out.println(room.toString());

        Room room1 = new Room(101,"单人间",true);
        System.out.println(room.equals(room1));
    }
    //房间编号
    //1楼：101 102 103 104...
    //2楼：201 202 203 204...
    private int number;

    //房间类型:标准间 单人间 总统套房
    private String type;

    //房间状态
    //true表示房间空闲，可以被预订  false表示房间占用，房间不能被预订
    private boolean status;

    //无参构造
    public Room() {
    }

    //有参构造
    public Room(int number, String type, boolean status) {
        this.number = number;
        this.type = type;
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Room)) return false;
        if (this == obj) return true;
        Room room = (Room) obj;
        //当前房间编号等于传过来的房间的对象的房间编号。认同是同一个房间
        return this.getNumber() == room.getNumber();
    }

    public String toString(){
        return "["+number+","+type+","+(status? "空闲" : "占用")+"]";
    }


}
