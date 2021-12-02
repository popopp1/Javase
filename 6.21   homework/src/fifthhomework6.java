/*
    小花每天存2.5元，但是每当这一天是第五天或者是五的倍数，小花都会用去6元，小花要存100元要多少天
 */
public class fifthhomework6 {
    public static void main(String[] args) {
        int day = 0;
        double money = 0;
        while (money < 100) {
            day++;
            money += 2.5;
            if (day % 5 == 0){
                money -= 6.0;
            }
        }
        System.out.println("小花需要"+day+"天才能存够100元");
    }
}
