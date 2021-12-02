public class Test {
    static Student student = new Student();
    public static void main(String[] args){
        Test.student.exam();
        System.out.println("Hello World!");
    }
}
class Student{
    public void exam(){
        System.out.println("考试·····");
    }

}
