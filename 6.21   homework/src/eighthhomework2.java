/*
    设计男人类，每个男人类都有身份证号、姓名、性别、女人。设计女人类，每个女人类都有身份证号、姓名、性别、男人。
 */
public class eighthhomework2 {
    String idCard;
    String name;
    static boolean sex = true;
    //男人的女人
    woman woman;
    public static class woman{
        String idCard;
        String name;
        static boolean sex = false;
        //男人
        eighthhomework man;
    }
}
