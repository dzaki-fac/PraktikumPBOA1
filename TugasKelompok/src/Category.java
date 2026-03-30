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
    }
}