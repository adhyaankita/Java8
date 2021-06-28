//Alternative to Runnable Interface
package com.concurrency.callable;

import java.util.concurrent.*;

import static sun.swing.SwingUtilities2.submit;

public class Solution {
    public static void main(String[] args) throws ExecutionException,InterruptedException{
        ExecutorService service = null;
        try{
            service = Executors.newSingleThreadExecutor();
            Future<Integer> result = service.submit(() -> 30+11);
            System.out.println(result.get());
        } finally {
            if(service != null)
                service.shutdown();
        }
        if(service != null){
            service.awaitTermination(1, TimeUnit.MINUTES);
            if(service.isTerminated())
                System.out.println("Task Finished");
            else
                System.out.println("Task Running");
        }
    }
}
