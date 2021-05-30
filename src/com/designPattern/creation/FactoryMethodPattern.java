package com.designPattern.creation;
abstract class Food{
    private int quantity;
    public Food(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    public abstract void consume();
}
class Pellet extends Food{
    public Pellet(int quantity){
        super(quantity);
    }
    public void consume(){
        System.out.println("Pellet consumed: "+getQuantity());
    }
}
class Hay extends Food{
    public Hay(int quantity){
        super(quantity);
    }
    public void consume(){
        System.out.println("Hay consumed: "+getQuantity());
    }
}
class Fish extends Food{
    public Fish(int quantity){
        super(quantity);
    }
    public void consume(){
        System.out.println("Fish consumed: "+getQuantity());
    }
}
class FoodFactory{
    public static Food getFood(String animalName){
        switch(animalName){
            case "Polar Bear": return new Fish(20);
            case "Rabbit": return new Pellet(5);
            case "Donkey": return new Hay(90);
            default: return new Hay(0);
        }
    }
}

public class FactoryMethodPattern {
    public static void main(String[] args) {
        Food food = FoodFactory.getFood("Rabbit");
        food.consume();
    }
}
