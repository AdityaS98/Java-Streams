package com.streams;

import java.util.*;
import java.util.stream.Collectors;


    class Person2 {
        private String name;
        private String city;
        private String state;

        public Person2(String name, String city, String state) {
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
public class SearchMultipleContacts {
    public static void main(String[] args) {
        List<Person2> persons = new ArrayList<>();
        persons.add(new Person2("John Doe", "New York City", "New York"));
        persons.add(new Person2("Jane Smith", "Los Angeles", "California"));
        persons.add(new Person2("Michael Johnson", "New York City", "New York"));
        persons.add(new Person2("Emily Brown", "Chicago", "Illinois"));

        // Create city-person count map
        Map<String, Long> cityCountMap = persons.stream()
                .collect(Collectors.groupingBy(Person2::getCity, Collectors.counting()));

        // Create state-person count map
        Map<String, Long> stateCountMap = persons.stream()
                .collect(Collectors.groupingBy(Person2::getState, Collectors.counting()));

        String cityToCount = "New York City";
        long cityCount = cityCountMap.getOrDefault(cityToCount, 0L);
        System.out.println("Count of persons in " + cityToCount + ": " + cityCount);

        String stateToCount = "California";
        long stateCount = stateCountMap.getOrDefault(stateToCount, 0L);
        System.out.println("Count of persons in " + stateToCount + ": " + stateCount);
    }
}