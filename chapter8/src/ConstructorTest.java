/*
    构造方法
        1.什么是构造方法？
            构造方法是一个比较特殊的方法，通过构造方法可以完成对象的创建，以及实例化变量的初始化
            换句话说：构造方法是用来创建对象，并且同时给对象的属性赋值

        2.重点：当一个类没有提供任何构造方法，系统会默认提供一个无参数的构造方法。(而这个构造方法被成为缺省构造器)
               当一个类中手动的提供了构造方法，那么系统将不再提供无参数构造方法。

        3.调用构造方法怎么调用？
            使用new运算符来调用构造方法

        4.构造方法的语法结构是？
            [修饰符列表] 构造方法名 (形式参数列表){
                构造方法体;
            }
            注意：构造方法名必须和类名一致
 */
public class ConstructorTest {
    public static void main(String[] args){
        new Student1();
        Student1 student = new Student1();//Student1类没有构造方法
        System.out.println(student);
    }
}
