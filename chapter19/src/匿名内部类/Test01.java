package 匿名内部类;
/*
    匿名内部类：
        1.什么是内部类？
            内部类：在类的内部又定义一个新的类，成为内部类。

        2.内部类的分类：
            静态内部类：类似于静态变量
            实例内部类：类似于实例变量
            局部内部类：类似于局部变量

        3.使用内部类编写代码，可读性很差，能不用尽量不用。

        4.匿名内部类是局部内部类的一种

        5.匿名内部类两个缺点：
            1.太复杂，太乱，可读性差
            2.类没有名字，以后想重复使用，不能用
 */
public class Test01 {

}
class Test{
    //由于前面又static关键字，所以它叫静态内部类
    static class Inner01{

    }
    //实例内部类
    class Inner02{

    }
    public void doSome(){
        //局部变量
        int i = 100;
        //局部内部类
        class Inner03{

        }
    }
    public void doOther(){
        //doSome()方法中的局部内部类Inner03，在doOther()不能用
    }
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        myMath.mySum(new Compute() {
            public int sum(int a, int b) {
                return a + b;
            }
        }, 200, 100);

        /* 匿名内部类创建的对象
        new Compute() {
                   public int sum(int a, int b) {
                      return a + b;
                   }
                }
        */
    }
}

//class ComputeImpl implements Compute{
//    @Override
//    public int sum(int a, int b) {
//        return a + b;
//    }
//}

interface Compute{
    int sum(int a,int b);
}
class MyMath{
    public void mySum(Compute compute,int x,int y){
        compute.sum(x,y);
        System.out.println(x + "+" + y + "=" + compute.sum(x,y));
    }
}
