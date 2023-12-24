package org.example;

public class Deals {
    private String name;
    private int numberOfAttractions;
    private double discount;

    public Deals(int numberOfAttractions,String name,double discount) {
        this.numberOfAttractions = numberOfAttractions;
        this.name=name;
        this.discount=discount;
    }

    public String getName() {
        return name;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setNumberOfAttractions(int numberOfAttractions) {
        this.numberOfAttractions = numberOfAttractions;
    }

    @Override
    public String toString(){
        return "Deal Name is "+ name+"and it is available on total number of "+numberOfAttractions+"attractions.The discount for this is "+discount;
    }
}
