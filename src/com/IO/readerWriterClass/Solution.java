package com.IO.readerWriterClass;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> readFile(File source) throws IOException {
        List<String> data = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(source))){
            String s;
            while((s = reader.readLine()) != null){
                data.add(s);
            }
        }
        return data;
    }

    public static void writeFile(List<String> data, File destination) throws IOException{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(destination))){
            for (String s:data) {
                writer.write(s);
                writer.newLine();
            }
        }
    }

    public static void main(String[] args) throws IOException{
        File source = new File("Zoo.class");
        File destination = new File("ZooCopy.class");
        List<String> data = readFile(source);
        for (String record: data) {
            System.out.println(record);
        }
        writeFile(data,destination);
    }
}

