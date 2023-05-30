package com.streams;

import java.util.ArrayList;
import java.util.List;

public class DuplicateEntries {

    private String name;

    public void Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class AddresBook {
    private List<Person2> contacts;

    public void AddressBook() {
        contacts = new ArrayList<>();
    }
    public void addPerson(Person2 person) {
        if (contacts.stream().anyMatch(p -> p.getState().equals(person.getState()))) {
            System.out.println("Duplicate entry found for " + person.getState() + ". Entry not added.");
        } else {
            contacts.add(person);
            System.out.println("Added " + person.getState() + " to the address book.");
        }
    }
// Other methods of the AddressBook class

    public List<Person2> getContacts() {
        return contacts;
    }
}

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        Person2 person1 = new Person2("John Doe");
        Person2 person2 = new Person2("Jane Smith");
        Person2 person3 = new Person2("John Doe"); // Duplicate person

        addressBook.addPerson(person1); // Added John Doe to the address book.
        addressBook.addPerson(person2); // Added Jane Smith to the address book.
        addressBook.addPerson(person3); // Duplicate entry found for John Doe. Entry not added.

        System.out.println("Address Book Contacts:");
        List<Person2> contacts = addressBook.getContacts();
        for (Person2 person : contacts) {
            System.out.println(person.getState());
        }
    }
}