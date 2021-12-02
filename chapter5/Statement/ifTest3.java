import java.util.Scanner;
public class ifTest3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("请输入您的性别,1表示男,0表示女:");
        int sex = s.nextInt();
        System.out.println("请输入当前的天气,1表示雨天,0表示晴天:");
        int weather = s.nextInt();
        if(weather == 1){
            System.out.println("现在是雨天!");
            if(sex == 1){
                System.out.println("下雨了，小哥哥记得打一把大黑伞哦!");
            }else {
                System.out.println("下雨了，小姐姐记得打一把小花伞哦!");
            }
        }else if(weather == 0){
            if(sex == 1){
                System.out.println("外面是晴天，老铁们一起出去玩耍吧!");
            }else if(sex == 0){
                System.out.println("外面是晴天,小姐姐记得保护好皮肤,擦点防晒霜!");
            }
            else{
            System.out.println("现在是晴天!");
            }
        }
    }
}
