package com.designPattern.creation;

public class Singleton {

    private Singleton(){}

//    private final static Singleton INSTANCE = new Singleton();
    private static Singleton INSTANCE;
    /*static{
        INSTANCE = new Singleton();
    }*/
    public static Singleton getInstance(){
        if(INSTANCE == null)
           INSTANCE = new Singleton(); //Lazy Evaluation
        return INSTANCE;
    }

    public synchronized void print(){
        System.out.println("I am Singleton");
    }
}

