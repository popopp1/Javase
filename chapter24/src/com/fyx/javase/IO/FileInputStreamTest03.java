package com.fyx.javase.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("tempfile");

            byte[] bytes = new byte[4];
            //这个方法的返回值是：读取到的字节的数量，不是字节的本身
            int readCount = fis.read(bytes);
            System.out.println(readCount);//第一次读到了4个字节
            //不应该是全部转换，应该是读取了多少个字节，转换多少个。
            System.out.println(new String(bytes,0,readCount));

            readCount = fis.read(bytes);//第二次只读取到2个字节
            System.out.println(readCount);//2
            System.out.println(new String(bytes,0,readCount));

            readCount = fis.read(bytes);//1个字节都没有读取到
            System.out.println(readCount);//-1

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
