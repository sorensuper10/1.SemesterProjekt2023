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
}

