package com.company;

/**
 * Created by Koljan on 2016.04.06..
 */
public class Main {
    public static void main(String[] args) {

        Person person = new Person("Name: \n", "Janis ", "Berzins ", "John ", 200386, '-', 11586);
        System.out.println(person.toString());


        Person person1 = new Person();
        System.out.println();
        person1.setAddress("Address:");

        System.out.println(person1.getAddress());

        Address address = new Address();

        address.setCountry("Latvia");
        address.setTown("Riga");
        address.setStreet("Brivibas iela");
        address.setStreetNumber(55);
        address.setPostIdex(1021);

        System.out.println("Country:   " + address.getCountry());
        System.out.println("Town:      " + address.getTown());
        System.out.println("Street:    " + address.getStreet() + " " + address.getStreetNumber());
        System.out.println("Post code: "  + "LV - " + address.getPostIdex());


    }
}
