//Introducing the Single-Thread Executor
package com.concurrency.singleThreadExecutor;

import java.util.concurrent.*;

public class Solution {
    private static int counter=0;
    public static void main(String[] args) throws InterruptedException,ExecutionException{
        ExecutorService service=null;
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("Begin");
            service.execute(() -> System.out.println("Hello"));
            service.execute(() -> {
                for (int i = 0; i < 3; i++)
                    System.out.println("Printing elements:" + i);
            });
            service.execute(() -> System.out.println("Hello"));
            Future<?> result = service.submit(() -> {for(int i = 0; i<500; i++)
                counter++;});
            result.get(10, TimeUnit.SECONDS);
            System.out.println("End");
        } catch (TimeoutException e) {
            System.out.println("Not reached in time");;
        } finally {
            if(service != null)
                service.shutdown();
        }
        }
   }

