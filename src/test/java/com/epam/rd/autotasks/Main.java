package com.epam.rd.autotasks;

public class Main {

    public static void main(String[] args) {
        NewPostOffice office = new NewPostOffice();
        office.addBox("Addresser36", "Recipient42", 19.9767391701163, 0.18578416547367377, 1);
        office.addBox("Addresser37", "Recipient43", 19.9767391701164, 0.18578416547367378, 2);
        office.addBox("Addresser38", "Recipient44", 19.9767391701165, 0.18578416547367379, 3);

        office.declineCostOfBox(2);

    }
}
