package org.example;

public class Mammal extends Animals{
    public Mammal(String typeOfAnimal, String animalName) {
        super("Mammal", animalName);
    }


    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public String getTypeOfAnimal() {
        return "Mammal";
    }



}
