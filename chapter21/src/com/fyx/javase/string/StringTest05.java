package com.fyx.javase.string;

public class StringTest05 {
    public static void main(String[] args) {
        //String类常用的方法
        //1.char charAt(int index)
        char c = "赖BB".charAt(1);//1是数组的下标
        System.out.println(c);

        //2.int compareTo(String anotherString)
        System.out.println("abc".compareTo("abc"));//0 前后一致

        int result = "abc".compareTo("abd");
        System.out.println(result);//-1 前小后大  c < d

        int result2 = "abe".compareTo("abd");
        System.out.println(result2);//1 前大后小 e > d

        System.out.println("xyz".compareTo("yxz"));//-1

        //3.boolean contains(CharSequence s)
        //判断前面的字符串中是否包含后面的子字符串
        System.out.println("HelloWorld.java".contains("java"));//true
        System.out.println("http://www.baidu.com".contains("https://"));//false

        //4.boolean endsWith(String suffix)
        //判断当前字符串是否以某个字符串结尾。
        System.out.println("laibb".endsWith("bx"));//false
        System.out.println("laibb".endsWith("bb"));//true

        //5.boolean equals(Object anObject)
        //比较两个字符串
        System.out.println("abcd".equals("abcd"));//true

        //6.boolean equalsIgnoreCase(String anotherString)
        //判断两个字符串是否相等，并且同时忽略大小写
        System.out.println("ABc".equalsIgnoreCase("abc"));//true

        //7.byte[] getBytes()
        //将字符串对象转换成字节数组
        byte[] bytes = "abcdef".getBytes();
        for (int i = 0; i <bytes.length ; i++) {
            System.out.println(bytes[i]);
        }

        //8.int indexOf(String str)
        //判断某个子字符串在当前字符串中出现处的索引
        System.out.println("ljylaibbxiaocangshu".indexOf("laibb"));//3

        //9.boolean isEmpty()
        //判断某个字符串是否为空
        String str = "";
        System.out.println(str.isEmpty());//true

        //10.int length()
        //判断数组长度和判断字符串长度不一样
        //判断数组长度是length属性，判断字符串长度是length()方法。
        System.out.println("abc".length());//3

        //11.int LastIndexOf(String str)
        //判断某个子字符串在当前字符串中最后一次出现的索引
        System.out.println("ljylaibbxiaocangshulaibb".lastIndexOf("laibb"));//19

        //12.String replace(char oldChar,char newChar)
        //将某个字符串的某个字符转换成新的字符
        String str2 = "ABCDE";
        String replaceStr = str2.replace('A','F');
        System.out.println(replaceStr);//DBCDE

        //13.String replace(CharSequence target,CharSequence replacement)
        //替换
        //String的父接口就是CharSequence
        String newString = "http://www.baidu.com".replace("http://","https://");
        System.out.println(newString);

        //14.String[] spilt(String regex)
        //拆分字符串
        String[] ymd = "2002-12-21".split("-");//"2002-12-21"以"-"分隔符进行拆分
        for (int i = 0; i < ymd.length ; i++) {
            System.out.println(ymd[i]);
        }

        //15.boolean startWith(String prefix)
        //判断某个字符串是否以某个子字符开始
        System.out.println("http://www.baidu.com".startsWith("http://"));//true

        //16.String substring(int beginIndex)
        //截取字符串,参数是起始下标
        System.out.println("http://www.baidu.com".substring(7));

        //17.String substring(int beginIndex,int endIndex)
        System.out.println("http://www.baidu.com".substring(7,20));//下标是20的元素是不包含在内的，只输出到19的元素

        //18.char[] toCharArray()
        //将字符串转换成char数组
        char[] chars = "我是中国人".toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            System.out.println(chars[i]);
        }

        //19.String toLowerCase()
        //转换为小写
        System.out.println("ABCDefgHIjk".toLowerCase());

        //20.String toUpperCase()
        //转换成大写
        System.out.println("abcdeXYZdas".toUpperCase());

        //21.String trim()
        //去除字符串前后空白
        System.out.println("     hello        world        ".trim());

        //22.String中只有一个方法是静态的，不需要new对象
        //这个方法叫做valueOf
        //作用：将“非字符串”转换成“字符串”
        String s1 = String.valueOf(new Customer());
//        System.out.println(s1);//没有重写toString()方法，输出的是对象的内存地址
        System.out.println(s1);//重写toString()方法后，输出的是字符串   我是一个VIP客户！！！
    }
}
class Customer{
    @Override
    public String toString() {
        return "我是一个VIP客户！！！";
    }
}
