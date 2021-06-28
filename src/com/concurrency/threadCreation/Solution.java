//Provide a Runnable object or lambda expression to the Thread constructor.
package com.concurrency.threadCreation;

public class Solution implements Runnable{
    public void run(){
        for(int i=0; i<3; i++)
            System.out.println("Printing elements:"+i);
        System.out.println("Run by"+Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        }

    public static void main(String[] args) {
        System.out.println("Main method is run by:"+Thread.currentThread().getName());
        /*Solution s = new Solution();
        Thread t = new Thread(s);
        t.start();*/
        (new Thread(new Solution())).start();
        (new Thread(new Solution())).start();
    }
}

