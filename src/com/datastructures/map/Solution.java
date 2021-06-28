package com.datastructures.map;

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        Map<String,Integer> phonebook = new HashMap<>();
        Map<String,Integer> phonebookLinkedHashMap = new LinkedHashMap<>();
        Map<String,Integer> phonebookTreeMap = new TreeMap<>();
        int n=in.nextInt();
        int phone;
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            phone=in.nextInt();
            phonebook.put(name,phone);
            phonebookLinkedHashMap.put(name,phone);
            phonebookTreeMap.put(name,phone);
            in.nextLine();
        }
        System.out.println("HashMap Entries:");
        for (String s:phonebook.keySet()) {
            System.out.print(s+"="+phonebook.get(s)+" ");
        }
        System.out.println();
        System.out.println("LinkedHashMap Entries:");
        for (String s:phonebookLinkedHashMap.keySet()) {
            System.out.print(s+"="+phonebookLinkedHashMap.get(s)+" ");
        }
        System.out.println();
        System.out.println("TreeMap Entries:");
        for (String s:phonebookTreeMap.keySet()) {
            System.out.print(s+"="+phonebookTreeMap.get(s)+" ");
        }
        System.out.println();
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(s.equals("Quit"))
                break;
            if(phonebook.containsKey(s))
                System.out.println(s+"="+phonebook.get(s));
            else
                System.out.println("Not found");

        }

    }
}
