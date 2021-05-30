package com.designPattern.creation;

public class Animal {
    private String name;
    private int noOfLegs;

    public static class Builder{
        private String name;
        private int noOfLegs;

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setNoOfLegs(int noOfLegs){
            this.noOfLegs = noOfLegs;
            return this;
        }

        public Animal build(){
            return new Animal(this);
        }

    }
    private Animal(Builder builder){
        this.name = builder.name;
        this.noOfLegs = builder.noOfLegs;
    }

    @Override
    public String toString(){
        return name+" "+noOfLegs;
    }
}
