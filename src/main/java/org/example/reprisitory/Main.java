package org.example.reprisitory;

import org.example.Person;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String connectionString = "jdbc:postgresql://localhost:5432/medicalsystem";
        ArrayList<Person> users = new ArrayList<>();
        Connection con = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connectionString, "postgres", "0000");

            String sql = "SELECT id, name, surname, gender, age, role FROM person ORDER BY id;";
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                String gender = rs.getString("gender");
                Integer age = rs.getInt("age");
                String role = rs.getString("role");


                Person person = new Person(id, name, surname, gender, age, role);
                users.add(person);
            }
        } catch (SQLException e) {
            System.out.println("connection error: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("driver error: " + e.getMessage());
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.out.println("could not close the connection: " + e.getMessage());
                }
            }
        }

        for (Person person : users) {
            System.out.println(person);
        }
    }

}