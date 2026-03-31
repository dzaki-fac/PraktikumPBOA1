// Disusun oleh:
// Daniel Lamganda Tua G.	(24060124120048)
// Dehar Zaidan Dzaki A.	(24060124130099)
// Dzaki Fathul’Alim Cahyo	(24060124130103)
// Elang Fadila Ahmad	    (24060124130108)

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String id;
    private String name;
    private List<Product> products;

    public Category(String id, String name) {
        this.id = id;
        this.name = name;
        this.products = new ArrayList<>();
    }

    // Getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    // Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product p) {
        products.add(p);
        p.setCategory(this);
    }
}