package com.swaglab.enums;

public enum Actor {
    
    NAME("Usuario");

    private String name;

    Actor(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
}
