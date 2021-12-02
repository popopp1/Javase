/*
    接口和接口之间支持多继承，一个类也可以同时实现多个接口。

    一个类可以同时实现多个接口。

    这种机制弥补了类和类的单继承带来的缺陷。

    接口A和接口B虽然没有继承关系，但是写代码的时候，可以互转。
    编译器没意见。但是运行时可能会出现：ClassCastException，所以还是得先if(instanceof)判断。
 */
public class Test03 {
    public static void main(String[] args) {
        //向上转型
        E e = new H();
        F f = new H();
        G g = new H();

        //向下转型
        if(e instanceof H){
            ((H)e).m2();
        }
    }
}

interface E{
    void m1();
}

interface F{
    void m2();
}

interface G{
    void m3();
}

class H implements E,F,G{
    @Override
    public void m1() {

    }
    @Override
    public void m2() {
        System.out.println("m2....");
    }
    @Override
    public void m3() {

    }
}