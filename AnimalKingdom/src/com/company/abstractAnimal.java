package com.company;

public abstract class abstractAnimal {
    private int  year;
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }



    public void eat(){
        System.out.println("Eating");
    }

    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

}
