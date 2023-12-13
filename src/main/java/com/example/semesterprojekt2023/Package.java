package com.example.semesterprojekt2023;

public class Package {
    private int packageID;
    private double size;
    private double weight;
    private String sender;
    private String reciever;
    private int sender1;
    private int reciever1;
    private String finalDestination;
    private boolean sent;
    private boolean arrived;

    public Package() {
    }

    public Package(int packageID, double size, double weight, int sender, int reciever, String finalDestination, boolean sent, boolean arrived) {
        this.packageID = packageID;
        this.size = size;
        this.weight = weight;
        this.sender1 = sender;
        this.reciever1 = reciever;
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

    public int getSender1() {
        return sender1;
    }

    public void setSender1(int sender1) {
        this.sender1 = sender1;
    }

    public int getReciever1() {
        return reciever1;
    }

    public void setReciever1(int reciever1) {
        this.reciever1 = reciever1;
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
                ", sender='" + sender1 + '\'' +
                ", reciever='" + reciever1 + '\'' +
                ", finalDestination='" + finalDestination + '\'' +
                ", sent=" + sent +
                ", arrived=" + arrived +
                '}';
    }
}
