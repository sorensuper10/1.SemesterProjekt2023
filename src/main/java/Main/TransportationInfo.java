package Main;

import java.util.ArrayList;

public class TransportationInfo {
    private int id;
    private int packageID;
    private String destination;
    private boolean arrived;

    private ArrayList<TransportationInfo> transportationInfoTabel = new ArrayList<TransportationInfo>();

    public TransportationInfo() {
    }

    public TransportationInfo(int id, int packageID, String destination, boolean arrived) {
        this.id = id;
        this.packageID = packageID;
        this.destination = destination;
        this.arrived = arrived;
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

    public boolean isArrived() {
        return arrived;
    }

    public void setArrived(boolean arrived) {
        this.arrived = arrived;
    }

    @Override
    public String toString() {
        return "TransportationInfo{" +
                "id=" + id +
                ", packageID=" + packageID +
                ", destination='" + destination + '\'' +
                ", arrived=" + arrived +
                '}';
    }
}
