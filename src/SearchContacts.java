package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


    class Person1 {
        private String name;
        private String city;
        private String state;

        public Person1(String name, String city, String state) {
            this.name = name;
            this.city = city;
            this.state = state;
        }

        public String getName() {
            return name;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }
    }

    class AddressBooks {
        private List<Person2> contacts;

        public AddressBook() {
            contacts = new ArrayList<>();
        }

        public void addPerson(Person2 person) {
            contacts.add(person);
        }

        public List<Person2> searchByCity(String city) {
            return contacts.stream()
                    .filter(person -> person.getCity().equalsIgnoreCase(city))
                    .collect(Collectors.toList());
        }

        public List<Person2> searchByState(String state) {
            return contacts.stream()
                    .filter(person -> person.getState().equalsIgnoreCase(state))
                    .collect(Collectors.toList());
        }

        // Other methods of the AddressBook class

        public List<Person2> getContacts() {
            return contacts;
        }
    }

public class SearchContacts {
    public static void main(String[] args) {
        AddressBooks addressBook1 = new AddressBooks();
        AddressBooks addressBook2 = new AddressBooks();

        Person2 person1 = new Person2("John Doe", "New York City", "New York");
        Person2 person2 = new Person2("Jane Smith", "Los Angeles", "California");
        Person2 person3 = new Person2("Michael Johnson", "New York City", "New York");
        Person2 person4 = new Person2("Emily Brown", "Chicago", "Illinois");

        addressBook1.addPerson(person1);
        addressBook1.addPerson(person2);
        addressBook2.addPerson(person3);
        addressBook2.addPerson(person4);

        String cityToSearch = "New York City";
        List<Person2> personsInCity = new ArrayList<>();
        personsInCity.addAll(addressBook1.searchByCity(cityToSearch));
        personsInCity.addAll(addressBook2.searchByCity(cityToSearch));

        System.out.println("Persons in " + cityToSearch + ":");
        for (Person2 person : personsInCity) {
            System.out.println(person.getState());
        }
    }
}

}