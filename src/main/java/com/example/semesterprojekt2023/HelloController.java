package com.example.semesterprojekt2023;

import Main.Company;
import Main.Customer;
import Main.DbSql;
import Main.Package;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label kundeCreated;

    @FXML
    private Label pakkeOprettet;

    @FXML
    private Label firmaOprettet;

    @FXML
    private TextField kundeID;

    @FXML
    private TextField fnavn;

    @FXML
    private TextField enavn;

    @FXML
    private TextField Adresse;

    @FXML
    private TextField postnr;

    @FXML
    private TextField telefon;

    @FXML
    private TextField mail;

    @FXML
    private TextField pakkeID;

    @FXML
    private TextField pakkeStørrelse;

    @FXML
    private TextField pakkeVægt;

    @FXML
    private TextField Sender;

    @FXML
    private TextField Modtager;

    @FXML
    private TextField Endestation;

    @FXML
    private TextField sendt;

    @FXML
    private TextField modtaget;

    @FXML
    private TextField companyID;

    @FXML
    private TextField companyName;

    @FXML
    private TextField companyAdress;

    @FXML
    private TextField companyPostalcode;

    @FXML
    private TextField companyPhone;

    @FXML
    private TextField companyMail;

    @FXML
    private TextField companyCVR;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onOpretKundeClick() {
        welcomeText.setText("Kunde er oprettet");
    }

    @FXML
    protected void onOpretKundeClickIOpretKunde() {
        Customer c = new Customer();
        DbSql db = new DbSql();
        String kundeIDText = kundeID.getText();
        String fnavnText = fnavn.getText();
        String enavnText = enavn.getText();
        String adresseText = Adresse.getText();
        String postnrText = postnr.getText();
        String telefonText = telefon.getText();
        String mailText = mail.getText();
        int kundeID = Integer.parseInt(kundeIDText);
        c.setCostumerID(kundeID);
        c.setCostumerName(fnavnText);
        c.setCostumerLastName(enavnText);
        c.setCostumerAddress(adresseText);
        c.setCostumerPostalcode(postnrText);
        c.setCostumerPhone(telefonText);
        c.setCostumerMail(mailText);
        db.createCustomer(c);
        kundeCreated.setText("Kunde er oprettet");
    }

    @FXML
    protected void onOpretPakkeClickIOpretPakke() {
        Package p = new Package();
        DbSql db = new DbSql();
        String pakkeIDText = pakkeID.getText();
        double pakkeStørrelseText = pakkeStørrelse.getHeight();
        double pakkeVægtText = pakkeVægt.getHeight();
        String SenderText = Sender.getText();
        String ModtagerText = Modtager.getText();
        String endeStationText = Endestation.getText();
        int pakkeID = Integer.parseInt(pakkeIDText);
        p.setPackageID(pakkeID);
        p.setSize(pakkeStørrelseText);
        p.setWeight(pakkeVægtText);
        p.setSender(SenderText);
        p.setReciever(ModtagerText);
        p.setFinalDestination(endeStationText);
        db.createPackage(p);
        pakkeOprettet.setText("Pakke er oprettet");
    }

    @FXML
    protected void onOpretFirmaClickIOpretFirma() {
        Company co = new Company();
        DbSql db = new DbSql();
        String companyIDText = companyID.getText();
        String companyNameText = companyName.getText();
        String companyAdressText = companyAdress.getText();
        String companyPostalcodeText = companyPostalcode.getText();
        String companyPhoneText = companyPhone.getText();
        String companyMailText = companyMail.getText();
        String companyCVRText = companyCVR.getText();
        int companyID = Integer.parseInt(companyIDText);
        co.setCompanyID(companyID);
        co.setCompanyName(companyNameText);
        co.setCompanyAddress(companyAdressText);
        co.setCompanyPostalCode(companyPostalcodeText);
        co.setCompanyPhone(companyPhoneText);
        co.setCompanyMail(companyMailText);
        co.setCompanyCVR(companyCVRText);
        db.createCompany(co);
        firmaOprettet.setText("Firma er oprettet");
    }
}