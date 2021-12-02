public class Customer {
    //顾客手里有一个菜单
    private FoodMenu foodMenu;
    public Customer(){

    }
    public Customer(FoodMenu foodMenu){
        this.foodMenu = foodMenu;
    }

    public FoodMenu getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }
//    提供一个点菜的方法
    public void order(){
        //先拿菜单才可以点菜
        foodMenu.shiZiChaoJiDan();
        foodMenu.yuXiangRouSi();
    }
}

class MySelf{
    Friend f;
    public MySelf(){

    }
    public MySelf(Friend f){
        this.f = f;
    }

    public static void main(String[] args) {
        //创建朋友对象
        Friend f = new Friend();//朋友对象有了
        //创建自己对象
        //目前还没有交朋友
        MySelf mySelf = new MySelf();//自己对象
        mySelf.f = f;//把朋友的地址给了你

        //也可以调用有参数构造方法创建对象的同时交朋友
//        MySelf m = new MySelf(f);
    }

}

class Friend{

}