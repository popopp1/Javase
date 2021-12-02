/*
    final
        1.final表示最终的，不可变的

        2.final可以修饰变量以及方法，还有类等。

        3.final修饰的变量？
          final修饰的局部变量只能赋一次值

        4.final修饰的方法？
          final修饰的方法无法被覆盖，重写

        5.final修饰的类？
          final修饰的类无法继承
 */
public class FinalTest01 {
    public static void main(String[] args) {
//        final int i = 100;
//        i = 200;
    }
}
//  要是A类加了final关键字，任何类，包括B类无法进行继承，扩展
class A{

}

class B extends A{

}

class C{
    public void dosome(){
        System.out.println("C's dosome...");
    }
//    public final void dosome(){
//        System.out.println("C's dosome...");
//    }
}

class D extends C{
    public void dosome(){
        System.out.println("D's dosome...");
    }
}

