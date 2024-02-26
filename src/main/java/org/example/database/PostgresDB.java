package org.example.database;

import org.example.database.interfaces.IDB;

import java.sql.*;

public class PostgresDB implements IDB {
    public Connection getConnection() {
        String connectionUrl = "jdbc:postgresql://localhost:5432/medicalsystem";
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(connectionUrl, "postgres", "0000");

            return con;
        } catch (Exception e) {
            System.out.println("failed to connect to postgres: " + e.getMessage());

            return null;
        }
    }
}