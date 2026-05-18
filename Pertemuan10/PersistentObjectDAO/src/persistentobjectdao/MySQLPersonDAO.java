/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistentobjectdao;

/**
 *
 * @author lenovo
 */

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {

    public void savePerson(Person person) throws Exception {
        String name = person.getName();

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/pbo",
            "root",
            "Gemastik19"
        );

        String query = "INSERT INTO person(name) VALUES (?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, name);

        ps.executeUpdate();

        ps.close();
        con.close();

        System.out.println("Data berhasil disimpan: " + name);
    }
}
