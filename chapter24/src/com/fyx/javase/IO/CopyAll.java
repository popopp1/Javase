package com.fyx.javase.IO;

import java.io.*;

/*
拷贝目录
 */
public class CopyAll {
    public static void main(String[] args) {
        //拷贝源
        File srcFile = new File("D:\\Java project");
        //拷贝目标
        File destFile = new File("C:\\");
        //调用拷贝方法
        copyDir(srcFile,destFile);
    }
    //拷贝目录方法
    private static void copyDir(File srcFile,File destFile){
        if (srcFile.isFile()){
            //srcFile是一个文件的话，递归结束
            //是文件的时候需要拷贝
            //....一边读一边写
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                //读这个文件
                fis = new FileInputStream(srcFile);
                //写到这个文件中
                String path = destFile.getAbsolutePath() + srcFile.getAbsolutePath().substring(3);
                fos = new FileOutputStream(path);
                //一边读一边写
                byte[] bytes = new byte[1024 * 1024];//一次复制1MB
                int readCount = 0;
                while ((readCount = fis.read(bytes))!= -1){
                    fos.write(bytes,0,readCount);
                }
                fos.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        //获取源下面的子目录
        File[] files = srcFile.listFiles();
        for (File file: files) {
            //获取所有文件的(包括文件和目录)的绝对路径
            //System.out.println(file.getAbsolutePath());
            if (file.isDirectory()){
                //新建对应目录
                //System.out.println(file.getAbsolutePath());
                String srcDir = file.getAbsolutePath();
               // System.out.println(srcDir.substring(3));//截掉"D:/"
                String destDir = destFile.getAbsolutePath() + srcDir.substring(3);
                File newFile = new File(destDir);
                if (!newFile.exists()){
                    newFile.mkdirs();
                }
            }
            //递归调用
            copyDir(file,destFile);
        }
    }
}
