package com.company;

public class Fish extends abstractAnimal{

    public Fish (String name, int year){
        setYear(year);
        setName(name);
    }

    @Override
    public String move() {
        return "swim";

    }

    @Override
    public String breath() {
        return "gills";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }
}
