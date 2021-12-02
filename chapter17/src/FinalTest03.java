/*
    final修饰的实例变量，系统不管赋默认值，要求程序员必须手动赋值。

    final修饰的实例变量，系统不负责赋默认值，要求程序员手动赋值，
    这个手动赋值，在变量后面赋值也可以，在构造方法中赋值也可以。
 */
public class FinalTest03 {
    public static void main(String[] args) {

    }
}
class User{
    final int age;
    public User(int age) {
        this.age = age;
    }
}