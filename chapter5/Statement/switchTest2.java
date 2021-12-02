import java.util.Scanner;
public class switchTest2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入学生的成绩:");
        double score = s.nextDouble();
        if(score < 0 || score > 100){
            System.out.println("您输入的成绩有误!");
            return;
        }
        int grade = (int)(score/10);
        String str = "不及格";
        switch (grade){
            case 9: case 10:
                str = "优秀";
                break;
            case 8:
                str = "良好";
                break;
            case 7:
                str = "中等";
                break;
            case 6:
                str = "及格";
                break;
        }
        System.out.println("该学生的成绩等级为:" + str);
    }
}
