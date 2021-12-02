package com.fyx.javase.array.homework;
/*
酒店对象，酒店中有二维数组，二维数组模拟大厦。
 */
public class Hotel {
    //二维数组，模拟大厦所有的房间
    private Room[][] rooms;

    //盖楼通过构造方法来盖楼
    public Hotel() {
        rooms = new Room[3][10];//五层楼，每层10个房间。

        //创建30个Room对象，放到数组中。用for循环
        for (int i = 0; i < rooms.length ; i++) {
            for (int j = 0;j < rooms[i].length;j++){

                //一层
                if (i == 0){
                    rooms[i][j] = new Room((i+1)*100+j+1,"单人间",true);
                }

                //二层
                else if(i == 1){
                    rooms[i][j] = new Room((i+1)*100+j+1,"标准间",true);
                }
                //三层
                else if(i == 2){
                    rooms[i][j] = new Room((i+1)*100+j+1,"总统套房",true);
                }
            }
        }
    }

    //在酒店对象上提供一个打印房间列表的方法
    public void print(){
        //打印所有房间的状态，for循环遍历二维数组
        for (int i = 0; i <rooms.length ; i++) {
            for (int j = 0;j < rooms[i].length;j++){
                Room room = rooms[i][j];
                System.out.print(room);
            }
            //换行
            System.out.println();
        }
    }

    //订房方法，调用这个方法时传递一个房间编号过来，由前台人员输入。
    public void order(int roomNum){
        //订房最主要的是将房间对象的status修改为false。
        //通过房间编号演算出下标，获取房间对象
        Room room = rooms[roomNum / 100 -1][roomNum % 100 -1];
        room.setStatus(false);
        System.out.println(roomNum + "房已订！");
    }

    //退房
    public void exit(int roomNum){
        Room room = rooms[roomNum / 100 -1][roomNum % 100 -1];
        //修改为空闲。
        room.setStatus(true);
        System.out.println(roomNum + "已退房！");
    }
}
