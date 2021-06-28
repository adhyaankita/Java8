package com.datastructures.arraylist;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<List<Integer>> arrayList = new ArrayList<>();

        int n = scan.nextInt();
        for(int i=0; i<n; i++)
        {
            int d = scan.nextInt();
            List<Integer> a = new ArrayList<>();
            for(int j=0; j<d; j++)
                a.add(scan.nextInt());
            arrayList.add(a);
        }

        int q = scan.nextInt();
        for(int i=0; i<q; i++){
            int x = scan.nextInt()-1;
            int y = scan.nextInt()-1;
            if(x >= arrayList.size())
                System.out.println("ERROR!");
            else if(y >= arrayList.get(x).size())
                    System.out.println("ERROR!");
                 else
                System.out.println(arrayList.get(x).get(y));
        }

    }
}

