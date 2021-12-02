public class SuperTest02 {
    public static void main(String[] args){
        new E();
    }
}
class C{
    public C(){
        System.out.println("C类的无参数构造方法执行!");//1
    }
}

class D extends C{
    public D(){
        System.out.println("D类的无参数构造方法执行!");
    }
    public D(String name){
        System.out.println("D类的有参数构造方法执行(String)");//2
    }
}

class E extends D{
    public E(){
        this("ljy");
        System.out.println("E类的无参数构造方法执行");//5
    }
    public E(String name){
        this("ljy",10);
        System.out.println("E类的有参数构造方法执行(String)");//4
    }
    public E(String name,int i){
        super(name);
        System.out.println("E类的有参数构造方法执行(String,int)");//3
    }
}

