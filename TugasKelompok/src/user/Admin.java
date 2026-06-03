package user;

import product.Product;
import repository.ProductRepository;
import order.Order;

public class Admin extends User {

    private ProductRepository repo;

    public Admin(String email, String id, String name, String password) {
        super(email, id, name, password);
        this.repo = new ProductRepository();
    }

    public void addProduct(Product p) {
        repo.save(p);
        System.out.println("Admin " + name + " menambahkan produk: " + p.getName());
    }

    public void deleteProduct(String id) {
        Product p = repo.getById(id);

        if (p == null) {
            throw new IllegalArgumentException("Produk tidak ditemukan");
        }

        repo.delete(id);
        System.out.println("Admin " + name + " menghapus produk: " + p.getName());
    }

    public void updateProduct(String id, String newName, double newPrice, int newStock) {
        Product p = repo.getById(id);

        if (p == null) {
            throw new IllegalArgumentException("Produk tidak ditemukan");
        }

        p.setName(newName);
        p.setPrice(newPrice);
        p.setStock(newStock);

        repo.update(p);
        System.out.println("Admin " + name + " mengupdate produk: " + p.getName());
    }

    public Product getProductById(String id) {
        return repo.getById(id);
    }

    public java.util.List<Product> getAllProducts() {
        return repo.getAll();
    }

    public void manageOrder(Order o, String status) {
        o.setStatus(status);
        System.out.println("Admin " + name + " mengubah status order " + o.getId() + " menjadi " + status);
    }
}