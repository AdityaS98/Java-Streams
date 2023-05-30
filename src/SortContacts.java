package com.streams;

import java.util.*;
import java.util.stream.Collectors;

class Person3 implements Comparable<Person3> {
    private String name;
    private String city;
    private String state;

    public Person3(String name, String city, String state) {
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

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.getName());
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", State: " + state;
    }
}



    public class SortContacts {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John Doe", "New York City", "New York"));
        persons.add(new Person("Jane Smith", "Los Angeles", "California"));
        persons.add(new Person("Michael Johnson", "New York City", "New York"));
        persons.add(new Person("Emily Brown", "Chicago", "Illinois"));

        List<Person> sortedList = persons.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted Address Book Entries:");
        for(Person person : sortedList) {
            System.out.println(person);
        }
    }
}
