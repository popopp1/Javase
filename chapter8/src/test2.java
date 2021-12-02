public class test2 {
    public static void main(String[] args){
        Person p = new Person();
        p.age = 10;
        add(p);
        System.out.println("main----->" + p.age);
    }
    public static void add(Person p){
        p.age++;
        System.out.println("add------>" + p);//11
    }
static class Person{
        int age;
    }
}
