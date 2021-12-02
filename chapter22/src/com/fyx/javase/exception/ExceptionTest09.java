package com.fyx.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    关于try...catch中的finally子句：
        1、在finally子句中的代码是最后执行的，并且一定会执行的，即使try语句块中的代码出现了异常。
            finally子句必须和try一起出现，不能单独编写。

        2、finally语句通常使用在哪些情况下?
            通常在finally语句块中完成资源的释放/关闭
            因为finally中的代码比较有保障。
            即使try语句块中的语句出现了异常，finally中代码也会正常执行。
 */
public class ExceptionTest09 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null; //声明位置放到try外面，这样在finally中才能有。
        try {
            //创建输入流对象
            fis = new FileInputStream("D:\\pict\\test1.txt");
            String s = null;
            s.toString();

            //关闭输入流，因为流是占用资源的。
            //fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }catch (NullPointerException e){
            e.printStackTrace();
        }finally{
            //流的关闭放在这里比较保险
            //避免空指针异常
            if (fis != null){
                fis.close();
            }
        }
    }
}
