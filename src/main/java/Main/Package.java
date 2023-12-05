package Main;

import java.util.ArrayList;

public class Package {
private int packageID;
private double size;
private double weight;
private String sender;
private String reciever;
private String finalDestination;
private boolean sent;
private boolean arrived;

    private ArrayList<Package> packageTabel = new ArrayList<Package>();

    public Package() {
    }

    public Package(int packageID, double size, double weight, String sender, String reciever, String finalDestination, boolean sent, boolean arrived) {
        this.packageID = packageID;
        this.size = size;
        this.weight = weight;
        this.sender = sender;
        this.reciever = reciever;
        this.finalDestination = finalDestination;
        this.sent = sent;
        this.arrived = arrived;
    }

    public int getPackageID() {
        return packageID;
    }

    public void setPackageID(int packageID) {
        this.packageID = packageID;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReciever() {
        return reciever;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public void setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }

    public boolean isArrived() {
        return arrived;
    }

    public void setArrived(boolean arrived) {
        this.arrived = arrived;
    }

    @Override
    public String toString() {
        return "Package{" +
                "packageID=" + packageID +
                ", size=" + size +
                ", weight=" + weight +
                ", sender='" + sender + '\'' +
                ", reciever='" + reciever + '\'' +
                ", finalDestination='" + finalDestination + '\'' +
                ", sent=" + sent +
                ", arrived=" + arrived +
                '}';
    }
}
