package com.virtualInvocation;
abstract class Garden{
    public void print(){
        name();
    }
    public void name(){
        System.out.println("Happy Garden");
    }
}
class Plants extends Garden{
    public void name(){
        System.out.println("Lilly");
    }
}
class Trees extends Garden{
    public void name(){
        System.out.println("Banyan");
    }
}

public class Solution {
    public static void main(String... args){
        Garden plant1 = new Plants();
        plant1.print();
    }
}
