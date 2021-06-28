package com.concurrency.threadInteraction;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
class MachineInstructions{
    private final Shape shape;
    MachineInstructions(Shape shape){this.shape = shape;}
}

class Operator extends Thread{
    Machine machine;
    private Shape Rectangle;

    public void run(){
        while (true){
            Shape shape = getShapefromUser();
            MachineInstructions job = calculateNewInstructionsFor(shape);
            machine.addJob(job);
        }
    }

    private MachineInstructions calculateNewInstructionsFor(Shape shape) {
        return new MachineInstructions(shape);
    }

    private Shape getShapefromUser() {
        return Rectangle;
    }
}
public class Machine extends Thread{
    final List<MachineInstructions> jobs = new ArrayList<MachineInstructions>();
    public void addJob(MachineInstructions job){
        synchronized (jobs){
            jobs.add(job);
            jobs.notify();
        }
    }
    public void run(){
        while (true){
            synchronized (jobs){
                while (jobs.isEmpty()){
                    try{
                        jobs.wait();
                    }catch (InterruptedException e){
                        System.out.println("Interrupted");
                    }
                }
                MachineInstructions instructions = jobs.remove(0);
            }
        }
    }
}
