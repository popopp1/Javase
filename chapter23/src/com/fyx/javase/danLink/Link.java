package com.fyx.javase.danLink;
/*
链表类
 */
public class Link {
    Node header;
    int size = 0;

    public int size(){
        return size;
    }
    //向链表中添加元素的方法
    public void add(Object ele){
        //创建一个新的节点对象
        //让之前单链表的末尾节点next指向新节点对象。
        if (header == null){
            header = new Node(ele,null);
        }else{
            //说明头节点是不空，头节点已存在
            //找出当前末尾节点，让当前末尾节点的next是新节点。
            Node currentLastNode = findLast(header);
            currentLastNode = new Node(ele,null);
        }
        size++;
    }

    //专门查找末尾节点的方法。
    private Node findLast(Node node) {
        if (node.next == null){
            //如果一个节点的next是null   那么说明这个节点就是末尾节点。
            return node;
        }
        //程序到这里说明：node不是末尾节点
        return findLast(node.next);//递归算法
    }

    //删除链表中某个数据的方法
    public void remove(Object obj){

    }

    //修改链表中某个数据的方法
    public void modify(Object obj){

    }

    //获取某个元素
    public int find(Object obj){
        return 1;
    }
}
