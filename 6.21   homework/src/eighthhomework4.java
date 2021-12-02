/*
    (封装)已知一个类Student代码如下：
    class Student{
        String name;
        int age;
        String address;
        String zipCode;
        String mobile;
    }
   要求：
        1.把Student的属性都作为私有，并提供get/set方法以及适当的构造方法
        2.为Student类添加一个getPostAddress方法，要求返回Student对象的地址和邮箱
 */
public class eighthhomework4 {
    public static void main(String[] args){
        Student s1 = new Student("赖bb",18,"广东河源","1231231","5465444");
        System.out.println("姓名:"+ s1.getName() + "," + s1.getPostAddress());
    }
}
class Student{
    private String name;
    private int age;
    private String address;
    private String zipcode;
    private String mobile;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setZipcode(String zipcode){
        this.zipcode = zipcode;
    }
    public String getZipcode(){
        return zipcode;
    }
    public void setMobile(String mobile){
        this.mobile = mobile;
    }
    public String getMobile(){
        return mobile;
    }
    public Student(){

    }
    public Student(String name,int age,String address,String zipcode,String mobile){
        this.name = name;
        this.age = age;
        this.address = address;
        this.zipcode = zipcode;
        this.mobile = mobile;
    }
    public String getPostAddress(){
        return "地址：" + this.getAddress() + ",邮编：" + this.getZipcode();
    }
}
