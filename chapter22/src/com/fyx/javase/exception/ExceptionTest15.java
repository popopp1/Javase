package com.fyx.javase.exception;

public class ExceptionTest15 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        //压栈
        try {
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
        } catch (MyStackOperationException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        //弹栈
        try {
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
            myStack.pop();
        } catch (MyStackOperationException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
