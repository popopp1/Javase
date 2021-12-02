import javax.rmi.ssl.SslRMIClientSocketFactory;

//这是没有封装的Person
public class Person{
    //private表示私有的，被这个关键字修饰后，该数据只能在本类中访问，出了这个类的属性就无法访问
    private int age;

    /*
    对外提供简单的访问入口
    封装的第二步:对外提供公开的set方法和get方法作为操作入口，并且都不带static，都是实例方法
    [修饰符列表] 返回值类型 方法名(形式参数列表）{

    }
    */
    /*
        java开发规范中有要求，set方法和get方法要满足以下格式
        get方法的要求：
        public 返回值类型 get+属性名首字母大写(无参){
        }
        set方法的要求：
        public void set+属性名首字母大写(有1个参数){
            xxx=参数;
        }
     */
    public int getAge(){
        return age;
    }
    public void setAge(int nianling){
        if(nianling <0 || nianling > 100){
            System.out.println("对不起，年龄值不合法，请重新赋值");
            return;
        }
        age = nianling;
    }
}
