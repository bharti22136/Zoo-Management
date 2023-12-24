package org.example;



import java.util.ArrayList;
import java.util.List;

public class Zoo{
    private List<Attractions> attractionsList;
    private List<Attractions> addedAttractions;
    private List<Events> eventList;
    private List<Offers> offersList;
    private List<Deals> deals;
    private int visitorCount;
    private double profit;
    private List<Feedback> feedbackList;
    private List<Visitor> visitorList;
    private List<Animals> animalsList;
    private Offers o;

    public Zoo() {
        attractionsList=new ArrayList<>();
        eventList=new ArrayList<>();
        offersList=new ArrayList<>();
        deals=new ArrayList<>();
        feedbackList=new ArrayList<>();
        visitorList=new ArrayList<>();
        animalsList=new ArrayList<>();
        addedAttractions=new ArrayList<>();
        this.visitorCount=0;
        this.o=o;
        }


    public double applySpecialDeals(Attractions a){
        double price=0;

        price=a.getCost();


                if (addedAttractions.size() == 1) {
                    double finalAmount = 0.15 * price;
                    price -= finalAmount;
                    System.out.println("You received 15% discount");
                } else if (addedAttractions.size() == 2) {
                    double finalAmount = 0.30 * price;
                    price -= finalAmount;
                    System.out.println("You received 30% discount");
                }

        return price;
    }

        public boolean isAnimalValid(Animals a){
        return (a instanceof  Mammal || a instanceof  Amphibians || a instanceof Reptiles);
        }
        public List<Animals> listAnimals(){
        return  animalsList;
        }
        public void addAnimal(Animals a){
            if(isAnimalValid(a)){
            animalsList.add(a);
            }
            else{
                System.out.println("Animal does not belong to 3 subclasses");
            }
        }
    public Animals findAnimalByName(String name){
        for(Animals i:animalsList){
            if(i.getAnimalName().equals(name)){
                return i;
            }
        }
        return null;
    }
    public void newpurchaseBasicMembership(Visitor v){
        double price=20.0;
        if(v.getBalance()>=price) {
            for (Offers i : offersList) {
                if (v.getAge() <= i.getAge()) {
                    double disc=i.getPercentage()/100;
                    price=price-(price*disc);
                    System.out.println("An offer has been applied on your category");
                    break;
                }
            }
            v.setBalance(v.getBalance() - price);
            v.setMembershipPresent("Basic");
            System.out.println("Basic Membership Purchased Successfully! Your balance is now $" + v.getBalance());
            profit = profit + 20;
        }
        else{
            System.out.println("Low Balance:(");
        }


        }

    void newPurchasePremiumMembership(Visitor v){
        double price=50.0;
        if(v.getBalance()>=price) {
            for (Offers i : offersList) {
                if (v.getAge() <= i.getAge()) {
                    double disc=i.getPercentage()/100;
                    price=price-(price*disc);
                    System.out.println("An offer has been applied on your category");
                    break;
                }
            }
            v.setBalance(v.getBalance() - price);
            v.setMembershipPresent("Premium");
            System.out.println("Premium Membership Purchased Successfully! Your balance is now $" + v.getBalance());
            profit = profit + 50;
        }
        else{
            System.out.println("Low Balance:(");
        }

    }

    public void purchaseTicket(Visitor v, Attractions a){
        double price=a.getCost();
        int tickets=a.getNumberOfTickets();
        if(v.getMembershipPresent().equals("Basic")) {
            for (Offers i : offersList) {
                if (v.getAge() <= i.getAge()) {
                    double disc=i.getPercentage()/100;
                    price=price-(price*disc);
                    if (v.getBalance() >= price) {
                        if (addedAttractions.size() >= 1) {
                            price = applySpecialDeals(a);
                        }
                        v.setBalance(v.getBalance() - price);

                        a.IncNumberOfTickets();
                        System.out.println("ticket Purchased successfully! Your balance is now $" + v.getBalance());
                        v.purcTic().add(a);
                        profit = profit + price;
                        addedAttractions.add(a);
                    } else {
                        System.out.println("Low balance:(");
                    }
                    System.out.println("An offer has been applied on your category");
                    break;
                }
            }
        }
        else if(v.getMembershipPresent().equals("Premium")){
            System.out.println("Premium members need not to purchase tickets.");
        }
        else{
            System.out.println("First you need to get any membership");
        }
    }
    public void addAttraction(Attractions attraction){
        attractionsList.add(attraction);
    }
    public void removeAttractions(int attractionID){
        attractionsList.removeIf(attractions -> attractions.getAttractionId()== attractionID);
    }
    public void removeAttractionsByName(String name){
        attractionsList.removeIf(attractions -> attractions.getName().equals(name));
    }
    public void modifyAttraction(int attractionID,String name,String message){
            for(Attractions i: attractionsList){
            if(name.equals(i.getName())){
                i.setName(name);
                i.setAttractionId(attractionID);
                i.setMessage(message);

            }
        }
    }
    public List<Attractions> getAttractionsList(){

        return attractionsList;
    }
    public boolean isAttractionNamePresent(String name){
        for(Attractions j: attractionsList){
            if(name.equals(j.getName())){
                return true;
            }
        }
        return false;
    }
    public boolean isAttractionIDPresent(int id){
        for(Attractions j: attractionsList){
            if(id==j.getAttractionId()){
                return true;
            }
        }
        return false;
    }
    public boolean isDealNamePresent(String name){
        for(Deals j: deals){
            if(name.equals(j.getName())){
                return true;
            }
        }
        return false;
    }
    public Attractions getAttractionByID(int id){
        for(Attractions i:attractionsList){
            if(i.getAttractionId()==id ){
                return i;
            }
        }
        return null;

    }
    public Attractions getAttractionByName(String name){
        for(Attractions i:attractionsList){
            if(i.getName().equals(name)){
                return i;
            }
        }
        return null;

    }
    public void addEvent(Events e){
        eventList.add(e);
    }
    public List<Events> listEvents(){
        return eventList;
    }
    public void addOffers(Offers discount){
        offersList.add(discount);
    }
    public List<Offers> listOffers(){
        return offersList;
    }

    public void modifyDiscount(String category,double percent){
        for(Offers i:offersList){
            if(i.getCategory().equals(category)){
                i.setPercentage(percent);
            }
        }
    }
    public void removeDiscount(String category){
        offersList.removeIf(offers -> offers.getCategory().equals(category));
    }
    public void setDeals(Deals d){
        deals.add(d);
    }

    public void modifyDeals(String name,double discount,int attractions){
        for(Deals i: deals){
            if(i.getName().equals(name)){
                i.setNumberOfAttractions(attractions);
                i.setDiscount(discount);
            }
        }

    }
    public void removeDeals(String name){
        deals.removeIf(deals1 -> deals1.getName().equals(name));
    }
    public List<Deals> listDeals(){
        return deals;
    }
    public String popularAttraction(){
        String mostPopular;
        int maxCount=0;
        for(Attractions i:attractionsList){
            if(visitorCount>maxCount){
                maxCount=visitorCount;
                mostPopular=i.getName();
                return  mostPopular;
            }
        }

        return null;
    }
    public void displayVisitorStats(){
        System.out.println("Total Visitors: "+visitorCount);
        System.out.println("Total profit: $"+profit);
        System.out.println("Most attractive place: "+popularAttraction());
    }

    public List<Feedback> displayFeedback(){
        return feedbackList;
    }

    public boolean isVisitorPresent(Visitor v){
        for(Visitor i:visitorList){
            if(i.equals(v)){
                return true;
            }
        }
        return false;
    }
    public void newVisitor(String name, int age, int phoneNumber, double balance, String email, String password){
        Visitor newV=new Visitor(balance,age,phoneNumber,name,email,password);
        visitorList.add(newV);
        boolean check=isVisitorPresent(newV);

        if(check) {

            visitorList.add(newV);
            System.out.println("Registration is successful");
            visitorCount++;
        }
        else{
            System.out.println("Member is already registered!");
        }
    }
    public boolean checkVisitorLogin(String email,String password) {
        for (Visitor i : visitorList) {
            if (i.getEmail().equals(email) && i.getPassword().equals(password)) {
                return true;
            }

        }
        return false;

    }
    public Visitor checkVisitorLoginReturnVisitor(String email,String password) {
        for (Visitor i : visitorList) {
            if (i.getEmail().equals(email) && i.getPassword().equals(password)) {
                return i;
            }

        }
        return null;

    }
    public void writeFeedback(Feedback f){
        feedbackList.add(f);

    }
    public boolean removeAnimals(String name) {
        Animals animalToRemove = findAnimalByName(name);

        if (animalToRemove != null) {
            String animalType = animalToRemove.getTypeOfAnimal();
            int remainingAnimals = countAnimalsByType(animalType);
            if (remainingAnimals > 2) {
                animalsList.remove(animalToRemove);
                System.out.println("Animal is removed");
                return true;
            } else {
                System.out.println("At least two animals of type " + animalType + " should remain.");
            }
        } else {
            System.out.println("Animal not found.");
        }

        return false;
    }


    private int countAnimalsByType(String type) {
        int count = 0;
        for (Animals animal : animalsList) {
            if (animal.getTypeOfAnimal().equals(type)) {
                count++;
            }
        }
        return count;
    }
}




