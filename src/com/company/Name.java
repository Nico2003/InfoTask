package com.company;

/**
 * Created by Koljan on 2016.04.06..
 */
public class Name  {

    private String name;
    private String lastName;
    private String middleName;

    public Name() {
    }

    public Name(String name, String lastName, String middleName) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return"name: " + name + "\n" + "lastName: " + lastName + "\n" + "middleName: " + middleName + "\n";
    }
}

