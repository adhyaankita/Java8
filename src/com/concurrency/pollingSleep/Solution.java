package com.concurrency.pollingSleep;

public class Solution {
    private static int counter=0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            for (int i = 0; i < 500; i++)
                counter++;
        }).start();
        while(counter<100){
            System.out.println("Not yet reached");
            Thread.sleep(1000);
        }
        System.out.println("Reached!");
    }
}
