package com.datastructures.subarray;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        for(int i=0; i < n; i++)
            array[i] = scanner.nextInt();
        int sum=0;
        int noOfSubArrays=0;
        for(int i=0; i<n ;i++) {
            for (int j = i; j < n; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += array[k];
                }
                if(sum<0)
                    noOfSubArrays++;
            }
        }
        System.out.println(noOfSubArrays);
    }
}
