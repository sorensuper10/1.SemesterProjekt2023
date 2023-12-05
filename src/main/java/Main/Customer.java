package Main;

import java.util.ArrayList;

public class Customer {
    private int costumerID;
    private String costumerName, costumerLastName, costumerAddress, costumerPostalcode, costumerPhone, costumerMail;

    private ArrayList<Customer> customerTabel = new ArrayList<Customer>();
    public Customer() {
    }

    public Customer(int costumerID, String costumerName, String costumerLastName, String costumerAddress, String costumerPostalcode, String costumerPhone, String costumerMail) {
        this.costumerID = costumerID;
        this.costumerName = costumerName;
        this.costumerLastName = costumerLastName;
        this.costumerAddress = costumerAddress;
        this.costumerPostalcode = costumerPostalcode;
        this.costumerPhone = costumerPhone;
        this.costumerMail = costumerMail;
    }

    public int getCostumerID() {
        return costumerID;
    }

    public void setCostumerID(int costumerID) {
        this.costumerID = costumerID;
    }

    public String getCostumerName() {
        return costumerName;
    }

    public void setCostumerName(String costumerName) {
        this.costumerName = costumerName;
    }

    public String getCostumerLastName() {
        return costumerLastName;
    }

    public void setCostumerLastName(String costumerLastName) {
        this.costumerLastName = costumerLastName;
    }

    public String getCostumerAddress() {
        return costumerAddress;
    }

    public void setCostumerAddress(String costumerAddress) {
        this.costumerAddress = costumerAddress;
    }

    public String getCostumerPostalcode() {
        return costumerPostalcode;
    }

    public void setCostumerPostalcode(String costumerPostalcode) {
        this.costumerPostalcode = costumerPostalcode;
    }

    public String getCostumerPhone() {
        return costumerPhone;
    }

    public void setCostumerPhone(String costumerPhone) {
        this.costumerPhone = costumerPhone;
    }

    public String getCostumerMail() {
        return costumerMail;
    }

    public void setCostumerMail(String costumerMail) {
        this.costumerMail = costumerMail;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "costumerID=" + costumerID +
                ", costumerName='" + costumerName + '\'' +
                ", costumerLastName='" + costumerLastName + '\'' +
                ", costumerAddress='" + costumerAddress + '\'' +
                ", costumerPostalcode='" + costumerPostalcode + '\'' +
                ", costumerPhone='" + costumerPhone + '\'' +
                ", costumerMail='" + costumerMail + '\'' +
                '}';
    }
}
