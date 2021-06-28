package com.datastructures.hashSet;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> hashSetString = new HashSet<>();
        for(int i=0; i<t; i++){
            hashSetString.add(pair_left[i]+","+pair_right[i]);
            System.out.println(hashSetString.size());
        }
        System.out.println("\nHashSet of Input Strings");
        hashSetString.forEach(System.out::println);

        Set<String> linkedHashSetString = new LinkedHashSet<>();
        System.out.println("\nLinked HashSet of Input Strings");
        for(int i=0; i<t; i++)
            linkedHashSetString.add(pair_left[i]+","+pair_right[i]);
        linkedHashSetString.forEach(System.out::println);

        Set<String> treeHashSetString = new TreeSet<>();
        System.out.println("\nTree HashSet of Input Strings");
        for(int i=0; i<t; i++)
            treeHashSetString.add(pair_left[i]+","+pair_right[i]);
        treeHashSetString.forEach(System.out::println);
    }
}
