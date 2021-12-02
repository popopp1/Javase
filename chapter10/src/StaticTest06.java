/*
    1.使用static关键字可以定义：静态代码块

    2.什么是静态代码块，语法是什么？
        static{
            java语句;
            java语句;
        }
    3.静态代码块在什么时候执行？
        类加载执行时，并且只执行一次
        静态代码块有这样的特征

    4.注意：静态代码块在类加载时执行，并且在main方法执行前执行

    5.静态代码块一般是按照自上而下的顺序执行

    6.静态代码块有什么作用？
        第一：静态代码块不是那么常用
        第二：静态代码块语法机制实际上是sun公司给我们java程序员的一个特殊的时刻/时机，这个时机叫做：类加载时机
 */
public class StaticTest06 {
    static {
        System.out.println("A");
    }
    static {
        System.out.println("B");
    }
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
    static {
        System.out.println("C");
    }
}
