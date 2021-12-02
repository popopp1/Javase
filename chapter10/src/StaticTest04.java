public class StaticTest04 {
    public static void main(String[] args){
        StaticTest04.dosome();
        StaticTest04 staticTest04 = new StaticTest04();
        staticTest04.doOther();

        staticTest04 = null;
        staticTest04.dosome();//不会出现空指针异常
        staticTest04.doOther();//空指针异常
    }
    public static void dosome(){
        System.out.println("do some!");
    }
    public void doOther(){
        System.out.println("do other!");
    }
}
