/*
    方法递归？
        1、什么是方法递归
            方法自己调用自己，这就是方法递归。
        2、当递归时程序没有结束条件，一定会发生：
           栈内存溢出错误：Stack Over Flow Error
           所以，递归必须要有结束条件。

 */
//使用递归，计算1~n的和
public class Recursion {
    public static void main(String[] args){
        System.out.println(sum(10000));
    }
    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        return n + sum(n - 1);
    }
}
