package Main;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DbSql {
    private Connection connection;
    private Statement stmt;
    private Statement stmt1;

    public DbSql() {
        connection = null;
        stmt = null;
        try {
            String url = "jdbc:sqlite:C://Databaser/TrackandTrace.db";
            connection = DriverManager.getConnection(url);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public ArrayList createPackage(Package p) {
        try {
            String sql = "insert into Package (packageID, packageSize, packageWeight, sender, reciever, finaldestination, sent, arrived)";
            sql += "values (" + String.valueOf(p.getPackageID()) + ",'" + p.getSize() + "','" + p.getWeight();
            sql += "','" + p.getSender() + "','" + p.getReciever() + "','" + p.getFinalDestination() + "',";
            sql += String.valueOf(p.isSent()) + "," + String.valueOf(p.isArrived()) + ")";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public ArrayList createCustomer(Customer c) {
        try {
            String sql = "insert into Customer (customerID, customerName, CustomerLastName, customerAdress, customerPostalCode, customerPhone, customerMail)";
            sql += "values (" + String.valueOf(c.getCostumerID()) + ",'" + c.getCostumerName() + "','" + c.getCostumerLastName();
            sql += "','" + c.getCostumerAddress() + "','" + c.getCostumerPostalcode() + "','" + c.getCostumerPhone() + "',";
            sql += "'" + (c.getCostumerMail()) + "'" + ")";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public ArrayList createCompany(Company co) {
        try {
            String sql = "insert into Company (companyID, companyName, companyAdress, companyPostalcode, companyPhone, companyMail, companyCVR)";
            sql += "values (" + String.valueOf(co.getCompanyID()) + ",'" + co.getCompanyName() + "','" + co.getCompanyAddress();
            sql += "','" + co.getCompanyPostalCode() + "','" + co.getCompanyPhone() + "','" + co.getCompanyMail() + "',";
            sql += "'" + (co.getCompanyCVR()) + "'" + ")";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public ArrayList createLocation(Locations l) {
        try {
            String sql = "insert into Location (locationID, Adress)";
            sql += "values (" + String.valueOf(l.getLocationID()) + ",'" + l.getAddress() + "'" + ")";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public ArrayList createTransportationInfo(TransportationInfo t) {
        try {
            String sql = "insert into Transportationinfo (ID, packageID, Destination, arrived)";
            sql += "values (" + String.valueOf(t.getId()) + ",'" + t.getPackageID() + "','" + t.getDestination() + "',";
            sql += String.valueOf(t.isCurrentLocation()) + ")";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public ArrayList udskrivAlleKunder() {
        ArrayList<Customer> costumerList = new ArrayList<>();
        try {
            String sql = "select * from Customer";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Customer c = new Customer();
                c.setCostumerID(rs.getInt("CostumerID"));
                c.setCostumerName(rs.getString("CostumerName"));
                c.setCostumerLastName(rs.getString("costumerLastName"));
                c.setCostumerAddress(rs.getString("Adress"));
                c.setCostumerPostalcode(rs.getString("Postal code"));
                c.setCostumerPhone(rs.getString("Phone"));
                c.setCostumerMail(rs.getString("Mail"));
                costumerList.add(c);
            }
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return costumerList;
    }

    public ArrayList udskrivAllePakker() {
        ArrayList<Package> packagelist = new ArrayList<>();
        try {
            String sql = "select * from Package";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Package p = new Package();
                p.setPackageID(rs.getInt("PackageID"));
                p.setSize(rs.getDouble("packageSize"));
                p.setWeight(rs.getDouble("packageWeight"));
                p.setSender(rs.getString("Sender"));
                p.setReciever(rs.getString("Reciever"));
                p.setFinalDestination(rs.getString("FinalDestination"));
                int x = rs.getInt("Sent");
                boolean b = x == 1;
                p.setSent(b);
                int x1 = rs.getInt("Arrived");
                b = x1 == 1;
                p.setArrived(b);
                packagelist.add(p);
            }
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return packagelist;
    }

    public ArrayList udskrivAlleFirmaer() {
        ArrayList<Company> companyList = new ArrayList<>();
        try {
            String sql = "select * from Company";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Company co = new Company();
                co.setCompanyID(rs.getInt("CompanyID"));
                co.setCompanyName(rs.getString("CompanyName"));
                co.setCompanyAddress(rs.getString("Adress"));
                co.setCompanyPostalCode(rs.getString("Postal Code"));
                co.setCompanyPhone(rs.getString("Company Phone"));
                co.setCompanyMail(rs.getString("Company Mail"));
                co.setCompanyCVR(rs.getString("CVR"));
                companyList.add(co);
            }
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return companyList;
    }

    public ArrayList udskrivAlleLokationer() {
        ArrayList<Locations> locationList = new ArrayList<>();
        try {
            String sql = "select * from Location";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Locations l = new Locations();
                l.setLocationID(rs.getInt("Location ID"));
                l.setAddress(rs.getString("Location Adress"));
                locationList.add(l);
            }
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return locationList;
    }

    public ArrayList udskrivAlleTransportInfo() {
        ArrayList<TransportationInfo> transportationInfoList = new ArrayList<>();
        try {
            String sql = "select * from Transportationinfo";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TransportationInfo t = new TransportationInfo();
                t.setId(rs.getInt("Transportationinfo ID"));
                t.setPackageID(rs.getInt("Package ID"));
                t.setDestination(rs.getString("Destination"));
                t.setCurrentLocation(rs.getString("Current Location"));
                transportationInfoList.add(t);
            }
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return transportationInfoList;
    }

    public Customer soegenkunde(int customerID) {
        Customer c = new Customer();
        c.setCostumerID(customerID);
        try {
            String sql = "select * from Customer where customerID =" + String.valueOf(customerID);
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                c.setCostumerID(rs.getInt("customerID"));
                c.setCostumerName(rs.getString("customerName"));
                c.setCostumerLastName(rs.getString("customerLastName"));
                c.setCostumerAddress(rs.getString("customerAdress"));
                c.setCostumerPostalcode(rs.getString("customerPostalcode"));
                c.setCostumerPhone(rs.getString("customerPhone"));
                c.setCostumerMail(rs.getString("customerMail"));
                return c;
            }
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public Package soegenpakke(int packageID) {
        Package p = new Package();
        p.setPackageID(packageID);
        try {
            String sql = "select * from Package where packageID =" + String.valueOf(packageID);
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                p.setPackageID(rs.getInt("packageID"));
                p.setSize(rs.getDouble("packageSize"));
                p.setWeight(rs.getDouble("packageWeight"));
                p.setSender(rs.getString("Sender"));
                p.setReciever(rs.getString("Reciever"));
                p.setFinalDestination(rs.getString("FinalDestination"));
                int x = rs.getInt("Sent");
                boolean b = x == 1;
                p.setSent(b);
                int x1 = rs.getInt("Arrived");
                b = x1 == 1;
                p.setArrived(b);
                return p;
            }
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public Company soegetfirma(int companyID) {
        Company co = new Company();
        co.setCompanyID(companyID);
        try {
            String sql = "select * from Company where companyID =" + String.valueOf(companyID);
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                co.setCompanyID(rs.getInt("companyID"));
                co.setCompanyName(rs.getString("companyName"));
                co.setCompanyAddress(rs.getString("companyAdress"));
                co.setCompanyPostalCode(rs.getString("companyPostalcode"));
                co.setCompanyPhone(rs.getString("companyPhone"));
                co.setCompanyMail(rs.getString("companyMail"));
                co.setCompanyCVR(rs.getString("companyCVR"));
                return co;
            }
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public void removeCustomer(int kundeID) {
        try {
            String sql = "delete from Customer where customerID =" + String.valueOf(kundeID);
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void removePackage(int pakkenr) {
        try {
            String sql = "delete from Package where packageID = " + String.valueOf(pakkenr);
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void removeCompany(int firmaID) {
        try {
            String sql = "delete from Company where companyID = " + String.valueOf(firmaID);
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void changeCustomerName() {
        try {
            System.out.println("Indtast customerID på den der skal opdateres ");
            int customerID;
            Scanner scan = new Scanner(System.in);
            customerID = scan.nextInt();
            String userFirstName;
            System.out.println("Indtast nyt navn ");
            userFirstName = scan.next();
            String sql = "UPDATE Customer SET customerName ='" + userFirstName + "' WHERE customerID=" + String.valueOf(customerID);
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void changeCustomerLastName() {
        try {
            System.out.println("Indtast customerID på den der skal opdateres ");
            int customerID;
            Scanner scan = new Scanner(System.in);
            customerID = scan.nextInt();
            String userLastName;
            System.out.println("Indtast nyt efternavn ");
            userLastName = scan.next();
            String sql = "UPDATE Customer SET customerLastName ='" + userLastName + "' WHERE customerID=" + String.valueOf(customerID);
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void changeCustomerAdress() {
        try {
            System.out.println("Indtast customerID på den der skal opdateres ");
            int customerID;
            Scanner scan = new Scanner(System.in);
            customerID = scan.nextInt();
            String userAdress;
            System.out.println("Indtast ny Adresse ");
            userAdress = scan.next();
            String sql = "UPDATE Customer SET customerAdress ='" + userAdress + "' WHERE customerID=" + String.valueOf(customerID);
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void changeCustomerPostalcode() {
        try {
            System.out.println("Indtast customerID på den der skal opdateres ");
            int customerID;
            Scanner scan = new Scanner(System.in);
            customerID = scan.nextInt();
            String userPostalCode;
            System.out.println("Indtast nyt postnummer ");
            userPostalCode = scan.next();
            String sql = "UPDATE Customer SET customerPostalcode ='" + userPostalCode + "' WHERE customerID=" + String.valueOf(customerID);
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void changeCustomerPhone() {
        try {
            System.out.println("Indtast customerID på den der skal opdateres ");
            int customerID;
            Scanner scan = new Scanner(System.in);
            customerID = scan.nextInt();
            String userPhone;
            System.out.println("Indtast nyt telefonnummer ");
            userPhone = scan.next();
            String sql = "UPDATE Customer SET customerPhone ='" + userPhone + "' WHERE customerID=" + String.valueOf(customerID);
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void changeCustomerMail() {
        try {
            System.out.println("Indtast customerID på den der skal opdateres ");
            int customerID;
            Scanner scan = new Scanner(System.in);
            customerID = scan.nextInt();
            String userMail;
            System.out.println("Indtast ny Mail ");
            userMail = scan.next();
            String sql = "UPDATE Customer SET customerMail ='" + userMail + "' WHERE customerID=" + String.valueOf(customerID);
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}