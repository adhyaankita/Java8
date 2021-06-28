package com.Sorting;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class BubbleSort {
    static void sorting(List<Integer> a, int n){
        int swapcounts = 0;
        for(int i=0; i<n; i++)
            for(int j=0; j<n-1; j++)
                if(a.get(j)>a.get(j+1)){
                    int temp = a.get(j);
                    a.set(j,a.get(j+1));
                    a.set(j+1,temp);
                    swapcounts++;
                }
        System.out.println("Array is sorted in "+swapcounts+" swaps.");
        System.out.println("First Element: "+a.get(0));
        System.out.println("Last Element: "+a.get(n-1));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        sorting(a,n);

        bufferedReader.close();
    }
}
