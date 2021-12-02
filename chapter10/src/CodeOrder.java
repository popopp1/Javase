public class CodeOrder {
    static {
        System.out.println("A");//1
    }
    public static void main(String[] args){
        System.out.println("main begin");//3
        new CodeOrder();
        System.out.println("main over");//6
    }
    public CodeOrder(){
        System.out.println("B");//5
    }
    {
        System.out.println("C");//4
    }
    static {
        System.out.println("D");//2
    }

}
