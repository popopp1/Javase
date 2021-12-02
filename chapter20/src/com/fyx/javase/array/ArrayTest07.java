package com.fyx.javase.array;
/*
    一维数组的深入，数组中存储的类型为：引用数据类型
    对于数组来说，实际上只能存储java对象的“内存地址”。
 */
public class ArrayTest07 {
    public static void main(String[] args) {
        //创建一个Animal类型的数组
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] animals = {a1,a2};

        //遍历Animal数组
        for (int i = 0; i <animals.length ; i++) {
            animals[i].move();

            Animal a = animals[i];
            a.move();
        }
        //动态初始化一个长度为2的Animal类型数组。
        Animal[] ans = new Animal[2];
        //创建一个Animal对象，放到数组中
        ans[0] = new Animal();
        //Animal数组中可以存放Cat类型的数据，因为Cat是一个Animal，Cat是子类
        ans[1] = new Cat();

        //创建一个Animal数组，存放Cat和Bird
        Animal[] animal = {new Cat(), new Bird()};
        for (int i = 0; i <animal.length ; i++) {
            //这个取出来的可能是Cat.也有可能是Bird,不过肯定是一个Animal
            //如果调用这个方法是父类中存在的方法不需要向下转型，直接使用父类型引用调用即可。Animal[i]
//            Animal an = animal[i];
//            an.move();

            //调用子对象特有的方法的话，需要向下转型！！！
            if (animal[i] instanceof Cat){
                Cat cat = (Cat)animal[i];
                cat.catchMouse();
            }else if (animal[i] instanceof Bird){
                Bird bird = (Bird)animal[i];
                bird.sing();
            }
        }
    }
}
class  Animal{
    public void move(){
        System.out.println("Animal move...");
    }
}
class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("猫在走猫步...");
    }
    //特有方法
    public void catchMouse(){
        System.out.println("猫在抓老鼠....");
    }
}
class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("鸟在飞~~~~");
    }
    public void sing(){
        System.out.println("鸟在唱歌....");
    }
}