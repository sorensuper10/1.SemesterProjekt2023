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
        Scene scene = new Scene(fxmlLoader.load(), 300, 400);
        stage.setTitle("Track and Trace");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        DbSql db = new DbSql();

        boolean exit = false;
        Scanner input = new Scanner(System.in);

        ArrayList<Customer> costumerTabel = new ArrayList<Customer>();
        ArrayList<Package> packageTabel = new ArrayList<Package>();
        ArrayList<Company> companyTabel = new ArrayList<Company>();
        ArrayList<Locations> locationTabel = new ArrayList<Locations>();
        ArrayList<Sender> senderTabel = new ArrayList<Sender>();

        Customer c1 = new Customer(1, "Søren", "Hansen", "Æblevej 2", "4700", "12345678", "sorenhansen@gmail.com");
        costumerTabel.add(c1);

        Package p1 = new Package(1, 70.5, 70.5, 1, 1, "7/11 Næstved", true, true, false,1);
        packageTabel.add(p1);

        Package p2 = new Package(2, 30.5, 30.5, 1, 1, "Meny Næstved", true, true, false,1);
        packageTabel.add(p2);

        Company co1 = new Company(1, "Dao", "Blommevej 8", "4700", "87654321", "dao@gmail.com", "1");
        companyTabel.add(co1);

        Locations l1 = new Locations(1, "Rødovre terminal");
        locationTabel.add(l1);

        Sender s1 = new Sender(1,"Coolshop","Æblevej 2", "4700","12345678","coolshop@gmail.com","1");
        senderTabel.add(s1);

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
        System.out.println("14. Slet kunde");
        System.out.println("15. Slet pakke");
        System.out.println("16. Slet firma");
        System.out.println("17. Ændre en kundes fornavn");
        System.out.println("18. Ændre en kundes efternavn");
        System.out.println("19. Ændre en kundes adresse");
        System.out.println("20. Ændre en kundes postnummer");
        System.out.println("21. Ændre en kundes telefonnummer");
        System.out.println("22. Ændre en kundes mail");
        System.out.println("23. Udskriv en kundes pakker");
        System.out.println("24. Udskriv en firmas pakker");
        System.out.println("25. GUI");
        System.out.println("Indtast valg");
        System.out.println("Tast 0 for at lukke program");

        while (!exit) {
            int valg = input.nextInt();

            switch (valg) {
                case 1:
                    db.createCustomer(c1);
                    System.out.println("Kunde er oprettet");
                    break;
                case 2:
                    db.createPackage(p2);
                    System.out.println("Pakke er oprettet");
                    break;
                case 3:
                    db.createTransportationfirm(co1);
                    System.out.println("Firma er oprettet");
                    break;
                case 4:
                    db.createLocation(l1);
                    System.out.println("Lokation er oprettet");
                    break;
                case 5:
                    db.createSender(s1);
                    System.out.println("Sender er oprettet");
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
                    ArrayList<Package> kundePakker = db.kundePakker(1);
                    udskrivPackages(kundePakker);
                    break;
                case 24:
                    ArrayList<Package> firmaPakker = db.firmaPakker(1);
                    udskrivPackages(firmaPakker);
                    break;
                case 25:
                    launch();
                    break;
                default:
                    System.out.println("Ukendt kommando");
                    System.out.println("Prøv igen");
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
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
            System.out.println(a.get(i).getSender1());
            System.out.println(a.get(i).getReciever1());
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
            System.out.println(a.get(i).getCurrentLocation());
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
        System.out.println(p.getSender1());
        System.out.println(p.getReciever1());
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