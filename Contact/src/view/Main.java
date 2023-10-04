package view;

import controller.Manager;
import java.util.ArrayList;
import model.Contact;

public class Main {

    public static void main(String[] args) {
        ArrayList<Contact> lc = new ArrayList<>();
        lc.add(new Contact(1, "Phan Thanh Hoang", "SE17D04", "Sao Hoa", "1234567890", "Thanh", "Hoang"));
        lc.add(new Contact(2, "Nguyen Nguyen Phuong Thao", "OJT", "Sao Kim", "1234567890", "Phuong", "Thao"));
        lc.add(new Contact(3, "Ho Ngoc Minh", "SE17D04", "Quang Binh", "1234567890", "Ngoc", "Minh"));
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.createContact(lc);
                    break;
                case 2:
                    Manager.printAllContact(lc);
                    break;
                case 3:
                    Manager.deleteContactd(lc);
                    break;
                case 4:
                    return;
            }
        }
    }
}
