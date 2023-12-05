package Main;

import java.util.ArrayList;

public class Company {

    private int CompanyID;

    private String companyName;

    private String companyAddress;

    private String companyPostalCode;

    private String companyPhone;

    private String companyMail;

    private String companyCVR;

    private ArrayList<Company> companyTabel = new ArrayList<Company>();

    public Company() {
    }

    public Company(int companyID, String companyName, String companyAdress, String companyPostalCode, String companyPhone, String companyMail, String companyCVR) {
        CompanyID = companyID;
        this.companyName = companyName;
        this.companyAddress = companyAdress;
        this.companyPostalCode = companyPostalCode;
        this.companyPhone = companyPhone;
        this.companyMail = companyMail;
        this.companyCVR = companyCVR;
    }

    public int getCompanyID() {
        return CompanyID;
    }

    public void setCompanyID(int companyID) {
        CompanyID = companyID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyPostalCode() {
        return companyPostalCode;
    }

    public void setCompanyPostalCode(String companyPostalCode) {
        this.companyPostalCode = companyPostalCode;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public String getCompanyMail() {
        return companyMail;
    }

    public void setCompanyMail(String companyMail) {
        this.companyMail = companyMail;
    }

    public String getCompanyCVR() {
        return companyCVR;
    }

    public void setCompanyCVR(String companyCVR) {
        this.companyCVR = companyCVR;
    }

    @Override
    public String toString() {
        return "Company{" +
                "CompanyID=" + CompanyID +
                ", companyName='" + companyName + '\'' +
                ", companyAdress='" + companyAddress + '\'' +
                ", companyPostalCode='" + companyPostalCode + '\'' +
                ", companyPhone='" + companyPhone + '\'' +
                ", companyMail='" + companyMail + '\'' +
                ", companyCVR='" + companyCVR + '\'' +
                '}';
    }
}
