/*
    带有static的方法
    没有static的方法
    分别怎么调用？
    带有static的方法通过“类名.”的方式访问
 */
public class MethodTest {
    public static void main(String[] args){
        MethodTest.dosome();

        //创建对象
        MethodTest mt = new MethodTest();
        //通过“引用.”的方式访问实例方法
        mt.doOther();

    }
    public static void dosome(){
        System.out.println("do some!");
    }
    //这个方法没有static，这样的方法叫做“实例方法”（对象方法，对象级别的方法）
    public void doOther(){
        System.out.println("do other!");
    }
}
