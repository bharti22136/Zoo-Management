package org.example;

public class Amphibians extends Animals{
    public Amphibians(String typeOfAnimal, String animalName) {
        super("Amphibian", animalName);
    }

    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public String getTypeOfAnimal() {
        return "Amphibians";
    }

}
