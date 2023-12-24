package org.example;

public class Offers {
    private String category;
    private double percentage;
    private int age;
    public Offers(String category,double percentage,int age) {
        this.category = category;
        this.percentage=percentage;
        this.age=age;
    }

    public String getCategory() {
        return category;
    }

    public double getPercentage() {
        return percentage;
    }

    public int getAge() {
        return age;
    }


    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }


    @Override
    public String toString(){
        return "Discount for Category "+category+"is "+percentage+"%";
    }
}
