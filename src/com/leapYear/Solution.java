package com.leapYear;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n%4==0){
            if(n%400==0)
                System.out.println("Leap Year2");
            if(n%100 == 0)
                System.out.println("Not a leap year");
            else
                System.out.println("Leap Year");
        }
        else
            System.out.println("Not a Leap Year");
    }

}
