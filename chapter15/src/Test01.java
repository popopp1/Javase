/*
     1.多态在开发中有什么作用？
        1.1：降低程序的耦合度，提高程序的扩展力
        class Master{
            public void feed(Dog d){}
            public void feed(Cat c){}
            }
            以上的代码中表示：Master和Dog以及Cat的关系很紧密（耦合度高），导致扩展力差。
            class Master{
                public void feed(Pet pet){
                    pet.eat();
                }
            以上的代码表示：Master和Dog以及Cat的关系就脱离了，Master关注的是Pet类，
            这样Master和Dog以及Cat的耦合度就降低了，提高了软件的扩展力。

}
*/
class Master{
    public void feed(Pet pet){
        pet.eat();
    }
}

public class Test01 {
    public static void main(String[] args){
        Master ljy= new Master();
        Dog zangao= new Dog();
        ljy.feed(zangao);
        Cat xiaohua = new Cat();
        ljy.feed(xiaohua);
        YingWu yingwu = new YingWu();
        ljy.feed(yingwu);
    }
}

class Pet{
    public void eat(){

    }
}

class Dog extends Pet {
    public void eat() {
        System.out.println("狗狗喜欢啃骨头，吃的很香！！！");
    }
}

class Cat extends Pet{
    public void eat(){
        System.out.println("猫咪喜欢吃鱼，吃的很香！！！");
    }
}

class YingWu extends Pet{
    public void eat(){
        System.out.println("鹦鹉喜欢吃小虫子,吃的很香！！！");
    }
}
