public class Animal {
    public static void main(String[] args){
    }
    public void move(){
        System.out.println("动物在移动！！");
    }
}
class Cat extends Animal{
    public void move(){
        System.out.println("猫在走猫步");
    }
    public void catchMouse(){
        System.out.println("猫正在抓老鼠！");
    }
}
class Bird extends Animal{
    public void move(){
        System.out.println("鸟儿在飞翔");
    }
    public void sing(){
        System.out.println("鸟儿在唱歌");
    }
}

