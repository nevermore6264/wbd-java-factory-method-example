package com.codegym;

public class AnimalFactory {
    public Animal getAnimal(String type) {
        if ("Dogy".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}