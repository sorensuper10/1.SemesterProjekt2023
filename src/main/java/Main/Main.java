package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
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

        Company co1 = new Company(1, "DAO", "Blommevej 8", "4700", "12345678", "dao@gmail.com", "1");
        companyTabel.add(co1);

        Company co2 = new Company(2, "Postnord", "Ringvejen", "5600", "96743672", "Postnord@live.dk", "2");
        companyTabel.add(co2);

        Company co3 = new Company(3, "GLS", "Præstøvej 4", "4700", "87654321", "gls@gmail.com", "3");
        companyTabel.add(co3);

        Package p1 = new Package(1, 20.5, 20.5, "Dao", "Søren", "Meny Næstved", true, true);
        packageTabel.add(p1);

        Package p2 = new Package(2, 10.5, 10.5, "GLS", "Morten", "Min købmand Næstved", false, false);
        packageTabel.add(p2);

        Package p3 = new Package(3, 5.5, 5.5, "Postnord", "Diaco", "Brugsen Næstved", true, true);
        packageTabel.add(p3);

        Package p4 = new Package(4,5,5,"Dao","Søren","Meny Næstved",true,true);

        Locations l1 = new Locations(1, "Rødovre terminal");
        locationTabel.add(l1);

        Locations l2 = new Locations(2, "Fyn");
        locationTabel.add(l2);

        Locations l3 = new Locations(3, "Jylland");
        locationTabel.add(l3);

        TransportationInfo t1 = new TransportationInfo(1, 3, "Diaco hus", true);
        transportationInfoTabel.add(t1);

        TransportationInfo t2 = new TransportationInfo(2, 2, "Sørens hus", true);
        transportationInfoTabel.add(t2);

        TransportationInfo t3 = new TransportationInfo(3, 3, "Mortens Hus", true);
        transportationInfoTabel.add(t3);

        System.out.println("1. Opret pakke");
        System.out.println("2 Opret kunde");
        System.out.println("3. Opret firma");
        System.out.println("4. Opret lokation");
        System.out.println("5. Opret transportinfo");
        System.out.println("6. Udskriv alle pakker");
        System.out.println("Indtast valg");
        System.out.println("Tast 0 for at lukke program");

        int valg = input.nextInt();
        switch(valg){
            case 1:
                db.createPackage(p2);
                break;
            case 2:
                db.createCustomer(c1);
                break;
            case 3:
                db.createCompany(co1);
                break;
            case 4:
                db.createLocation(l1);
                break;
            case 5:
                db.createTransportationInfo(t1);
                break;
            case 6:
                ArrayList <Package> packageList = db.udskrivPackages();
                udskrivPackages(packageList);
            case 0:
                System.exit(0);
        }


        //udskrivCustomer(costumerTabel);
        //udskrivCompany(companyTabel);
        //udskrivPackages(packageTabel);
        //udskrivLocation(locationTabel);
        //udskrivTransportInfo(transportationInfoTabel);
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
            System.out.println(a.get(i).isArrived());
        }
    }
}
