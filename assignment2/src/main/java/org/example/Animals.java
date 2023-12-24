package org.example;
public class Animals{
    String animalName;
    String typeOfAnimal;
    String description;
    String voice;
    Zoo z=new Zoo();
    public Animals(String typeOfAnimal,String animalName){
        this.typeOfAnimal = typeOfAnimal;
        this.animalName=animalName;
    }

    public String getDescription() {
        return description;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnimalName() {
        return animalName;
    }


    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }


    public String toString(){
        return "Animal name is "+animalName+". Its type is "+typeOfAnimal;
    }

}
