package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Duck implements Comparable<Duck>{
    private String name;
    private int age;

    Duck(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return this.name+this.age;
    }


    @Override
    public int compareTo(Duck duck) {
        return this.age-duck.age;
    }
}
public class Solution {
    public static void main(String[] args) {
        List<Duck> duckList = new ArrayList<>();
        duckList.add(new Duck("Satyaki",28));
        duckList.add(new Duck("Sa",10));
        duckList.add(new Duck("tyaki",89));
        duckList.add(new Duck("Satyi",66));
        duckList.add(new Duck("Syaki",55));
        Collections.sort(duckList);
        System.out.println(duckList);
    }



}
