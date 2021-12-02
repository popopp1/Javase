public class PersonTest {
    public static void main(String[] args){
        Person p1 = new Person();

        int nianLing = p1.getAge();
        System.out.println(nianLing);//0
        System.out.println(p1.getAge());//0

        p1.setAge(20);
        System.out.println(p1.getAge());
        p1.setAge(-100);
        System.out.println(p1.getAge());//20
    }
}
