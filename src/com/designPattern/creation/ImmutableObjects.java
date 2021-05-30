package com.designPattern.creation;

public final class ImmutableObjects {
    private final String name;
    private final int id;

    public ImmutableObjects(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){return name;}
    public int getId(){return id;}

}
