/*
    多态的基础语法：
        1.学习多态基础语法之前，我们需要普及两个概念：
            第一个：向上转型
                子--->父(自动类型转换)
            第二个：向下转型
                父--->子(强制类型转换,需要加强制类型转换符)

            注意：
                java中允许向上转型，也允许向下转型
                ·····无论是向上转型还是向下转型，两种类型之间必须有继承关系·····
        2.多态指的是：
            夫类型引用指向子类型对象
            包括编译阶段和运行阶段
            编译阶段：绑定父类中的方法
            运行阶段：动态绑定子类中对象的方法
        3.什么时候用“向下转型”？
            当你需要访问的是子类对象中特有的方法，此时必须使用“向下转型”。
        4.instanceof的使用：
            第一：语法：(引用 instanceof 类型)
            第二：instanceof可以在运行阶段动态判断引用指向的对象的类型
            第三：instanceof运算符的运算结果只能是：true/false
            第四：c是一个引用，c变量保存了内存地址指向了堆中的对象
                 假设(c instanceof Cat)为true表示：
                    c引用指向的堆内存中的java对象是一个Cat。
                 假设(c instanceof Cat)为false表示：
                    c引用指向的堆内存中的java对象不是一个Cat。
 */
public class Test01 {
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.move();

        Cat cat = new Cat();
        cat.move();

        Bird bird = new Bird();
        bird.move();
        /*
            经过测试得知java中支持这样的一个语法：
                父类型的引用允许指向子类型的对象。
                Animal animal2 = new Cat();
                animal2就是父类的引用
                new Cat()是一个子类型的对象
                允许animal2这个父类型引用指向子类型的对象
         */
        Animal animal2 = new Cat();
        Animal animal3 = new Bird();

        animal2.move();//猫在走猫步
        animal3.move();//鸟儿在飞翔
        /*
            什么是多态？
                多种形态，多种状态
            分析animal2.move();
                java程序分为编译阶段和运行阶段。
                编译阶段：
                    对于编译器来说，编译器只知道animal2的类型是Animal，
                    所以编译器在检查语法的时候，会去Animal.class
                    字节码文件中找到move()方法，找到了，绑定上move()
                    方法，编译通过，静态绑定成功。(编译阶段属于静态绑定)
                运行阶段：
                    运行阶段的时候，实际上在堆内存中创建的java对象是Cat对象，
                    所以move的时候，真正参与move的对象是一只猫，所以运行
                    阶段会动态执行Cat对象的move()方法，这个过程属于运行阶段
                    绑定。(运行阶段属于动态绑定)

         */
        Animal animal4 = new Cat();
//        animal4.catchMouse();//编译不通过,因为Animal.class字节码没有catchMouse()方法,这个时候得使用“向下转型”了。
        /*
            因为animal4是Animal类型，转成Cat，Animal和Cat之间存在继承关系，所以没报错
         */
        Cat x = (Cat)animal4;
        x.catchMouse();

        Animal animal5 = new Bird();
//        Cat y = (Cat)animal5;
//        y.catchMouse();//Exception in thread "main" java.lang.ClassCastException: Bird cannot be cast to Cat 鸟不能转换成猫

        if(animal5 instanceof Cat){
            Cat y = (Cat)animal5;
            y.catchMouse();
        }
        System.out.println(animal5 instanceof Cat);//false
    }
}
