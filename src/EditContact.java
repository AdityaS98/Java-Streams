package com.streams;

import java.util.*;

import java.io.*;

public class EditContact {
    /*
     * To declare characteristics of person class
     */

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private int zip;
    private String phoneNumber;
    private String email;

    /*
     * To define constructor of person behaviours
     */

    void Person(String firstName, String lastName, String address, String city, int zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }

    /*
     * To define get method for all private behavior of person class
     */

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public int getZip() {
        return zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
                + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
    }

}
/*
 * This is main class of this program
 */

public class AddressBook {
    /**
     * This is starting point of this java program and main function
     *
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {

        /*
         * To declare array list for address book
         */

        ArrayList<Person2> addressBook = new ArrayList<Person2>();

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);


        int choice;

        /*
         * Do While loop to give options to user
         */

        do {
            /*
             * To print options for action
             */

            System.out.println("1.ADD CONTACT");
            System.out.println("2.UPDATE CONTACT");
            choice = sc.nextInt();

            /*
             * Switch case for different options
             */
            switch (choice) {

                /*
                 * To add new contact for new person
                 */

                case 1:
                    System.out.println("Enter First name");
                    String firstName = br.readLine();

                    System.out.println("Enter Last name");
                    String lastName = br.readLine();

                    System.out.println("Enter Address");
                    String address = br.readLine();

                    System.out.println("Enter City");
                    String city = br.readLine();

                    System.out.println("Enter zip");
                    int zip = sc.nextInt();

                    System.out.println("Enter Phone Number");
                    String phoneNumber = br.readLine();

                    System.out.println("Enter Email");
                    String email =br.readLine();

                    addressBook.add(new Person2(firstName, lastName, address, city, zip, phoneNumber, email));

                    break;
                case 2:

                    /*
                     * To update existing information
                     */
                    boolean found = false;
                    System.out.println("Enter name to update");
                    lastName = sc.next();

                    ListIterator<Person2> li = addressBook.listIterator();
                    while (li.hasNext()) {
                        Person2 p = li.next();
                        if (p.getLastName().equals(lastName)) {

                            System.out.println("Enter new first name");
                            firstName = br.readLine();

                            System.out.println("Enter new Address");
                            address =br.readLine();

                            System.out.println("Enter new City");
                            city = br.readLine();

                            System.out.println("Enter new zip");
                            zip = sc.nextInt();

                            System.out.println("Enter new Phone Number");
                            phoneNumber = br.readLine();

                            System.out.println("Enter new Email");
                            email = br.readLine();

                            li.set(new Person2(firstName, lastName, address, city, zip, phoneNumber, email));
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record not found");
                    } else {
                        System.out.println("Record updated successfully");
                    }
                    break;
            }
        } while (choice != 0);
        System.out.println(addressBook);
    }
}