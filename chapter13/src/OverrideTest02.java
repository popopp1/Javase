import javax.lang.model.element.AnnotationMirror;

/*
    1.什么时候我们会考虑使用”方法覆盖“呢？
        子类继承父类之后，当继承过来的方法无法满足当前子类的业务需求，子类有权利对这个方法进行重新编写，有必要进行”方法覆盖“
        方法覆盖又叫做”override“
    2.重要结论：
        当子类对父类继承过来的方法进行“方法覆盖”之后，
        子类对象调用该方法的时候，一定执行覆盖之后的方法。
    3.当我们代码怎么编写的时候，在代码级别上构成了方法覆盖呢？
        条件一：两个类必须是继承关系
        条件二：重写之后的方法和之前的方法具有:
            相同的返回值类型
            相同的方法名
            相同的形式参数列表
        条件三：访问权限不能更低，可以更高
        条件四：重写之后的方法不能比之前的方法抛出更多的异常，可以更少

     注意事项：
        1.方法覆盖只是针对于方法，与属性无关
        2.私有方法无法覆盖！
        3.构造方法不能被继承，所以构造方法也不能被覆盖
        4.方法覆盖只是针对实例方法，静态方法覆盖没有意义
 */
public class OverrideTest02 {
    public static void main(String[] args){
        Birds birds = new Birds();
        birds.move();
        birds.sing(1);//没有发生方法覆盖，因为形式参数列表不一样

        Cat cat = new Cat();
        cat.move();


    }
}
class Animals {
    public void move(){
        System.out.println("动物在移动！");
    }
    public void sing(int i){
        System.out.println("Bird sing`````");
    }
}
class Birds extends Animals{
    public void move(){
        System.out.println("鸟儿在飞翔！！！");
    }
    public void sing(){
        System.out.println("鸟儿在唱歌");
    }
}
class Cat extends Animals{
    public void move(){
        System.out.println("猫猫在走猫步！！！");
    }
}