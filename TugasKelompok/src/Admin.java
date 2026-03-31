// Disusun oleh:
// Daniel Lamganda Tua G.	(24060124120048)
// Dehar Zaidan Dzaki A.	(24060124130099)
// Dzaki Fathul’Alim Cahyo	(24060124130103)
// Elang Fadila Ahmad	    (24060124130108)

public class Admin extends User {

    public Admin(String email, String id, String name, String password) {
        super(email, id, name, password);
    }

    public void addProduct(Product p, Category c) {
        c.addProduct(p);
        System.out.println("Admin " + name + " menambahkan produk: " + p.getName());
    }

    public void deleteProduct(Product p, Category c) {
        c.getProducts().remove(p);
        System.out.println("Admin " + name + " menghapus produk: " + p.getName());
    }

    public void updateProduct(Product p, String newName, double newPrice, int newStock) {
        p.setName(newName);
        p.setPrice(newPrice);
        p.setStock(newStock);
        System.out.println("Admin " + name + " mengupdate produk: " + p.getName());
    }

    public void manageOrder(Order o, String status) {
        o.setStatus(status);
        System.out.println("Admin " + name + " mengubah status order " + o.getId() + " menjadi " + status);
    }
}