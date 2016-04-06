package com.company;

/**
 * Created by Koljan on 2016.04.06..
 */
public class Address {

    private String country;
    private String town;
    private String street;
    private int streetNumber;
    private int postIdex;

    public Address() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public int getPostIdex() {
        return postIdex;
    }

    public void setPostIdex(int postIdex) {
        this.postIdex = postIdex;
    }
}

