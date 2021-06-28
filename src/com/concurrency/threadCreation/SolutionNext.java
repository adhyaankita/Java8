//Create a class that extends Thread and overrides the run() method.
package com.concurrency.threadCreation;

public class SolutionNext extends Thread {
    public void run(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println("Begin");
        (new SolutionNext()).start();
        (new Thread(new Solution())).start();
        (new SolutionNext()).start();
        System.out.println("End");
    }
}
