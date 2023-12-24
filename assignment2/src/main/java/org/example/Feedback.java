package org.example;

public class Feedback {
    private String message;

    public Feedback(String message) {
        this.message = message;
    }
    @Override
    public String toString(){
        return "Feedback given is "+message;
    }
}
