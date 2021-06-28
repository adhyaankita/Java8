package com.concurrency.synchronizeBlockOfCode;

public class Solution extends Thread{
    private final StringBuffer s;
    Solution(StringBuffer obj){
        this.s=obj;
    }
    public void run(){
        synchronized (s){
        for(int i=0; i<100; i++)
            System.out.print(s);
        System.out.println();
        s.setCharAt(0, (char)(s.charAt(0)+1));
        }
    }


    public static void main(String[] args) {
        StringBuffer obj = new StringBuffer("A");
        Solution s1 = new Solution(obj);
        Solution s2 = new Solution(obj);
        Solution s3 = new Solution(obj);
        s1.start();
        s2.start();
        s3.start();
    }
}
