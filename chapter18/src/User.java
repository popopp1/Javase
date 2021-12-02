/*
    1.访问控制权限
        1.1、访问控制权限都有哪些？
            4个
            private    私有的
            protected  受保护的
            public     公开的
                       默认的
        1.2、private    私有的，只能在本类中访问。
             protected  受保护的
             public     公开的，在任何位置都可以访问

        1.3、定义方法时：下面四个都可以用来修饰方法，静态也可以
             private    私有的
             protected  受保护的
             public     公开的
                        默认的
 */
public class User {
    public static void main(String[] args) {

    }
    private int id;
    protected int age;
    public int weight;
    String name;
}

class Vip{
    private void dosome(){

    }
    public void dosomething(){

    }
    protected void doanything(){

    }
    void dododo(){

    }
}