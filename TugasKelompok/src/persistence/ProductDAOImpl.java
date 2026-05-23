package persistence;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import product.*;

public class ProductDAOImpl implements ProductDAO {

    @Override
    public void save(Product product) {

        String sql =
            "INSERT INTO product(id, name, price, stock) VALUES (?, ?, ?, ?)";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, product.getId());
            ps.setString(2, product.getName());
            ps.setDouble(3, product.getPrice());
            ps.setInt(4, product.getStock());

            ps.executeUpdate();

            System.out.println("Product tersimpan ke database");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public List<Product> getAll() {

        List<Product> products = new ArrayList<>();

        String sql = "SELECT * FROM product";

        try (
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql)
        ) {

            while (rs.next()) {

                Product p = new Product(
                    rs.getString("id"),
                    rs.getString("name"),
                    rs.getDouble("price"),
                    rs.getInt("stock"),
                    null
                );

                products.add(p);
            }

        } catch (Exception e) {

            System.out.println(
                "Error: " + e.getMessage()
            );
        }

        return products;
    }

    @Override
    public void update(Product product) {

        String sql =
            "UPDATE product SET name=?, price=?, stock=? WHERE id=?";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, product.getName());
            ps.setDouble(2, product.getPrice());
            ps.setInt(3, product.getStock());
            ps.setString(4, product.getId());

            int rows = ps.executeUpdate();

            if (rows == 0) {
                System.out.println("Product tidak ditemukan");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    
    @Override
    public void delete(String id) {

        String sql =
            "DELETE FROM product WHERE id=?";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, id);

            ps.executeUpdate();

            System.out.println(
                "Product berhasil dihapus"
            );

        } catch (Exception e) {

            System.out.println(
                "Error: " + e.getMessage()
            );
        }
    }

    public void updateStock(String id, int stock) {
        String sql =
            "UPDATE product SET stock=? WHERE id=?";

        try (
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setInt(1, stock);
            ps.setString(2, id);

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}