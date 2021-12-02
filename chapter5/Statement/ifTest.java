import javax.script.ScriptContext;
import java.util.Scanner;
public class ifTest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入年龄:");
        int age = s.nextInt();
        String age2 = "老年";
        if(age >=0 && age <=5){
            age2 = "幼婴儿";
        }else if( age <=10){
            age2 = "少儿";
        }else if( age <=18){
            age2 = "少年";
        }else if( age <=35){
            age2 = "青年";
        }else if( age <=55){
            age2 = "中年";
        }else if( age <=150){
        }
        System.out.println(age2);
    }
}
