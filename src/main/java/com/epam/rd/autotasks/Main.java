package com.epam.rd.autotasks;

public class Main {
    public static void main(String[] args) {
        NewPostOffice office = new NewPostOffice();

        office.addBox("Peter", "Hanna", 20, 0.2, 500);
        office.addBox("Hanna", "Ihor", 5, 0.02, 200);
        office.addBox("Dmytro", "Alex", 10, 0.1, 350);

        for (Box box : office.getListBox()) {
            System.out.println(box);
        }

        System.out.println("\nDelivery to recipient");
        for (Box box : office.deliveryBoxToRecipient("Alex")) {
            System.out.println(box);
        }

        System.out.println("\nDecline cost of the box");
        office.declineCostOfBox(5.0);
        for (Box box : office.getListBox()) {
            System.out.println(box);
        }
    }
}
