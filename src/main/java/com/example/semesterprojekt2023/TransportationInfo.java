package com.example.semesterprojekt2023;
public class TransportationInfo {
    private int id;
    private int packageID;
    private String destination;
    private String currentLocation;

    public TransportationInfo() {
    }

    public TransportationInfo(int id, int packageID, String destination, String currentLocation) {
        this.id = id;
        this.packageID = packageID;
        this.destination = destination;
        this.currentLocation = currentLocation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPackageID() {
        return packageID;
    }

    public void setPackageID(int packageID) {
        this.packageID = packageID;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }
    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public String toString() {
        return "TransportationInfo{" +
                "id=" + id +
                ", packageID=" + packageID +
                ", destination='" + destination + '\'' +
                ", arrived=" + currentLocation +
                '}';
    }
}
