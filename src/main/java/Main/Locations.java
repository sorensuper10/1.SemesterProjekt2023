package Main;

import java.util.ArrayList;

public class Locations {

    private int locationID;

    private String Address;

    private ArrayList<Locations> locationTabel = new ArrayList<Locations>();

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
