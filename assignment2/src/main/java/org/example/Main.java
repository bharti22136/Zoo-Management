package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Zoo z=new Zoo();
        Mammal m1=new Mammal("Mammal","elephant");
        m1.setVoice("trumph");
        m1.setDescription("The largest elephant on record was an adult male African savanna elephant.");
        Mammal m2=new Mammal("Mammal","monkey");
        m2.setVoice("chatter");
        m2.setDescription("Just like young children, monkeys have a high IQ.");
        Amphibians a11=new Amphibians("Amphibian","Toads");
        a11.setVoice("qwark");
        a11.setDescription("Toad is a common name for certain frogs, especially of the family Bufonidae, that are characterized by dry, leathery skin, short legs");
        Amphibians a3=new Amphibians("Amphibian","Frogs");
        a3.setVoice("tar");
        a3.setDescription("The oldest fossil proto-frog Triadobatrachus is known from the Early Triassic of Madagascar,");
        Reptiles r1=new Reptiles("Reptile","snake");
        r1.setVoice("buzzing");
        r1.setDescription("In perfect conditions, adult snakes live anywhere from 20 to 30 years,");
        Reptiles r2=new Reptiles("Reptile","crocodile");
        r2.setVoice("growl");
        r2.setDescription("crocodiles share a heritage with dinosaurs as part of a group known as archosaurs");
        z.addAnimal(m1);
        z.addAnimal(m2);
        z.addAnimal(r1);
        z.addAnimal(r2);
        z.addAnimal(a11);
        z.addAnimal(a3);


        System.out.println("Welcome to Zootopia!");
        while(true) {

                System.out.println("1. Enter as Admin");
                System.out.println("2. Enter as visitor");
                System.out.println("3. View Special Deals");
            int choice1 = sc.nextInt();
            switch (choice1){
                case 1:
                    System.out.println("******************Logging in as Admin********************");
                    System.out.print("Enter Admin Username: " );
                    String n1=sc.next();
                    System.out.print("Enter Admin Password: ");
                    String p1=sc.next();
                    if("Bharti123".equals(n1) && "1234".equals(p1)) {


                        System.out.println("*****************Logged in Successfully******************");
                        int choice2 = 1;
                        int flag=0;
                        while (choice2 > 0 && choice2 < 9 && flag==0) {
                            System.out.println("1.Manage Attractions");
                            System.out.println("2.Manage Animals");
                            System.out.println("3.Schedule Events");
                            System.out.println("4.Set Discounts");
                            System.out.println("5.Set Special Deals");
                            System.out.println("6.View Visitor Stats");
                            System.out.println("7.View Feedback");
                            System.out.println("8.Exit");
                            choice2 = sc.nextInt();
                            switch (choice2) {
                                case 1:
                                    int choice3 = 1;
                                    int flag1=0;
                                    while ((choice3 > 0 && choice3 < 6) && flag1==0) {
                                        System.out.println("1.Add Attractions");
                                        System.out.println("2.View Attractions");
                                        System.out.println("3.Modify Attraction");
                                        System.out.println("4.Remove Attraction");
                                        System.out.println("5.Exit");
                                        choice3 = sc.nextInt();
                                        switch (choice3) {
                                            case 1:
                                                sc.nextLine();
                                                System.out.print("Enter Attraction name: ");
                                                String attrName1 = sc.nextLine();
                                                System.out.print("Enter attraction ID: ");
                                                int id = sc.nextInt();
                                                sc.nextLine();
                                                System.out.print("Enter attraction Description: ");
                                                String message = sc.nextLine();
                                                Attractions attractions = new Attractions(id, message, attrName1);
                                                z.addAttraction(attractions);
                                                System.out.println("**********Attraction Added Successfully!***************");
                                                break;

                                            case 2:
                                                List<Attractions> a1 = z.getAttractionsList();
                                                if (a1.isEmpty()) {
                                                    System.out.println("No attractions present:(");
                                                }
                                                else {
                                                    System.out.println("List of Attractions is :");
                                                    for (Attractions i : a1) {
                                                        System.out.print(i.getAttractionId());
                                                        System.out.println("."+i.getName()+". Description: "+i.getMessage());
                                                    }
                                                }
                                                System.out.println("--------------------------------");
                                                break;

                                            case 3:

                                                System.out.println("Enter attraction name to modify:");
                                                sc.nextLine();
                                                String attrName2 = sc.nextLine();
                                                boolean present = z.isAttractionNamePresent(attrName2);
                                                if (present) {

                                                    System.out.print("Enter attraction name: ");
                                                    sc.nextLine();
                                                    String newName = sc.nextLine();
                                                    System.out.print("Enter attraction id: ");
                                                    int id1 = sc.nextInt();

                                                    System.out.print("Enter message: ");
                                                    sc.nextLine();
                                                    String message1 = sc.nextLine();
                                                    z.modifyAttraction(id1, newName, message1);
                                                    Attractions a7 = new Attractions( id1, message1, newName);
                                                    z.removeAttractionsByName(attrName2);
                                                    z.addAttraction(a7);
                                                    System.out.println("Attraction Modified Successfully");
                                                } else {
                                                    System.out.println("Attraction with this name is not present");
                                                }
                                                break;

                                            case 4:
                                                System.out.println("Enter attraction ID to remove");
                                                int attrId = sc.nextInt();
                                                boolean present2 = z.isAttractionIDPresent(attrId);
                                                if (present2) {
//                                            int id2 = sc.nextInt();
                                                    z.removeAttractions(attrId);
                                                    System.out.println("Attraction Removed Successfully");
                                                } else {
                                                    System.out.println("Attraction with given ID is not present");
                                                }
                                                break;

                                            case 5:
                                                flag1=1;

                                                break;

                                            default:
                                                System.out.println("Enter valid key");
                                                break;
                                        }
                                    }
                                    break;

                                case 2:
                                    System.out.println("Manage Animals: ");
                                    int choice16=1;
                                    int flag7=0;
                                    while(choice16>0 && choice16<6 && flag7==0){
                                        System.out.println("1. Add Animal\n" +
                                                "2. Update Animal Details\n" +
                                                "3. Remove Animal\n" +
                                                "4. List Animals\n"+
                                                "5. Exit\n");
                                        choice16=sc.nextInt();
                                        switch (choice16){
                                            case 1:
                                                sc.nextLine();
                                                System.out.print("Enter animal name: ");
                                                String n8=sc.nextLine();
                                                System.out.print("Enter Animal type: ");
                                                String t1=sc.next();
                                                sc.nextLine();
                                                if(t1.equals("Mammal")){
                                                    Mammal n=new Mammal(t1,n8);
                                                    z.addAnimal(n);
                                                }
                                                else if(t1.equals("Amphibian")){
                                                    Amphibians n=new Amphibians(t1,n8);
                                                    z.addAnimal(n);
                                                }
                                                else if(t1.equals("Reptile")){
                                                    Reptiles n=new Reptiles(t1,n8);
                                                    z.addAnimal(n);
                                                }
                                                for(Animals i: z.listAnimals()){
                                                    System.out.println(i.getAnimalName());
                                                }
                                                break;

                                            case 2:
                                                System.out.println("Update Animal Details");

                                                System.out.print("Enter name of animal of which you want to add details: ");
                                                String n7=sc.next();
                                                Animals a=z.findAnimalByName(n7);
                                                if(a!=null) {
                                                    System.out.print("Enter voice of animal: ");
                                                    String n9 = sc.next();
                                                    a.setVoice(n9);
                                                    System.out.print("Enter description of animal: ");
                                                    sc.nextLine();
                                                    String t = sc.nextLine();
                                                    a.setDescription(t);
                                                    System.out.println("Details updated successfully");
                                                }
                                                else{
                                                    System.out.println("Animal is not present");
                                                }
                                                break;

                                            case 3:
                                                System.out.println("Enter name of animal to remove");
                                                String na=sc.next();
                                                z.removeAnimals(na);
                                                break;

                                            case 4:
                                                for(Animals i: z.listAnimals()){
                                                    System.out.println("->"+i.getAnimalName());
                                                }
                                                break;
                                            case 5:
                                                flag7=1;
                                                break;


                                            default:
                                                break;
                                        }
                                    }
                                    break;
                                case 3:
                                    int choice4 = 1;
                                    int flag2=0;
                                    while (choice4 > 0 && choice4 < 3 && flag2==0) {
                                        System.out.println("1.Schedule start time and end time of event and cost of event");
                                        System.out.println("2.Back");
                                        choice4 = sc.nextInt();
                                        switch (choice4) {
                                            case 1:
                                                sc.nextLine();
                                                System.out.print("Enter ID of event: ");
                                                int n4 = sc.nextInt();
                                                Attractions a=z.getAttractionByID(n4);


                                                System.out.print("Enter cost of event: ");
                                                double c1 = sc.nextDouble();
                                                a.setCost(c1);

                                                System.out.print("Enter start time of event: ");
                                                String start=sc.next();
                                                a.setStartTime(start);

                                                System.out.print("Enter end time of event: ");
                                                String end=sc.next();
                                                a.setEndTime(end);
                                                Events e = new Events(c1, start,end);
                                                a.setEvent(e);
                                                z.addEvent(e);
                                                break;

                                            case 2:
                                                flag2=1;
                                                break;

                                            default:
                                                System.out.println("Enter valid key!");
                                                break;

                                        }
                                    }
                                    break;
                                case 4:
                                    int choice5 = 1;
                                    int flag3=0;
                                    while (choice5 > 0 && choice5 < 5 && flag3==0) {
                                        System.out.println("1.Add Discount");
                                        System.out.println("2.Modify Discount");
                                        System.out.println("3.Remove Discount");
                                        System.out.println("4.Exit");
                                        choice5 = sc.nextInt();
                                        switch (choice5) {
                                            case 1:
                                                sc.nextLine();
                                                System.out.print("Enter Discount Category: ");
                                                String n2 = sc.nextLine();
                                                System.out.println("Enter discount category limiting age(less than)");
                                                int age=sc.nextInt();
                                                System.out.print("Enter Discount Percentage: ");
                                                double d1 = sc.nextDouble();
                                                Offers o1 = new Offers(n2, d1,age);
                                                z.addOffers(o1);
                                                System.out.println("Discount Added Successfully");
                                                break;

                                            case 2:
                                                sc.nextLine();
                                                System.out.print("Enter the category: ");
                                                String c1 = sc.nextLine();

                                                System.out.print("Enter new discount: ");
                                                double d2 = sc.nextDouble();
                                                z.modifyDiscount(c1, d2);
                                                System.out.println("Discount is Modified Successfully!");
                                                break;

                                            case 3:
                                                sc.nextLine();
                                                System.out.print("Enter the category of which you want to remove discount: ");
                                                String c2 = sc.nextLine();
                                                z.removeDiscount(c2);
                                                System.out.println("Discount Removed Successfully");
                                                break;

                                            case 4:
                                                flag3=1;
                                                break;

                                            default:
                                                System.out.println("Enter valid key");
                                                break;


                                        }
                                    }
                                    break;


                                    case 5:
                                    int choice6 = 1;
                                    int flag4=0;
                                    while (choice6 > 0 && choice6 < 6 && flag4==0) {
                                        System.out.println("1.Add new Deal");
                                        System.out.println("2.Modify deal");
                                        System.out.println("3.Delete deal");
                                        System.out.println("4.List deal");
                                        System.out.println("5.Exit");
                                        choice6 = sc.nextInt();
                                        switch (choice6) {
                                            case 1:
                                                sc.nextLine();
                                                System.out.print("Enter name of deal: ");
                                                String n5 = sc.nextLine();
                                                System.out.print("Enter number of attractions which you want to visit: ");
                                                int d4 = sc.nextInt();
                                                System.out.print("Enter Discount Percentage: ");
                                                double p2 = sc.nextDouble();
                                                Deals d = new Deals(d4, n5, p2);
                                                z.setDeals(d);
                                                break;

                                            case 2:
                                                sc.nextLine();
                                                System.out.print("Enter name of deal: ");
                                                String n6 = sc.nextLine();
                                                boolean present = z.isDealNamePresent(n6);
                                                if (present) {
                                                    sc.nextLine();
                                                    System.out.print("Enter new name of deal: ");
                                                    String newName1 = sc.nextLine();
                                                    System.out.print("Enter new number of attractions you want to visit: ");
                                                    int id2 = sc.nextInt();
                                                    System.out.print("Enter discount: ");
                                                    double d5 = sc.nextDouble();
                                                    z.modifyDeals(newName1, d5, id2);
                                                    System.out.println("Deal Modified Successfully");
                                                } else {
                                                    System.out.println("Deal with this name is not present");
                                                }
                                                break;

                                            case 3:
                                                sc.nextLine();
                                                System.out.print("Enter name of deal to delete: ");
                                                String n7 = sc.nextLine();
                                                boolean present4 = z.isDealNamePresent(n7);
                                                if (present4) {
                                                    z.removeDeals(n7);
                                                    System.out.println("Deal Removed Successfully");
                                                } else {
                                                    System.out.println("Deal with given name is not present");
                                                }
                                                break;

                                            case 4:
                                                System.out.println("List of all deals available are");
                                                for(Deals i: z.listDeals()){
                                                    System.out.println(i);
                                                }
                                                break;

                                            case 5:
                                                flag4=1;

                                                break;

                                            default:
                                                System.out.println("Enter valid key");
                                                break;
                                        }
                                    }
                                    break;
                                case 6:
                                    System.out.println("Visitor's statistics");
                                    z.displayVisitorStats();
                                    break;

                                case 7:
                                    if(z.displayFeedback()!=null) {
                                        System.out.println("Feedbacks are:");
                                        for (Feedback i : z.displayFeedback()) {
                                            System.out.println(i);
                                        }
                                    }
                                    else{
                                        System.out.println("No feedbacks are present currently!");
                                    }
                                    break;

                                case 8:
                                    flag=1;
                                    break;


                                default:
                                    System.out.println("Enter valid key");
                                    break;
                            }
                        }
                    }
                    else{

                        System.out.println("Enter correct Admin name or password");
                    }
                    break;


                case 2:
                    int choice8=1;
                    int flag6=0;
                    while(choice8>0 && choice8<3 && flag6==0) {
                        System.out.println("1.Register");
                        System.out.println("2.Login");
                        choice8 = sc.nextInt();
                        if (choice8 == 1) {
                            sc.nextLine();
                            System.out.print("Enter Visitor Name: ");
                            String n2 = sc.nextLine();
                            System.out.print("Enter visitor Age: ");
                            int a = sc.nextInt();
                            System.out.print("Enter visitor Phone Number: ");
                            int n = sc.nextInt();
                            System.out.print("Enter visitor balance: ");
                            double b = sc.nextDouble();
                            System.out.print("Enter Visitor Email: ");
                            String e = sc.next();
                            sc.nextLine();
                            System.out.print("Enter Visitor Password: ");
                            String p = sc.nextLine();
                            z.newVisitor(n2, a, n, b, e, p);
                        } else if (choice8 == 2) {

                            System.out.print("Enter Visitor Email: ");
                            String e1 = sc.next();
                            sc.nextLine();
                            System.out.print("Enter Visitor Password: ");
                            String p2 = sc.nextLine();
                            boolean present3 = z.checkVisitorLogin(e1, p2);
                            if (present3) {
                                System.out.println("Login Successful");
                                Visitor v = z.checkVisitorLoginReturnVisitor(e1, p2);
                                flag6=0;
                                int choice9=1;
                                while(choice9>0 && choice9<10 && flag6==0){
                                System.out.println("|----------------|");
                                System.out.println(" Visitor Menu:");
                                System.out.println("|----------------|");
                                System.out.println("1. Explore the Zoo\n" +
                                        "2. Buy Membership\n" +
                                        "3. Buy Tickets\n" +
                                        "4. View Discounts\n" +
                                        "5. View Special Deals\n" +
                                        "6. Visit Animals\n" +
                                        "7. Visit Attractions\n" +
                                        "8. Leave Feedback\n" +
                                        "9. Log Out\n");
                                choice9 = sc.nextInt();
                                switch (choice9) {
                                    case 1:
                                        System.out.println("Explore the Zoo: ");
                                        int flag5=0;
                                        int choice10=1;
                                        while(choice10>0 && choice10<4 && flag5==0) {
                                            System.out.println("1. View Attractions\n" +
                                                    "2. View Animals\n" +
                                                    "3. Exit\n");
                                            choice10 = sc.nextInt();
                                            switch (choice10) {
                                                case 1:
                                                    System.out.println("Attractions in the Zoo: ");
                                                    for(Attractions i: z.getAttractionsList()){
                                                        System.out.println("->"+i.getName());
                                                    }
                                                    break;

                                                case 2:
                                                    for(Animals i: z.listAnimals()){
                                                        System.out.println("->"+i.getAnimalName());
                                                    }
                                                    break;
                                                case 3:
                                                    flag5=1;
                                                    break;
                                                default:
                                                    break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Buy Membership: ");
                                        System.out.println("1. Basic Membership (₹20)\n" +
                                                "2. Premium Membership (₹50)\n");
                                        int choice11 = sc.nextInt();
                                        if (choice11 == 1) {
                                            z.newpurchaseBasicMembership(v);
                                        } else if (choice11 == 2) {
                                            z.newPurchasePremiumMembership(v);

                                        } else {
                                            System.out.println("Enter valid key");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Buy Tickets: ");
                                        System.out.println("Select an Attraction to Buy a Ticket.Enter it's ID: ");
                                        List<Attractions> aa=z.getAttractionsList();
                                        if(!aa.isEmpty()) {
                                            for (Attractions i : aa) {
                                                System.out.println(i.getAttractionId()+"."+i.getName() + " " + i.getCost());
                                            }
                                        }
                                        int choice12 = sc.nextInt();

                                        Attractions a6=z.getAttractionByID(choice12);
                                        z.purchaseTicket(v,a6);
                                        break;

                                    case 4:
                                        System.out.println("View Discounts: ");
                                        for(Offers i: z.listOffers()){
                                            System.out.println("->"+i.getCategory()+" ("+i.getPercentage()+"% discount) - "+ i.getCategory()+i.getPercentage());
                                        }
                                        break;

                                    case 5:
                                        System.out.println("Special Deals");
                                        System.out.println("Get 15% off on 2 ticket purchase");
                                        System.out.println("Get 30% off on 3 ticket purchase");
                                        System.out.println("---------------------------------------");
                                        break;

                                    case 6:
                                        System.out.println("Visit Animals: ");
                                        for(Animals i: z.listAnimals()){
                                            System.out.println(i.getAnimalName());
                                        }
                                        System.out.println("Enter animal name to visit: ");
                                        sc.nextLine();
                                        String name=sc.nextLine();
                                        Animals a=z.findAnimalByName(name);

                                        int choice16=1;
                                        int flag7=0;

                                        while(choice16>0 && choice16<4 && flag7==0){
                                            System.out.println("1.Feed "+a.getAnimalName());
                                            System.out.println("2.Read about "+a.getAnimalName());
                                            System.out.println("3.Back");
                                            choice16=sc.nextInt();
                                            switch(choice16){
                                                case 1:
                                                    System.out.println("~~~~~~~"+a.getVoice()+"~~~~~~~~");
                                                    break;

                                                case 2:
                                                    System.out.println("~~~~~~"+a.getDescription()+"~~~~~~~");
                                                    break;

                                                case 3:
                                                    flag7=1;
                                                    break;

                                                default:
                                                    System.out.println("Enter valid key");
                                                    break;


                                            }
                                        }

                                        break;
                                    case 7:
                                        System.out.println("Visit Attractions: ");
                                        System.out.println("Select an Attraction to visit: ");
                                        for(Attractions i: z.getAttractionsList()){
                                            System.out.println(i.getName());
                                        }
                                        System.out.print("Enter attraction name to visit: ");
                                        sc.nextLine();
                                        String att=sc.nextLine();
                                        if(att!=null) {
                                            Attractions ar = z.getAttractionByName(att);
                                            if ("Premium".equals(v.getMembershipType())) {
                                                if(z.isAttractionNamePresent(att)){
                                                System.out.println("Thank you for visiting .Hope you enjoyed the attraction.");}
                                                else{
                                                    System.out.println("Given Attraction is not present");
                                                }
                                            }
                                            else if ("Basic".equals((v.getMembershipType()))) {
                                                if (ar.getNumberOfTickets() == 0) {
                                                    System.out.println("Ticket not Available. Buy ticket to visit Attraction");
                                                } else {

                                                    System.out.println("**********1 Ticket Used***********");
                                                    ar.decNumberOfTickets();
                                                    System.out.println("Thank you for visiting .Hope you enjoyed the attraction:)");

                                                }
                                            }
                                            else {
                                                System.out.println("Enter valid membership");
                                            }
                                        }
                                        else{
                                            System.out.println("Given attraction is not present!");
                                        }
                                        break;

                                    case 8:
                                        System.out.print("Please enter your valuable feedback: ");
                                        sc.nextLine();
                                        String m = sc.nextLine();
                                        Feedback f1 = new Feedback(m) {
                                        };
                                        z.writeFeedback(f1);
                                        System.out.println("Thank you for your valuable feedback");

                                        break;
                                    case 9:
                                        flag6=1;
                                        break;
                                    default:
                                        break;
                                }
                                }
                            } else {
                                System.out.println("Invalid Email or Password!");
                            }


                        } else {
                            System.out.println("Enter valid key");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Special Deals are: ");
                    System.out.println("Get 15% off on 2 ticket purchase");
                    System.out.println("Get 30% off on 3 ticket purchase");
                    break;
                default:
                    System.out.println("Enter valid key");
                    break;

            }
        }

    }
}