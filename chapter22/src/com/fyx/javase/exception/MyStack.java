package com.fyx.javase.exception;

/*
编写程序，使用一维数组，模拟栈数据结构。
    1、这个栈可以存储java中的任何引用数据类型
    2、在栈中提供push方法模拟压栈(栈满了，要有提示信息)
    3、在栈中提供pop方法模拟弹栈(栈空了，要有提示信息)
    4、编写测试程序，new栈对象，调用push pop方法来模拟压栈弹栈的动作。
    5、假设栈的默认初始化容量是10
 */
public class MyStack {
     //初始化一个Object一维数组，容量为10
     private Object[] elements = new Object[10];

     //栈帧，永远指向顶部元素
     private int index = -1;//表示栈帧指向了顶部元素

     //提供push压栈方法,ele是被压入元素
     public void push(Object ele) throws MyStackOperationException{
          if (index >= elements.length-1){
//               MyStackOperationException e = new MyStackOperationException("压栈失败，栈已满！");
//               //手动将异常抛出去！
//               //这里捕捉没有意义，自己new一个异常，自己捉没有意义。栈已满这个信息你需要传递出去。
//               throw e;
               //合并(手动抛异常)
               throw new MyStackOperationException("压栈失败，栈已满！");
          }
          //向栈中加1个元素，栈帧向上移动一个位置
          index++;
          elements[index] = ele;
          System.out.println("压栈"+ elements[index] +"成功，栈帧指向" + index);
     }

     //提供弹栈方法，ele是被弹出元素，从数组中往外取元素，返回值是Object
     public void pop() throws MyStackOperationException{
          if (index < 0){
//               System.out.println("栈已空，弹栈失败！！");
//               return;
               throw new MyStackOperationException("栈已空，弹栈失败！！");
          }
          System.out.println("弹栈"+ elements[index]+ "元素成功" );
          //栈帧向下移动一位
          index--;
          System.out.println("栈帧指向" + index);
     }

     public Object[] getElements() {
          return elements;
     }

     public void setElements(Object[] elements) {
          this.elements = elements;
     }

     public int getIndex() {
          return index;
     }

     public void setIndex(int index) {
          this.index = index;
     }
}
