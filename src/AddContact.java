package com.streams;

import java.util.*;

public class AddContact {

    public static ArrayList<Person2> toAddContact() {
        ArrayList<Person2> list = new ArrayList<Person2>();
        return list;
        /**
         * This is main method of program
         * @param args
         */
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter number of address book you want to add ");

            int number = sc.nextInt();

            ArrayList<ArrayList> addressbooks = new ArrayList<ArrayList>();

            /*
             * Creating address book and adding it to main book
             */
            for(int i=0;i<number;i++) {
                addressbooks.add(toAddContact());
            }
        }
    }


    }


