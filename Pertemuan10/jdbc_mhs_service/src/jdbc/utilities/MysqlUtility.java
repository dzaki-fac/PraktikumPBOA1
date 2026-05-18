/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

/**
 *
 * @author lenovo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3306/jdbc_mhs";
                String user = "root";
                String password = "Gemastik19";

                koneksi = DriverManager.getConnection(url, user, password);

                System.out.println("Koneksi berhasil");
            } catch (ClassNotFoundException e) {
                System.out.println("Gagal load driver: " + e.getMessage());
            } catch (SQLException e) {
                System.out.println("Gagal koneksi: " + e.getMessage());
            }
        }

        return koneksi;
    }
}
