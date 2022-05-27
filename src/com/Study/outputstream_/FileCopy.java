package com.Study.outputstream_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author sunhern
 * @version 1.0
 */
public class FileCopy {
    public static void main(String[] args) {
        String srcPath = "D:\\电脑\\桌面\\IDEA_work\\chapter19\\demo2\\copy.jpg";
        String destPath = "D:\\电脑\\桌面\\IDEA_work\\chapter19\\demo2\\A\\copy1.jpg";

        //1. 创建文件的输入流, 将文件读入到程序    用FileInputStream
        //2. 创建文件的输出流， 将读取到的文件数据，写入到指定的文件.  用FileOutputStream、
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcPath);
            fileOutputStream = new FileOutputStream(destPath);
            //定义一个字节数组,提高读取效果
            byte[] buff = new byte[1024];
            int readLength = 0;
            //(readLength = fileInputStream.read(bytes))  把文件读取到buff缓冲数组中，
            while ((readLength = fileInputStream.read(buff))!=-1){
                //读取到后，就写入到文件通过fileOutputStream
                //即，是一边读，一边写
                fileOutputStream.write(buff,0,readLength);  //一定要使用这个方法
            }
            System.out.println("拷贝ok！");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                //关闭输入流和输出流，释放资源
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
