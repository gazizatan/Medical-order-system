package org.example.repository;

import org.example.database.interfaces.IDB;
import org.example.Person;
import org.example.repository.interfaces.IRepository;
import java.sql.*;

public class PersonRepository{
    private final IDB db;

    public PersonRepository(IDB db){
        this.db = db;
    }
    public boolean createUser(Person person) {
        Connection con = null;

        try {
            con = db.getConnection();
            String sql = "INSERT INTO users(id,name,surname,age,gender,role) VALUES (?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, person.getId());
            st.setString(2, person.getName());
            st.setString(3, person.getSurname());
            st.setInt(4, person.getAge());
            st.setString(5, person.getGender());
            st.setString(6, person.getRole());

            st.execute();

            return true;
        } catch (SQLException e) {
            System.out.println("sql error: " + e.getMessage());
        } finally {
            try {
                if (con != null)
                    con.close();
            }
            catch (SQLException e) {
                System.out.println("sql error: " + e.getMessage());
            }
        }

        return false;
    }
}
