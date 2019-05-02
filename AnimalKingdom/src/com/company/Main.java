package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        ArrayList<abstractAnimal> animalsList = new ArrayList<>();

        Mammals Panda =  new Mammals("Panda", 1869);
        Mammals Zebra = new Mammals("Zebra", 1776);
        Mammals Koala = new Mammals("Koala", 1816);
        Mammals Sloth = new Mammals("Sloth", 1804);
        Mammals Armadillo = new Mammals("Armadillo", 1758);
        Mammals Raccoon = new Mammals("Raccoon", 1758);
        Mammals Bigfoot = new Mammals("Bigfoot", 2021);

        Birds Pigeon = new Birds("Pigeon", 1837);
        Birds Peacock = new Birds("Peacock", 1821);
        Birds Toucan = new Birds("Toucan", 1758);
        Birds Parrot = new Birds("Parrot", 1824);
        Birds Swan =new Birds("Swam", 1758);

        Fish Salmon = new Fish("Salmon", 1758);
        Fish Catfish = new Fish("Catfish", 1817);
        Fish Perch = new Fish("Perch", 1758);

        abstractAnimal animalsArray[] = new abstractAnimal[]{
                Panda, Zebra, Koala,
                Sloth, Armadillo, Raccoon,
                Bigfoot, Pigeon, Peacock, Toucan,
                Parrot, Swan, Salmon, Catfish, Perch
        };

        for(abstractAnimal animal : animalsArray){
            animalsList.add(animal);
        }

        animalsList.sort((a,b) -> a.getYear() > b.getYear() ? 1: -1);


        System.out.println("By year: \n");
        for(abstractAnimal animal : animalsList){
            System.out.println(animal.getYear());
        }

        animalsList.sort((a,b) -> a.getName().compareToIgnoreCase(b.getName()));

        System.out.println("\nBy name:");
        for(abstractAnimal animal : animalsList){
            System.out.println(animal.getName());
        }

        List<abstractAnimal> breathers = animalsList.stream()
                .filter(d -> d.breath() == "lungs")
                .collect(Collectors.toList());

        System.out.println("\nBreathers:");
        for(abstractAnimal animal : breathers){
            System.out.println(animal.getName());
        }






    }
}
