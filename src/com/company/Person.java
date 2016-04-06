package com.company;

/**
 * Created by Koljan on 2016.04.06..
 */
public class Person  extends Name{

    private String name;
    private String address;
    private int personalCodepart1;
    private int personalCodepart2;
    private char slash = '-';

    public Person() {
    }

    public Person( String name1, String name, String lastName, String middleName, int personalCodepart1, char slash, int personalCodepart2) {
        super(name, lastName, middleName);
        this.name = name1;
        this.personalCodepart1 = personalCodepart1;
        this.slash = slash;
        this.personalCodepart2 = personalCodepart2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.name +  super.toString() + "Personal code: " + this.personalCodepart1 + " " + this.slash + " " + this.personalCodepart2;
    }
}
