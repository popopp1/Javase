/*
    接口的基础的语法：
        1.类和类之间叫做继承，类和接口之间叫做实现。
        实现使用implements关键字完成。

        2.当一个非抽象的类实现接口的话，必须将接口中的所有的抽象方法全部实现(覆盖、重写)。

        3.接口中的方法都是public的。
 */
public class Test02 {
    public static void main(String[] args) {
        Mymath mymath = new MyMathImpl();
        System.out.println(mymath.sub(10,20));
        System.out.println(mymath.sum(10,20));
    }
}
interface Mymath{
    double PI= 3.412421;
    int sum(int a,int b);
    int sub(int i,int j);
}
class MyMathImpl implements Mymath{
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
    @Override
    public int sub(int i, int j) {
        return i - j;
    }
}
