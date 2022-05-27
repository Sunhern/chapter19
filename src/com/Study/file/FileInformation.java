package com.Study.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author sunhern
 * @version 1.0
 */
public class FileInformation {
    public static void main(String[] args) {

    }
    //获取文件的信息   若文件已经存在则File file = new File(文件路径)，直接把文件读取到内存
    //               若文件不存在  则file.createNewFile();  创建文件
    @Test
    public void info(){
        File file = new File("D:\\电脑\\桌面\\IDEA_work\\chapter19\\news1.txt");

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //file.delete();

        //调用相应的方法，得到对应信息
        System.out.println("文件名字" + file.getName());
        //getName、getAbsolutePath、getParent、length、exists、isFile、isDirectory

        System.out.println("文件的绝对路径"+ file.getAbsolutePath());

        System.out.println("文件的父级目录" + file.getParent());

        //Utf-8 空格也是字符 算是一个字节  汉字占3个字节
        System.out.println("文件大小（字节）" + file.length());

        System.out.println("文件是否存在" + file.exists());

        System.out.println("是不是同一个文件" + file.isFile());

        System.out.println("是不是同一个目录" + file.isDirectory());



    }

}
