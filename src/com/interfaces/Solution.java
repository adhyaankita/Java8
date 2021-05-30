package com.interfaces;
interface A{
    void print(); //public abstract method
}

class B implements A{
    public void print(){ //implemented in concrete class
        System.out.println("Hi");
    }
}
public class Solution {
    public static void main(String[] args) {
        B b = new B();
        b.print();
    }
}
