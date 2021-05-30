package com.designPattern.creation;

public class App {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.print();

        ImmutableObjects immutableObjects = new ImmutableObjects("Ankita",100);
        System.out.println(immutableObjects.getId());
        System.out.println(immutableObjects.getName());

        Animal animal = new Animal.Builder().setName("Cow").setNoOfLegs(4).build();
        System.out.println(animal);
    }
}
