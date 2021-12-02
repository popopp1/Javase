/*
    接口：
        1.接口也是一种"引用数据类型"。
        2.接口是完全抽象的。(抽象类是半抽象的)
        3.接口怎么定义，语法是什么？
            [修饰符列表] interface 接口名{
            }
        4.接口支持多继承，一个接口可以继承多个接口。
        5.接口中只包含两部分类容：一部分是：常量。一部分是：抽象方法
        6.接口中所有的元素都是public修饰的。
        7.接口中的抽象方法定义时：public abstract修饰符可以省略。
        8.接口中的方法都是抽象法，所以接口中的方法不能有方法体。
        9.接口中的常量的public static final可以省略。
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println(MyMath.PI);
        System.out.println(MyMath.A);
//        MyMath.A = 3123;常量不可以修改
    }
}

interface A{

}

interface B extends A{

}

interface C extends A,B{

}

interface MyMath{
    //常量
    public static final double PI = 3.1415926;
    double A = 3.0;
    public abstract int sum(int a, int b);
    int sub(int i,int j);

}