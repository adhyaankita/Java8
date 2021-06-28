package com.IO.fileEdit;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static boolean isAgePrime(int age){
        if(age == 1 || age ==2)
            return false;
        int i=1, count=0;
        while(i<=age){
            if(age % i == 0){
                count++;
            }
            i++;
        }
        if(count == 2)
            return true;
        else
            return false;
    }

    public static List<String> readData(File sourceFile) throws IOException {
        List<String> sourceData = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(sourceFile))){
            String s;
            reader.readLine();
            while((s = reader.readLine()) != null){
                if(!(s.replace(",","")).isEmpty()) {
                    sourceData.add(s.replace(",", " "));
                    System.out.println(s.replace(",", " "));
                    if(isAgePrime(Integer.parseInt(s.split(",")[2]))==true)
                       System.out.println("Age of "+s.split(",")[0]+" is prime number");
                    else
                        System.out.println("Age of "+s.split(",")[0]+" is not a prime number");
                }
            }
        }
        return sourceData;
    }

    public static void writeData(List<String> sourceData, File destinationFile) throws IOException{
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(destinationFile))){
            for (String s:sourceData) {
                writer.write(s);
                writer.newLine();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try{
            File sourceFile = new File("C:\\Users\\eankadh\\IdeaProjects\\JavaAdvancedProject\\src\\com\\IO\\fileEdit\\example.csv");
            List<String> sourceData = readData(sourceFile);
            File destinationFile = new File("C:\\Users\\eankadh\\IdeaProjects\\JavaAdvancedProject\\src\\com\\IO\\fileEdit\\sample.txt");
            writeData(sourceData,destinationFile);
        }catch(FileNotFoundException e){
            System.out.println("The file you are trying to read is not available");
        }

    }
}
