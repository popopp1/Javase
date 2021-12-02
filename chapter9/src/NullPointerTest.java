/*
    空指针异常导致的最本质原因是？
    空引用访问“实例相关的数据”，会出现空指针异常
    实例相关的包括:实例变量 + 实例方法
 */
public class NullPointerTest {
    public static void main(String[] args){
        User user = new User();
        System.out.println(user.id);

        user = null;
        //id的访问，需要对象的存在
        System.out.println(user.id);//空指针异常
        //一个实例方法的调用也必须有对象的存在
        user.dosome();//空指针异常
    }
    static class User{
        int id;

        public void dosome(){
            System.out.println("do some!");
        }
    }
}
