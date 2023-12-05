package Main;

import java.sql.*;
import java.util.ArrayList;

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
            sql += "','" + co.getCompanyPostalCode() + "','" + co.getCompanyPhone() + "','" + co.getCompanyCVR() + "',";
            sql += "'" + (co.getCompanyMail()) + "'" + ")";
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
            sql += String.valueOf(t.isArrived()) + ")";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public ArrayList udskrivPackages() {
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
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return packagelist;
    }
}

