package com.example.semesterprojekt2023;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
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
    private Label kundeSlettet;

    @FXML
    private Label pakkeSlettet;

    @FXML
    private Label firmaSlettet;

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
    private TextField sentText;

    @FXML
    private TextField arrivedText;

    @FXML
    private CheckBox sent;

    @FXML
    private CheckBox delivered;

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
        String x = pakkeStørrelse.getText();
        double pakkeStørrelseText = Double.parseDouble(x);
        String y = pakkeVægt.getText();
        double pakkeVægtText = Double.parseDouble(y);
        String SenderText = Sender.getText();
        String ModtagerText = Modtager.getText();
        String endeStationText = Endestation.getText();
        int pakkeID = Integer.parseInt(pakkeIDText);
        boolean oksent = false;
        if (sent.isSelected())
            oksent = true;
        boolean okdelivered = false;
        if (delivered.isSelected())
            okdelivered = true;
        p.setPackageID(pakkeID);
        p.setSize(pakkeStørrelseText);
        p.setWeight(pakkeVægtText);
        p.setSender(SenderText);
        p.setReciever(ModtagerText);
        p.setFinalDestination(endeStationText);
        p.setSent(oksent);
        p.setArrived(okdelivered);
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

    @FXML
    protected void onSletKundeClick() {
        DbSql db = new DbSql();
        String kundeIDText = kundeID.getText();
        int kundeID = Integer.parseInt(kundeIDText);
        db.removeCustomer(kundeID);
        kundeSlettet.setText("Kunden er slettet");
    }

    @FXML
    protected void onSletPakkeClick() {
        DbSql db = new DbSql();
        String pakkeIDText = pakkeID.getText();
        int pakkeID = Integer.parseInt(pakkeIDText);
        db.removePackage(pakkeID);
        pakkeSlettet.setText("Pakken er slettet");
    }

    @FXML
    protected void onSletFirmaClick() {
        DbSql db = new DbSql();
        String firmaIDText = companyID.getText();
        int firmaID = Integer.parseInt(firmaIDText);
        db.removeCompany(firmaID);
        firmaSlettet.setText("Firmaet er slettet");
    }

    @FXML
    protected void onSoegKundeClick() {
        Customer c;
        DbSql db = new DbSql();
        String kundeIDText = kundeID.getText();
        int kundeID = Integer.parseInt(kundeIDText);
        c = db.soegenkunde(kundeID);
        fnavn.setText(c.getCostumerName());
        enavn.setText(c.getCostumerLastName());
        Adresse.setText(c.getCostumerAddress());
        postnr.setText(c.getCostumerPostalcode());
        telefon.setText(c.getCostumerPhone());
        mail.setText(c.getCostumerMail());
    }

    @FXML
    protected void onSoegPakkeClick() {
        Package p;
        DbSql db = new DbSql();
        String pakkeIDText = pakkeID.getText();
        int pakkeID = Integer.parseInt(pakkeIDText);
        p = db.soegenpakke(pakkeID);
        String ps = String.valueOf(p.getSize());
        pakkeStørrelse.setText(ps);
        String pv = String.valueOf(p.getWeight());
        pakkeVægt.setText(pv);
        Sender.setText(p.getSender());
        Modtager.setText(p.getReciever());
        Endestation.setText(p.getFinalDestination());
        if (p.isSent())
            sentText.setText("Yes");
        else
            sentText.setText("No");
        if (p.isArrived())
            arrivedText.setText("Yes");
        else
            arrivedText.setText("No");
    }

    @FXML
    protected void onSoegCompanyClick() {
        Company co;
        DbSql db = new DbSql();
        String companyIDText = companyID.getText();
        int firmaID = Integer.parseInt(companyIDText);
        co = db.soegetfirma(firmaID);
        companyName.setText(co.getCompanyName());
        companyAdress.setText(co.getCompanyAddress());
        companyPostalcode.setText(co.getCompanyPostalCode());
        companyPhone.setText(co.getCompanyPhone());
        companyMail.setText(co.getCompanyMail());
        companyCVR.setText(co.getCompanyCVR());
    }
}