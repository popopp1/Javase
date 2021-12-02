/*
    抽象类：
       1.Birds类继承Animal类。所以 public abstract void move();也会继承到本类，
        不过因为Birds类是非抽象类，抽象方法只能出现在抽象类中，所以要把move()重写

       2.重要结论：
            一个非抽象的类继承抽象类，必须将抽象类中的抽象方法实现了(重写)
 */
public class AbstractTest02 {
    public static void main(String[] args) {
        Animal animal = new Birds(); //着就是面向抽象编程
        animal.move();

    }
}

abstract class Animal{
     public abstract void move();

}

class Birds extends Animal{

    public void move() {
        System.out.println("鸟儿在飞翔···");
    }
}

abstract class Cat extends Animal{

}