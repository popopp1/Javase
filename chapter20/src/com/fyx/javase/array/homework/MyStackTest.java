package com.fyx.javase.array.homework;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        //调用方法压栈
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());
        myStack.push(new Object());//最后压入，最先弹出

        //压这两个失败
        myStack.push(new Object());
        myStack.push(new Object());

        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();

        //到这里弹栈失败
        myStack.pop();
    }
}
