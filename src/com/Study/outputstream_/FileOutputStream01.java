package com.Study.outputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author sunhern
 * @version 1.0
 */
public class FileOutputStream01 {
    public static void main(String[] args) {

    }

    /**
     * 演示使用FileOutputStream 将数据写到文件中,
     * 如果该文件不存在，则创建该文件
     */
    @Test
    public void writeFile() {
        String filePath = "D:\\电脑\\桌面\\IDEA_work\\chapter19\\demo2\\Outhello.txt";
        FileOutputStream fileOutputStream = null;

        try {
            //得到FileOutputStream对象
            //老师说明
            //1. new FileOutputStream(filePath) 创建方式，当写入内容是，会覆盖原来的内容
            //2. new FileOutputStream(filePath, true) 创建方式，当写入内容是，是追加到文件后面
            //fileOutputStream = new FileOutputStream(filePath);
            fileOutputStream = new FileOutputStream(filePath,true);

            //方法一   写入一个字节
            //fileOutputStream.write('a');  // char自动转换String

            //方法二   写入字符串
            String str = "hello,world";
            //str.getBytes() 可以把 字符串-> 字节数组       =
            //fileOutputStream.write(str.getBytes());
             /*
            write(byte[] b, int off, int len) 将 len字节从位于偏移量 off的指定字节数组写入此文件输出流
             */
            //方法三   写入指定位置的部分字符串
            fileOutputStream.write(str.getBytes(), 0, str.length());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void readFile() {
        FileInputStream fileInputStream = null;
        int readLength = 0;
        byte[] chars = new byte[8];
        String filepath = "D:\\电脑\\桌面\\IDEA_work\\chapter19\\demo2\\Outhello.txt";

        try {
            fileInputStream = new FileInputStream(filepath);
            while ((readLength = fileInputStream.read(chars)) != -1) {
                System.out.print(new String(chars, 0, readLength));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
