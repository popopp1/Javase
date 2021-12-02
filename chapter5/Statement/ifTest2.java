import java.util.Scanner;
public class ifTest2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入您的成绩:");
        double score = s.nextDouble();
        String str = "优秀";
        if(score < 0 || score > 100){
            str = "对不起，您输入的成绩有误！";
        }else if(score < 60){
            str = "不及格";
        }else if(score < 70) {
            str = "及格";
        }else if(score < 80){
            str = "中等";
        }else if(score < 90){
            str = "良好";
        }else if(score <= 100){
            str = "优秀";
        }
        System.out.println(str);
    }
}
