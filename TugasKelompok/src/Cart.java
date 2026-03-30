import java.util.ArrayList;
import java.util.List;

public class Cart {
    private String id;
    private List<CartItem> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public Cart(String id) {
        this.id = id;
        this.items = new ArrayList<>();
    }

    // Getter
    public String getId() {
        return id;
    }

    public List<CartItem> getItems() {
        return items;
    }

    // Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public void addItem(Product p, int qty) {
        assert p != null : "Product tidak boleh null";

        if (qty <= 0) {
            throw new IllegalArgumentException("Quantity harus > 0");
        }

        for (CartItem item : items) {
            if (item.getProduct().equals(p)) {
                item.setQuantity(item.getQuantity() + qty);
                return;
            }
        }
        items.add(new CartItem(p, qty));
    }

    public void removeItem(Product p) {
        items.removeIf(item -> item.getProduct().equals(p));
    }

    public double getTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getSubtotal();
        }
        return total;
    }
}