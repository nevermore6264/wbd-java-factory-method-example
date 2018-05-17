package com.codegym;

public class Main {

    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal a1 = animalFactory.getAnimal("Dogy");
        System.out.println("a1 sound: " + a1.makeSound());

        Animal a2 = animalFactory.getAnimal("Mithy");
        System.out.println("a2 sound: " + a2.makeSound());
    }
}
