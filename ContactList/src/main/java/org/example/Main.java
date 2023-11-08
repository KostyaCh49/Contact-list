package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    Options:
                    1. Add Contact
                    2. List Contacts
                    3. Edit Contact
                    4. Delete Contact
                    5. Quit
                    Enter your choice:\s""");

            int choice = scanner.nextInt();
            System.out.println();
            switch (choice) {
                case 1 -> addContact();
                case 2 -> listContacts();
                case 3 -> editContact();
                case 4 -> deleteContact();
                case 5 -> System.exit(0);
                default -> System.out.println("Choose 1-5");
            }
        }
    }

    public static void addContact() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.next();

        System.out.print("Enter surname: ");
        String surname = scanner.next();

        System.out.print("Enter phone number: ");
        Long phoneNumber = scanner.nextLong();

        Contact contact = new Contact(name, surname, phoneNumber);
        contacts.add(contact);
        System.out.println();
    }

    public static void deleteContact() {
        Scanner scanner = new Scanner(System.in);
        listContacts();

        System.out.print("Which contact do you want to delete? Enter numbering: ");
        int whichContact = scanner.nextInt();
        whichContact--;
        if (contacts.get(whichContact) != null) {
            contacts.remove(whichContact);
            System.out.println("Successfully");
        } else {
            System.out.println("Not found");
        }
        System.out.println();
    }

    public static void editContact() {
        Scanner scanner = new Scanner(System.in);
        listContacts();

        System.out.print("Which contact do you want to edit? Enter numbering: ");
        int whichContact = scanner.nextInt();
        whichContact--;

        System.out.print("What do you want to edit? Enter 1-3 (1-name; 2-surname; 3-phone number): ");
        int whatEdit = scanner.nextInt();

        switch (whatEdit) {
            case 1 -> {
                System.out.print("Enter name: ");
                contacts.get(whichContact).setName(scanner.next());
            }
            case 2 -> {
                System.out.print("Enter surname: ");
                contacts.get(whichContact).setSurname(scanner.next());
            }
            case 3 -> {
                System.out.print("Enter phone number: ");
                contacts.get(whichContact).setPhoneNumber(scanner.nextLong());
            }
        }
        System.out.println();
    }

    public static void listContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println("Contact " + ++i + ": "); i--;
            System.out.println("Name: " + contacts.get(i).getName());
            System.out.println("Surname: " + contacts.get(i).getSurname());
            System.out.println("Phone number: " + contacts.get(i).getPhoneNumber() + "\n");
        }
    }
}