// Disusun oleh:
// Daniel Lamganda Tua G.	(24060124120048)
// Dehar Zaidan Dzaki A.	(24060124130099)
// Dzaki Fathul’Alim Cahyo	(24060124130103)
// Elang Fadila Ahmad	    (24060124130108)

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        NumberFormat nf = NumberFormat.getInstance(new Locale("id", "ID"));

        try {
            // category
            Category elektronik = new Category("C1", "Elektronik");

            // product
            Product laptop = new Product("P1", "Laptop", 10000000, 5, elektronik);
            Product hp = new Product("P2", "HP", 5000000, 2, elektronik);

            elektronik.addProduct(laptop);
            elektronik.addProduct(hp);

            // admin
            Admin admin = new Admin("admin@mail.com", "A1", "Admin", "123");
            admin.updateProduct(laptop, "Laptop Gaming", 12000000, 3);

            // customer
            Customer cust = new Customer("cust@mail.com", "U1", "Dzaki", "123");

            // login error
            try {
                System.out.println("login (salah): " + cust.login("", ""));
            } catch (IllegalArgumentException e) {
                System.out.println("login error: " + e.getMessage());
            }

            // cart
            cust.addToCart(laptop, 1);
            cust.addToCart(hp, 2);

            // cart error
            try {
                cust.addToCart(laptop, -1);
            } catch (IllegalArgumentException e) {
                System.out.println("cart error: " + e.getMessage());
            }

            // order
            Order order = new Order(cust);
            double total = order.calculateTotal();
            System.out.println("total order: Rp" + nf.format(total));

            // stock error
            try {
                laptop.updateStock(10);
            } catch (IllegalStateException e) {
                System.out.println("stock error: " + e.getMessage());
            }

            // payment error
            try {
                Payment p = new CreditCard(total, "123");
                p.processPayment();
            } catch (IllegalStateException e) {
                System.out.println("payment error: " + e.getMessage());
            }

            // payment normal
            Payment p2 = new EWallet(total, "OVO123");
            p2.processPayment();

            // checkout
            cust.checkout();

            cust.logout();

        } catch (Exception e) {
            System.out.println("unexpected error: " + e.getMessage());
        }
    }
}