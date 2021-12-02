/*
    hashCode()方法
        public native int hashCode();
        这个方法不是抽象方法，带有native关键字

        hashCode()方法返回的是哈希码：
            实际上就是一个java对象的内存地址，经过哈希算法，得出的一个值
            所以hashCode()方法的执行结果可以等同看做一个java对象的内存的地址。
 */
public class Test07 {
    public static void main(String[] args) {
        Object o = new Object();
        int hashCodeValue  = o.hashCode();
        System.out.println(hashCodeValue);

        MyClass myClass = new MyClass();
        int hashCodeValue2 = myClass.hashCode();
        System.out.println(hashCodeValue2);
    }
}

class MyClass{

}

