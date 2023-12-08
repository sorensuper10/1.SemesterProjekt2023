package com.example.semesterprojekt2023;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("trackandtrace.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("Track 'n' Trace");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        DbSql db = new DbSql();

        Scanner input = new Scanner(System.in);

        ArrayList<Customer> costumerTabel = new ArrayList<Customer>();
        ArrayList<Company> companyTabel = new ArrayList<Company>();
        ArrayList<Locations> locationTabel = new ArrayList<Locations>();
        ArrayList<Package> packageTabel = new ArrayList<Package>();
        ArrayList<TransportationInfo> transportationInfoTabel = new ArrayList<TransportationInfo>();

        Customer c1 = new Customer(1, "Søren", "Hansen", "Æblevej 2", "4700", "12345678", "sorenhansen@gmail.com");
        costumerTabel.add(c1);

        Customer c2 = new Customer(2, "Morten", "Andersen", "Melonvej 4", "4700", "87654321", "mortenandersen@gmail.com");
        costumerTabel.add(c2);

        Customer c3 = new Customer(3, "Diaco", "Sabir", "Østerbro 6", "5000", "11211211", "diaco747@gmail.com");
        costumerTabel.add(c3);

        Package p1 = new Package(1, 20.5, 20.5, "Dao", "Søren", "Meny Næstved", true, true);
        packageTabel.add(p1);

        Package p2 = new Package(2, 10.5, 10.5, "GLS", "Morten", "Min købmand Næstved", false, false);
        packageTabel.add(p2);

        Package p3 = new Package(3, 5.5, 5.5, "Postnord", "Diaco", "Brugsen Næstved", true, true);
        packageTabel.add(p3);

        Package p4 = new Package(4, 5, 5, "Dao", "Søren", "Meny Næstved", true, true);
        packageTabel.add(p4);

        Company co1 = new Company(1, "DAO", "Blommevej 8", "4700", "12345678", "dao@gmail.com", "1");
        companyTabel.add(co1);

        Company co2 = new Company(2, "Postnord", "Ringvejen", "5600", "96743672", "Postnord@live.dk", "2");
        companyTabel.add(co2);

        Company co3 = new Company(3, "GLS", "Præstøvej 4", "4700", "87654321", "gls@gmail.com", "3");
        companyTabel.add(co3);

        Locations l1 = new Locations(1, "Rødovre terminal");
        locationTabel.add(l1);

        Locations l2 = new Locations(2, "Fyn");
        locationTabel.add(l2);

        Locations l3 = new Locations(3, "Jylland");
        locationTabel.add(l3);

        TransportationInfo t1 = new TransportationInfo(1, 3, "Diaco hus", "Terminal");
        transportationInfoTabel.add(t1);

        TransportationInfo t2 = new TransportationInfo(2, 2, "Sørens hus", "Meny Næstved");
        transportationInfoTabel.add(t2);

        TransportationInfo t3 = new TransportationInfo(3, 3, "Mortens Hus", "Min Købmand Næstved");
        transportationInfoTabel.add(t3);

        System.out.println("1. Opret kunde");
        System.out.println("2  Opret pakke");
        System.out.println("3. Opret firma");
        System.out.println("4. Opret lokation");
        System.out.println("5. Opret transportinfo");
        System.out.println("6. Udskriv alle kunder");
        System.out.println("7. Udskriv alle pakker");
        System.out.println("8. Udskriv alle firmaer");
        System.out.println("9. Udskriv alle lokationer");
        System.out.println("10. Udskriv alle transportinfo");
        System.out.println("11. Søg på en bestemt kunde");
        System.out.println("12. Søg på en bestemt pakke");
        System.out.println("13. Søg på et bestemt firma");
        System.out.println("14 Slet kunde");
        System.out.println("15 Slet pakke");
        System.out.println("16 Slet firma");
        System.out.println("17 Ændre en kundes fornavn");
        System.out.println("18 Ændre en kundes efternavn");
        System.out.println("19 Ændre en kundes adresse");
        System.out.println("20 Ændre en kundes postnummer");
        System.out.println("21 Ændre en kundes telefonnummer");
        System.out.println("22 Ændre en kundes mail");
        System.out.println("23 GUI");
        System.out.println("24 Ændre en pakkes info");
        System.out.println("25 Ændre et firmas info");
        System.out.println("26 Opdatere en pakkes lokation");
        System.out.println("Indtast valg");
        System.out.println("Tast 0 for at lukke program");

        int valg = input.nextInt();
        switch (valg) {
            case 1:
                db.createCustomer(c1);
                System.out.println("Kunde er oprettet");
                break;
            case 2:
                db.createPackage(p1);
                System.out.println("Pakke er oprettet");
                break;
            case 3:
                db.createCompany(co1);
                System.out.println("Firma er oprettet");
                break;
            case 4:
                db.createLocation(l1);
                System.out.println("Lokation er oprettet");
                break;
            case 5:
                db.createTransportationInfo(t1);
                System.out.println("Transportinfo er oprettet");
                break;
            case 6:
                ArrayList<Customer> costumerList = db.udskrivAlleKunder();
                udskrivCustomer(costumerList);
                break;
            case 7:
                ArrayList<Package> packageList = db.udskrivAllePakker();
                udskrivPackages(packageList);
                break;
            case 8:
                ArrayList<Company> companyList = db.udskrivAlleFirmaer();
                udskrivCompany(companyList);
                break;
            case 9:
                ArrayList<Locations> locationList = db.udskrivAlleLokationer();
                udskrivLocation(locationList);
                break;
            case 10:
                ArrayList<TransportationInfo> transportInfoList = db.udskrivAlleTransportInfo();
                udskrivTransportInfo(transportInfoList);
                break;
            case 11:
                Customer c = db.soegenkunde(1);
                soegenkunde(c);
                break;
            case 12:
                Package p = db.soegenpakke(1);
                soegenpakke(p);
                break;
            case 13:
                Company co = db.soegetfirma(1);
                soegetfirma(co);
                break;
            case 14:
                db.removeCustomer(1);
                System.out.println("Kunden er slettet");
                break;
            case 15:
                db.removePackage(1);
                System.out.println("Pakken er slettet");
                break;
            case 16:
                db.removeCompany(1);
                System.out.println("Firmaet er slettet");
                break;
            case 17:
                db.changeCustomerName();
                System.out.println("Kundens navn er ændret");
                break;
            case 18:
                db.changeCustomerLastName();
                System.out.println("Kundens efternavn er ændret");
                break;
            case 19:
                db.changeCustomerAdress();
                System.out.println("Kundens adresse er ændret");
                break;
            case 20:
                db.changeCustomerPostalcode();
                System.out.println("Kundens postnummer er ændret");
                break;
            case 21:
                db.changeCustomerPhone();
                System.out.println("Kundens telefonnummer er ændret");
                break;
            case 22:
                db.changeCustomerMail();
                System.out.println("Kundens mail er ændret");
                break;
            case 23:
                launch();
            case 0:
                System.exit(0);
                break;
        }

    }

    public static void udskrivCustomer(ArrayList<Customer> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).getCostumerID());
            System.out.println(a.get(i).getCostumerName());
            System.out.println(a.get(i).getCostumerLastName());
            System.out.println(a.get(i).getCostumerAddress());
            System.out.println(a.get(i).getCostumerPostalcode());
            System.out.println(a.get(i).getCostumerPhone());
            System.out.println(a.get(i).getCostumerMail());
        }
    }

    public static void udskrivCompany(ArrayList<Company> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).getCompanyID());
            System.out.println(a.get(i).getCompanyName());
            System.out.println(a.get(i).getCompanyAddress());
            System.out.println(a.get(i).getCompanyPostalCode());
            System.out.println(a.get(i).getCompanyPhone());
            System.out.println(a.get(i).getCompanyMail());
            System.out.println(a.get(i).getCompanyCVR());
        }
    }

    public static void udskrivPackages(ArrayList<Package> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).getPackageID());
            System.out.println(a.get(i).getSize());
            System.out.println(a.get(i).getWeight());
            System.out.println(a.get(i).getSender());
            System.out.println(a.get(i).getReciever());
            System.out.println(a.get(i).getFinalDestination());
            System.out.println(a.get(i).isSent());
            System.out.println(a.get(i).isArrived());
        }
    }

    public static void udskrivLocation(ArrayList<Locations> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).getLocationID());
            System.out.println(a.get(i).getAddress());
        }
    }

    public static void udskrivTransportInfo(ArrayList<TransportationInfo> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i).getId());
            System.out.println(a.get(i).getPackageID());
            System.out.println(a.get(i).getDestination());
            System.out.println(a.get(i).isCurrentLocation());
        }
    }

    public static void soegenkunde(Customer c) {
        System.out.println(c.getCostumerID());
        System.out.println(c.getCostumerName());
        System.out.println(c.getCostumerLastName());
        System.out.println(c.getCostumerAddress());
        System.out.println(c.getCostumerPostalcode());
        System.out.println(c.getCostumerPhone());
        System.out.println(c.getCostumerMail());
    }
    public static void soegenpakke(Package p){
        System.out.println(p.getPackageID());
        System.out.println(p.getSize());
        System.out.println(p.getWeight());
        System.out.println(p.getSender());
        System.out.println(p.getReciever());
        System.out.println(p.getFinalDestination());
        System.out.println(p.isSent());
        System.out.println(p.isArrived());
    }

    public static void soegetfirma(Company co){
        System.out.println(co.getCompanyID());
        System.out.println(co.getCompanyName());
        System.out.println(co.getCompanyAddress());
        System.out.println(co.getCompanyPostalCode());
        System.out.println(co.getCompanyPhone());
        System.out.println(co.getCompanyMail());
        System.out.println(co.getCompanyCVR());
    }
}