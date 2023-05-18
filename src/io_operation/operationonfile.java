package io_operation;

import java.io.File;
import java.io.IOException;

public class operationonfile {
    public static void main(String[] args) throws IOException
    {
//        File f1=new File("pw skill");
//        System.out.println(f1.exists());
//        f1.createNewFile();
//        System.out.println(f1.exists());
//
//        File fd=new File("pw java");
//        System.out.println(fd.exists());
//        fd.mkdir();
//        System.out.println(fd.exists());

        File f=new File("E:\\Java\\Java April project\\src");
        String str[]=f.list();
        int ct=0;
        for(String name:str)
        {
            System.out.println("name of file  "+name);
            ct++;
        }
        System.out.println("count of file"+ct);

    }
}
