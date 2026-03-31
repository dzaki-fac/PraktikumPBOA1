// Disusun oleh:
// Daniel Lamganda Tua G.	(24060124120048)
// Dehar Zaidan Dzaki A.	(24060124130099)
// Dzaki Fathul’Alim Cahyo	(24060124130103)
// Elang Fadila Ahmad	    (24060124130108)

public class Product {
    private String id;
    private String name;
    private double price;
    private int stock;
    private Category category;

    public Product(String id, String name, double price, int stock, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    // Getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public Category getCategory() {
        return category;
    }

    // Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif");
        }
        this.price = price;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stok tidak boleh negatif");
        }
        this.stock = stock;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void updateStock(int qty) {
        assert qty >= 0 : "Qty harus positif";

        if (qty > stock) {
            throw new IllegalStateException("Stok tidak cukup");
        }
        stock -= qty;
    }
}