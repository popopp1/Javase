import java.util.Objects;

public class Test04 {
    public static void main(String[] args) {
        Student s1 = new Student(1111,"pyp");
        Student s2 = new Student(1111,"pyp");
        System.out.println(s1.equals(s2));
    }
}

class Student{
    int number;
    String school;

    public Student(int number, String school) {
        this.number = number;
        this.school = school;
    }

    @Override
    public String toString() {
        return "学号" + number +",所在学校名称" + school;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || ! (o instanceof Student)){
            return false;
        }
        Student student = (Student) o;
        if (this.number == student.number && this.school.equals(student.school)){
            return true;
        }
//        return this.number == student.number && this.school.equals(student.school);
        return false;
    }
}

