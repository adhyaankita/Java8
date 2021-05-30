package com.isAHasARelationship;
class Birds{
    protected Beaks beak;
    protected int noOfLegs;
    Birds(int noOfLegs){
        this.beak=new Beaks("Any Colour");
        this.noOfLegs = noOfLegs;
    }
}
class Beaks{
    protected String colorOfBeak;
    Beaks(String color){
        this.colorOfBeak = color;
    }
}
class Pigeon extends Birds{
    public String colorOfEye;
    Pigeon(String colorOfEye){
        super(2);
        beak.colorOfBeak = "Red";
        this.colorOfEye = colorOfEye;
    }
}
public class Solution {
    public static void main(String[] args) {
        Pigeon pigeon1 = new Pigeon("Black");
        System.out.println("Color of Beak: "+pigeon1.beak.colorOfBeak);
        System.out.println("No. of Legs: "+pigeon1.noOfLegs);
        System.out.println("Color of Eye: "+pigeon1.colorOfEye);
    }


}
