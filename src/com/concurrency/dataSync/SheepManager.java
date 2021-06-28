//Protecting Data with Atomic Class; read and write done as atomic operation
//Synchronized blocks and methods
package com.concurrency.dataSync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {
    private int sheepCount = 0;
    //private AtomicInteger sheepCount = new AtomicInteger(0);
    private synchronized void incrementAndReport(){
        System.out.println((++sheepCount)+" ");
        /*synchronized (this){
            System.out.println((++sheepCount)+" ");
        }*/
        //System.out.println((sheepCount.incrementAndGet())+" ");
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try{
            service = Executors.newFixedThreadPool(20);
            SheepManager manager = new SheepManager();
            for(int i=0;i<10;i++)
                service.submit(() -> manager.incrementAndReport());
        }finally {
            if(service != null)
                service.shutdown();
        }
    }

}
