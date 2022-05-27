package com.Study.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author sunhern
 * @version 1.0
 */
public class Directory_ {
    public static void main(String[] args) {

    }

    @Test
    public void m1(){
        String filepath = "D:\\电脑\\桌面\\IDEA_work\\chapter19\\news1.txt";
        File file = new File(filepath);
        if(file.exists()){
            if(file.delete()){
                System.out.println(filepath + "删除成功");
            }

        }else {
            System.out.println("该文件不存在");
        }
    }
    //判断D:\电脑\桌面\IDEA_work\chapter19\demo2
    // 目录是否存在，存在就删除，否则提示不存在
    //这里我们需要体会到，在java编程中，目录也被当做文件
    @Test
    public void m2(){
        String filepath = "D:\\电脑\\桌面\\IDEA_work\\chapter19\\demo2\\A\\B";
        File file = new File(filepath);
        if(file.exists()){
            if(file.delete()){  //删除的必须是空目录，目录下有文件或子目录都无法删除成功
                System.out.println(filepath + "删除成功");
            }

        }else {
            System.out.println("该目录不存在");
        }
    }

    //3)判断D:\电脑\桌面\IDEA_work\chapter19\demo2\A\B\C
    // 目录是否存在，如果存在就提示已经存在，否则就创建
    @Test
    public void  m3(){
        String filepath = "D:\\电脑\\桌面\\IDEA_work\\chapter19\\demo2\\A\\B\\C";
        File file = new File(filepath);
        if (!(file.exists())){
            //file.mkdir();   //mkdir创建一级目录、mkdirs创建多级目录、delete删除空目录或文件
            file.mkdirs();   //mkdir创建一级目录、mkdirs创建多级目录、delete删除空目录或文件
            System.out.println(filepath + "创建成功");
        }else {
            System.out.println("目录已存在");
        }

    }
}
