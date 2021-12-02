public class OverrideTest01 {
    public static void main(String[] args){
        Bird bd = new Bird();
        bd.move();
    }
}
class Animal{
    public void move(){
        System.out.println("动物正在移动！");
    }
}
class Bird extends Animal{

}
