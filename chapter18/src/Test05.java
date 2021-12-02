/*
    面向接口编程，可以降低程序耦合度，提高程序的扩展力。
    接口的使用离不开多态的。
 */
public class Test05 {
    public static void main(String[] args) {

        //创建厨师对象
        FoodMenu cook = new ChinaCook();
        FoodMenu cook2 = new AmericanCook();

        //创建顾客对象
        Customer customer = new Customer(cook);
        Customer customer1 = new Customer(cook2);

        //顾客点菜
        customer.order();
        customer1.order();
    }
}

interface FoodMenu{
    //西红柿炒蛋
    void shiZiChaoJiDan();

    //鱼香肉丝
    void yuXiangRouSi();

}
