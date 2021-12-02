/*
    1.方法覆盖需要和多态机制联合起来使用才有意义。
        没有多态机制的话，方法覆盖可有可无。

        没有多态机制，方法覆盖也可以没有，如果父类的方法无法满足子类
        业务需要的时候，子类完全可以定义一个全新的方法

        方法覆盖和多态不能分开

    2.静态方法存在方法覆盖吗？
        多态自然就和对象有关系
        而静态方法执行不需要对象
        所以，一般情况下，我们说静态方法”不存在“方法覆盖
        不探讨静态方法的方法覆盖
        方法覆盖只是针对”实例方法“，”静态方法覆盖”没有意义

 */
public class OverrideTest05 {
    public static void main(String[] args){
        Animall animall = new Cats();
        animall.dosome();//Animall的dosome方法执行！   虽然是使用“引用.”来调用。但是实际运行的是Animall.dosome()
        Cats.dosome();
    }
}
class Animall{
    public static void dosome(){
        System.out.println("Animall的dosome方法执行！");
    }
}
class Cats extends Animall{
    public static void dosome(){
        System.out.println("Cats的dosome方法执行！");
    }
}
