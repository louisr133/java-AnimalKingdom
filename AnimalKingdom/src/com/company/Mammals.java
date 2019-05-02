package com.company;

public class Mammals extends abstractAnimal {

    public Mammals (String name, int year){
        setYear(year);
        setName(name);
    }

    @Override
    public String move() {
        return "walk";

    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "live-birth";
    }
}
