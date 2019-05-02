package com.company;

public class Birds extends abstractAnimal {

    public Birds (String name, int year){
        setYear(year);
        setName(name);
    }

    @Override
    public String move() {
        return "fly";

    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }
}
