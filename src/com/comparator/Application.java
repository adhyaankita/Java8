package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Duck{
    private String name;
    private int weight;

    public Duck(String name, int weight){
        if(name == null) throw new IllegalArgumentException();
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public int getWeight(){
        return this.weight;
    }

    @Override
    public String toString(){
        return "Duck Name: "+name
                +" Duck Weight: "+weight;
    }

}
public class Application {
    public static void main(String[] args) {
        Comparator<Duck> sortByNameAndWeight = new Comparator<Duck>() {
            @Override
            public int compare(Duck o1, Duck o2) {
                int result = o1.getName().compareTo(o2.getName());
                if(result != 0)
                    return result;
                return o1.getWeight()- o2.getWeight();
            }
        };

        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Zyx",20));
        ducks.add(new Duck("Abc",100));
        ducks.add(new Duck("Zyx",50));
        Collections.sort(ducks,sortByNameAndWeight);
        System.out.println(ducks);



    }
}



