/*
    final修饰的变量，如果这个变量是一个“引用”怎么办？
        final修饰的变量只能赋一次值。

    final修饰的引用
        该引用只能指向一个对象，并且它只能永远指向该对象，无法再指向其他对象。
        虽然final的引用指向对象A后，不能再重新指向对象B，但是对象A内部数据可以被修改。
 */
public class FinalTest02 {
    public static void main(String[] args) {
        Person person = new Person(20);
        System.out.println(person.age);

//        final Person person1 = new Person(30);
        Person person1 = new Person(30);
        person1 = new Person(30);

        final Person person2 = new Person(30);
        person2.age = 40;
        System.out.println(person2.age);
    }
}
class Person{
    int age;
    public Person(int age) {
        this.age = age;
    }
}