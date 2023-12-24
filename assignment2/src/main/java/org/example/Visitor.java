package org.example;

import java.util.ArrayList;
import java.util.List;

public class Visitor  {
    private String name;
    private String email;
    private int age;
    private int phoneNumber;
    private double balance;
    private String password;
    private List<Attractions> purchasedTicket;
    private String membershipPresent;

    public Visitor(double balance,int age,int phoneNumber,String name,String email,String password) {
        this.balance = balance;
        this.age=age;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.password=password;
        this.name=name;
        this.membershipPresent="None";
        purchasedTicket=new ArrayList<>();
    }
    public List<Attractions> purcTic(){
        return purchasedTicket;
    }

    public String getMembershipPresent() {
        return membershipPresent;
    }

    public void setMembershipPresent(String membershipPresent) {
        this.membershipPresent = membershipPresent;
    }

    public String getMembershipType(){
        if(getMembershipPresent().equals("Premium")){
            return "Premium";
        }
        else if(getMembershipPresent().equals("Basic")){
    return "Basic";
        }
        else{
            return null;
        }
    }


    public String getEmail() {
        return email;
    }


    public String getPassword() {
        return password;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Enter visitor name: " + name + "\nEnter Visitor age: " + age + "\nEnter Visitor phone number: " + phoneNumber + "\nEnter Visitor Balance: " + balance + "\nEnter Visitor Email: " + email + "\nEnter Visitor Password: " + password;
    }

    public int getAge() {
        return age;
    }
}
