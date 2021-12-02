/*
    1.this是什么？在内存方面是怎么样的？
        一个对象一个this
        this是一个变量，是一个引用，this保存当前对象的内存地址，指向自身
        所以，this代表的就是"当前对象"
        this存储在堆内存当中对象的内部

    2.this只能使用在实例方法中，谁调用这个实例方法，this就是谁
      所以this代表的是：“当前对象”

    3.this大部分时间是可以省略的，什么时候不能省略？
        在实例方法中，或者构造方法中，为了区分局部变量和实例变量，这种情况下this不能省略

    4.this不能用在静态方法，为什么？
        this代表当前对象，静态方法中不存在对象
 */
public class ThisTest01 {
    public static void main(String[] args){
        Customer c1 = new Customer("张三");
        c1.shopping();
        Customer c2 = new Customer("李四");
        c2.shopping();

        Student s = new Student();
        s.setNumber(1111);
        s.setName("ljy");

        System.out.println("学号：" + s.getNumber());
        System.out.println("姓名：" + s.getName());

        Student s2 = new Student(2222,"ljy");
        System.out.println("学号：" + s2.getNumber());
        System.out.println("姓名：" + s2.getName());
    }
    static class Customer{
        String name;
        public Customer(){

        }
        public Customer(String s){
            name = s;
        }
        public void shopping(){
            //这里的this是当前对象
            //c1调用shopping(),this就是c1
            //c2调用shopping(),this就是c2
            //this.可以省略不写
            System.out.println(this.name + "正在购物!");
        }
    }
    static class Student{
        private int number;
        private String name;
        public Student(){

        }
        public Student(int number,String name){
            //this.number是实例变量，number是局部变量
            this.number = number;//this.的作用是区分局部变量和实例变量
            this.name = name;
        }
        public void setNumber(int number){
            this.number = number;
        }
        public int getNumber(){
            return number;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }
}
