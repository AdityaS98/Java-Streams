package com.streams;

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class MultiplePersons {

    /*
     * To create scanner and bufferred reader objects for taking objects
     */
    Scanner sc = new Scanner(System.in);

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
    /*
     * To create multiple address books
     */
    ArrayList<Person2> addressBook1 = new ArrayList<Person2>();

    ArrayList<Person2> addressBook2 = new ArrayList<Person2>();

    ArrayList<Person2> addressBook3 = new ArrayList<Person2>();

    int choice;
		do
        {
        System.out.println("1 TO ADD DATA IN ADDRESSBOOK1");

        System.out.println("2 TO ADD DATA IN ADDRESSBOOK2");

        System.out.println("3 TO ADD DATA IN ADDRESSBOOK3");

        System.out.println("4 TO FIND DATA IN ALL BOOKS");

        System.out.println("0 TO EXIT");

        choice = sc.nextInt();

        switch (choice) {

            case 1:
                /*
                 * To take data of person to add in address book
                 */
                System.out.println("Enter first name");
                String firstName = sc.next();
                System.out.println("Enter last name");
                String lastName = sc.next();
                System.out.println("Enter address");
                String address = sc.next();
                System.out.println("Enter city");
                String city = br.readLine();
                System.out.println("Enter state");
                String state = br.readLine();
                System.out.println("Enter zip");
                int zip = br.read();
                System.out.println("Enter phone number");
                String phoneNumber = sc.next();
                System.out.println("Enter email");
                String email = sc.next();

                /*
                 * To add all information we are taken from user with creating new person object
                 * every time we add data
                 */
                addressBook1.add(new Person2(firstName, lastName, address, city, state, zip, phoneNumber, email));
                break;
            case 2:
                /*
                 * To take data of person to add in address book
                 */
                System.out.println("Enter first name");
                String firstName1 = sc.next();
                System.out.println("Enter last name");
                String lastName1 = sc.next();
                System.out.println("Enter address");
                String address1 = sc.next();
                System.out.println("Enter city");
                String city1 = br.readLine();
                System.out.println("Enter state");
                String state1 = br.readLine();
                System.out.println("Enter zip");
                int zip1 = br.read();
                System.out.println("Enter phone number");
                String phoneNumber1 = sc.next();
                System.out.println("Enter email");
                String email1 = sc.next();

                /*
                 * To add all information we are taken from user with creating new person object
                 * every time we add data
                 */
                addressBook2
                        .add(new Person2(firstName1, lastName1, address1, city1, state1, zip1, phoneNumber1, email1));
                break;
            case 3:
                /*
                 * To take data of person to add in address book
                 */
                System.out.println("Enter first name");
                String firstName2 = sc.next();
                System.out.println("Enter last name");
                String lastName2 = sc.next();
                System.out.println("Enter address");
                String address2 = sc.next();
                System.out.println("Enter city");
                String city2 = br.readLine();
                System.out.println("Enter state");
                String state2 = br.readLine();
                System.out.println("Enter zip");
                int zip2 = br.read();
                System.out.println("Enter phone number");
                String phoneNumber2 = sc.next();
                System.out.println("Enter email");
                String email2 = sc.next();

                /*
                 * To add all information we are taken from user with creating new person object
                 * every time we add data
                 */
                addressBook3
                        .add(new Person2(firstName2, lastName2, address2, city2, state2, zip2, phoneNumber2, email2));
                break;
            case 4:
                /*
                 * To search the person in three address books
                 */
                System.out.println("Enter name to search");
                String name = sc.next();
                boolean status = false;

                for (int i = 0; i < addressBook1.size(); i++) {
                    if (addressBook1.get(i).getFirstName().equals(name)) {
                        System.out.println("Person found in first address book");
                        status = true;
                        break;
                    }
                }
                for (int i = 0; i < addressBook2.size(); i++) {
                    if (addressBook2.get(i).getFirstName().equals(name)) {
                        System.out.println("Person found in second address book");
                        status = true;
                    }
                    break;
                }
                for (int i = 0; i < addressBook3.size(); i++) {
                    if (addressBook3.get(i).getFirstName().equals(name)) {
                        System.out.println("Person found in third address book");
                        status = true;
                    }
                    break;
                }
                if (!status)
                    System.out.println("Person not found in any address book");

                break;
            case 0:
                System.out.println("Exited");
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
        while(choice !=0);
}



}
