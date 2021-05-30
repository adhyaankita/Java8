package com.generics;
class Bouquet<T,S>{
    private T typeOfFlower;
    private S priceOfFlower;

    Bouquet(T typeOfFlower, S priceOfFlower){
        this.typeOfFlower = typeOfFlower;
        this.priceOfFlower = priceOfFlower;
    }

    public T getTypeOfFlower(){
        return typeOfFlower;
    }

    public S getPriceOfFlower(){
        return priceOfFlower;
    }
}
public class GenericClass {
    public static void main(String[] args) {
        Bouquet<String,Integer> bouquet1 = new Bouquet<>("Lilly",20);
        System.out.println(bouquet1.getPriceOfFlower());
    }


}
