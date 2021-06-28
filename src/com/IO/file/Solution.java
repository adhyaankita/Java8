package com.IO.file;

import java.io.File;

public class Solution {
    public static void main(String[] args) {
        File fileObject = new File("C:\\Users\\eankadh\\Desktop\\JAVA\\Books");
        System.out.println(fileObject.exists());
        System.out.println(fileObject.getName());
        System.out.println(fileObject.isDirectory());
        System.out.println(fileObject.lastModified());

        File[] arr = fileObject.listFiles();
        for (File f:arr) {
            System.out.println(f.getName());
        }
    }
}
