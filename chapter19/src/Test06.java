/*
    关于Object类中的finalize()方法。
        1.源代码：
            protected void finalize() throws Throwable{}

        2.finalize()方法只有一个方法体，里面没有代码，而且这个方法是protected修饰的。

        3.这个方法不需要程序员调用，JVM的垃圾回收器负责调用这个方法。

        4.finalize()方法的执行时机：
          当一个java对象即将被垃圾回收器回收的时候，垃圾回收器负责调用finalize()方法。

        5.finalize()
 */
public class Test06 {
    public static void main(String[] args) throws Throwable {
        Person person = new Person();
        person = null;
//        person.finalize();
        for (int i = 0;i < 10000000;i++){
            Person person1 = new Person();
            person1 = null;
        }
        //建议垃圾回收器启动
        System.gc();
    }
}

class Person{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("即将被销毁~~~~");
    }
}
