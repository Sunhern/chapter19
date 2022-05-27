package com.Study.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author sunhern
 * @version 1.0
 */
public class FileCreate {
    public static void main(String[] args) {

    }
    //方式1 new File(String pathname)
    @Test
    public void create01(){
        String filePath = "D:\\电脑\\桌面\\IDEA_work\\chapter19\\news1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //file.delete();
    }

    //方式2 new File(File parent,String child) //根据父目录文件+子路径构建
    //"D:\\电脑\\桌面\\IDEA_work\\chapter19\\news2.txt"
    //如果你想在上面的地方新建文件，要分析出父目录D:\\电脑\\桌面\\IDEA_work\\chapter19
                                     //子路径  news2.txt
    @Test
    public void create02(){
        File parentFile = new File("D:\\电脑\\桌面\\IDEA_work\\chapter19");
        String fileName = "new2.txt";

        //这里的file 对象，在java 程序中，只是一个对象
        //只有执行了createNewFile 方法，才会真正的，在磁盘创建该文件
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
        file.delete();
    }

    //方式3 new File(String parent,String child) //根据父目录+子路径构建
    @Test
    public void creat03(){
        String parentPath = "D:\\电脑\\桌面\\IDEA_work\\chapter19";
        String fileName = "new03.txt";
        File file = new File(parentPath, fileName);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
        file.delete();
    }


    //下面四个都是抽象类
    //InputStream   字节输入流
    //OutputStream  字节输出流
    //Reader //字符输入流
    //Writer //字符输出流
}
