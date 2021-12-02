import javax.jws.soap.SOAPBinding;

/*
    关于方法来说，什么时候定义实例方法？什么时候定义静态方法？
    此方法一般都是描述一个行为，如果说该行为必须由对象去触发，那么该方法定义为实例方法
 */
public class StaticTest05 {
    public static void main(String[] args){
        User user = new User();
        System.out.println(user.getId());
    }
    static class User{
        private int id;
        public void setId(int i){
            id = i;
        }
        public  int getId(){
            return id;
        }
    }
}
