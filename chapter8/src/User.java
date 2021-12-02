/*
    实例变量没有手动赋值的时候，实际上系统会默认赋值，那么这个默认赋值操作是在什么时间进行的？
    实例变量是在构造方法执行的过程中完成初始化的，完成赋值的。
 */
public class User {
    int id;
    String name;
    int age;

    //有参数构造方法
    public User(int a){

    }

    //无参数构造方法
    public  User(){
        //手动赋值，不再采用系统默认值
        id = 111;
        age = 30;
        name = "ljy";
}
}
