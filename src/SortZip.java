package com.streams;

import java.util.*;
import java.util.stream.Collectors;


public class SortZip {
    class Person {
        private String name;
        private String city;
        private String state;
        private String zip;

        public Person(String name, String city, String state, String zip) {
            this.name = name;
            this.city = city;
            this.state = state;
            this.zip = zip;
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

        public String getZip() {
            return zip;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", City: " + city + ", State: " + state + ", ZIP: " + zip;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John Doe", "New York City", "New York", "10001"));
        persons.add(new Person("Jane Smith", "Los Angeles", "California", "90001"));
        persons.add(new Person("Michael Johnson", "Chicago", "Illinois", "60601"));
        persons.add(new Person("Emily Brown", "New York City", "New York", "10002"));

        System.out.println("Sorted Address Book by City:");
        sortByCity(persons).forEach(System.out::println);

        System.out.println("\nSorted Address Book by State:");
        sortByState(persons).forEach(System.out::println);

        System.out.println("\nSorted Address Book by ZIP:");
        sortByZip(persons).forEach(System.out::println);
    }

    public static List<Person> sortByCity(List<Person> persons) {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getCity))
                .collect(Collectors.toList());
    }

    public static List<Person> sortByState(List<Person> persons) {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getState))
                .collect(Collectors.toList());
    }

    public static List<Person> sortByZip(List<Person> persons) {
        return persons.stream()
                .sorted(Comparator.comparing(Person::getZip))
                .collect(Collectors.toList());
    }
}