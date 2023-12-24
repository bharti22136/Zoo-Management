package org.example;
public class Attractions {
    private int attractionId;
    private String message;
    private String name;
    public String startTime;
    public String endTime;
    public double cost;
    private int numberOfTickets;
    public Events event;

    public Attractions(int attractionId,String message,String name) {
        this.name=name;
        this.attractionId=attractionId;
        this.message=message;
        this.numberOfTickets=0;
    }
    public int getNumberOfTickets(){
        return numberOfTickets;
    }
    public void IncNumberOfTickets(){
        numberOfTickets++;
    }
    public void decNumberOfTickets(){
        numberOfTickets--;
    }


    public void setEvent(Events event) {
        this.event = event;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public int getAttractionId() {
        return attractionId;
    }

    public void setAttractionId(int attractionId) {
        this.attractionId = attractionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString(){
        return attractionId+".Attraction name is "+name+".This will cost you "+event.getCost()+".  "+message;
    }



}
