package com.example.semesterprojekt2023;

import java.util.ArrayList;

public class Locations {

    private int locationID;

    private String Address;

    public Locations() {
    }

    public Locations(int locationID, String address) {
        this.locationID = locationID;
        Address = address;
    }

    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Locations{" +
                "locationID=" + locationID +
                ", Address='" + Address + '\'' +
                '}';
    }
}
