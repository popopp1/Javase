/*
    1.super和this对比：
        this:
            this能出现在实例方法和构造方法中。
            this的语法是：“this."、"this()"
            this不能使用在静态方法中
            this.大部分情况下是可以省略的
            this.什么时候不能省略呢？在区分局部分类和实例变量的时候不能省略
            this()只能现在构造方法第一行，通过当前的构造方法去调用”本类“中
            其他的构造方法，目的是：代码复用

        super：
            super能出现在实例方法和构造方法中。
            super的语法是：“super."、"super()"
            super不能使用在静态方法中
            super.大部分情况下是可以省略的
            super.什么时候不能省略呢？
                父类中有，子类中又有，如果想在子类中访问父类型特征，super.不能省略！！！
            super()只能现在构造方法第一行，通过当前的构造方法去调用”本类“中
            其他的构造方法，目的是：创建子类对象的时候，先初始化夫类型特征
     2.super()
        表示通过子类的构造方法调用父类的构造方法。
        模拟现实世界中的这种场景：要想有儿子，需要先有父亲

     3.重要结论：
        当一个构造方法第一行：
            既没有this()又没有super()的话，默认会有一个super();
            表示通过当前子类的构造方法调用父类的无参数构造方法。
            所以必须保证父类的无参数构造方法是存在的。

     4.this()和super()不能共存，因为它们都只能出现在构造方法的第一行。

     5.无论是怎么样折腾，父类的构造方法都会百分百执行。
 */
public class SuperTest01 {
    public static void main(String[] args){
        new B();//A类的无参数构造方法执行!  B类的无参数构造方法执行!
    }
}
class A{
    public A(){
        System.out.println("A类的无参数构造方法执行！");
    }
    public A(int i){
        System.out.println("A类的有参数构造方法执行!");
    }
}
class B extends A{
    public B(){
        this("ljy");
//        super(123);//写不写都可以
        System.out.println("B类的无参数构造方法执行!");
    }
    public B(String name){
        System.out.println("B类的有参数构造方法执行!(String)");
    }
}