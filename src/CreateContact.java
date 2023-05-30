package com.streams;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreateContact {
    /**
     *
     * @author Aditya
     *
     */


        /**
         * This is main method of program
         * @param args
         * @throws IOException
         */

        public static void main(String[] args)throws IOException {

            System.out.println("Welcome to Address Book Program");

            Scanner sc = new Scanner(System.in);

            /*
             *  To create buffered reader
             */
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

            /*
             * To create address book  by using array list data collection
             * with person parameter(UC1)
             */
            ArrayList<Person2> addressBook1 = new ArrayList<Person2>();

            /*
             * To declare choice
             */
            int choice;

            /*
             * Here we are solving to use cases by using do while loop
             * we can add data in address book one time(as mentioned in UC2) and can add
             * data multiple time as mentioned in UC5
             */
            do {
                System.out.println("1 TO INSERT PERSON DATA");
                System.out.println("0 To Exit");
                choice = sc.nextInt();

                switch(choice) {
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
                        String email =sc.next();

                        /*
                         * To add all information we are taken from user with creating new person object
                         * every time we add data
                         */
                        addressBook1.add(new Person2(firstName, lastName,address,city,state,zip,phoneNumber,email));
                        break;
                    case 0:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid choice");

                }
            }while(choice!=0);

            System.out.println(addressBook1);
        }
    }


