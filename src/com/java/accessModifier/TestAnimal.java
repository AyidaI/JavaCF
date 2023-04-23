package com.java.accessModifier;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.colorDefault = "White";
        animal.runProtected();
        animal.namePublic ="Jerry";
        animal.ageProtected = 4;

    }
}
