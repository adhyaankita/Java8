package com.datastructures.linkedList;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> L = new LinkedList<>();
        for(int i=0; i<N; i++)
            L.add(scanner.nextInt());
        int Q = scanner.nextInt();
        for(int i=0; i<Q; i++)
        {
            String s = scanner.next();
            if(s.equals("Insert")){
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                L.add(x,y);
            }
            if(s.equals("Delete")){
                int x = scanner.nextInt();
                L.remove(x);
            }
        }
        for(int n:L){
            System.out.print(n+" ");
        }
    }
}
