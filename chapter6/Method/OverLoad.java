/*
    方法重载(overload):
        优点1:代码整齐美观
        优点2:功能相似的，可以让方法名相同，更易于以后的代码的编写。
        什么时候会发生方法重载？
            条件1：在同一个类中
            条件2：方法名相同
            条件3：参数列表不同
                    参数的个数不同
                    参数的类型不同
                    参数的顺序不同
        方法重载和方法的返回值类型无关，与方法名、参数列表有关
        方法重载和方法的修饰符列表无关
 */
public class OverLoad {
    public static void main(String[] args){
        System.out.println(sum(10,20));
        System.out.println(sum(10L,20L));
        System.out.println(sum(10.0,20.0));
    }
    public static int sum(int a , int b){
        return a+b;
    }
    public static long sum(long a , long b){
        return a+b;
    }
    public static double sum(double a , double b){
        return a+b;
    }
}
