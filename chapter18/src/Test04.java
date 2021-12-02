/*
    继承和实现都存在
        extends关键字在前
        implements关键字在后
 */
public class Test04 {
    public static void main(String[] args) {
        Flyable flyable = new Cats();
        flyable.fly();

        Flyable flyable1 = new Pig();
        flyable1.fly();
    }
}

class Animals{

}

interface Flyable{
    void fly();
}

class Cats extends Animals implements Flyable{
    public void fly(){
        System.out.println("飞猫起飞~~~~芜湖~~~");
    }

}

class Snake extends Animals{

}

class Pig implements Flyable{
    public void fly(){
        System.out.println("我是一只飞猪~~~");
    }
}