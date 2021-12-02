/*
    测试：子类继承父类之后，能使用子类对象调用父类方法吗？
        可以！
        本质上，子类继承父类之后，是将父类继承过来的方法归为自己所有
        实际上调用的也不是父类的方法，是他子类自己的方法（因为已经继承过来了）
 */
public class ExtendsTest03 {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.move();
        System.out.println(cat.name);
    }
static class Animal{
        String name = "小狗";
        public void move(){
            System.out.println(name + "正在移动!");
        }
}
//Cat继承Animal,会将Animal中所有的全部继承过来
static class Cat extends Animal{
}
}
