// Disusun oleh:
// Daniel Lamganda Tua G.	(24060124120048)
// Dehar Zaidan Dzaki A.	(24060124130099)
// Dzaki Fathul’Alim Cahyo	(24060124130103)
// Elang Fadila Ahmad	    (24060124130108)

import java.text.NumberFormat;
import java.util.Locale;

public class Customer extends User {
    private Cart cart;

    public Customer(String email, String id, String name, String password) {
        super(email, id, name, password);
        this.cart = new Cart();
    }

    // Getter
    public Cart getCart() {
        return cart;
    }

    // Setter
    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public void addToCart(Product p, int qty) {
        cart.addItem(p, qty);
    }

    public void addToCart(Product p) {
        cart.addItem(p, 1);
    }

    public void checkout() {
        Order order = new Order(this);
        double total = order.calculateTotal();

        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));

        System.out.println("checkout berhasil");
        System.out.println("order id: " + order.getId());
        System.out.println("total: Rp" + nf.format(total));

        cart.getItems().clear();
    }

    public void viewProduct(Product p) {
        System.out.println("Melihat produk: " + p.getName());
    }
}