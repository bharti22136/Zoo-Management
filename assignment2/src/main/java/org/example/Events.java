package org.example;

public class Events{
    private String start_time;
    private String end_time;
    private double cost;

    public Events(double cost,String start_time,String end_time) {
        this.cost = cost;
        this.start_time=start_time;
        this.end_time=end_time;
    }

    public double getCost() {
        return cost;
    }


    public String getStart_time() {
        return start_time;
    }


    public String getEnd_time() {
        return end_time;
    }

        @Override
    public String toString(){
        return "Event start is "+ getStart_time()+", End time is "+ getEnd_time()+". The cost of event is :"+getCost();
    }
}
