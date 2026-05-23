package app;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import user.*;
import product.*;
import order.*;
import payment.*;
import repository.ProductRepository;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        NumberFormat nf =
            NumberFormat.getInstance(new Locale("id", "ID"));

        ProductRepository repo = new ProductRepository();

        Category elektronik =
            new Category("C1", "Elektronik");

        Customer customer =
            new Customer("cust@mail.com", "U1", "Dzaki", "123");

        Admin admin =
            new Admin("admin@mail.com", "A1", "Admin", "123");

        boolean running = true;

        while (running) {

            System.out.println("\n===== E-COMMERCE APP =====");
            System.out.println("1. Admin");
            System.out.println("2. Customer");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");

            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {

                // =========================
                // ADMIN MENU
                // =========================
                case 1:

                    boolean adminRunning = true;

                    while (adminRunning) {

                        System.out.println("\n===== ADMIN MENU =====");
                        System.out.println("1. Tambah Product");
                        System.out.println("2. Lihat Product");
                        System.out.println("3. Update Product");
                        System.out.println("4. Hapus Product");
                        System.out.println("5. Kembali");
                        System.out.print("Pilih menu: ");

                        int adminMenu = input.nextInt();
                        input.nextLine();

                        switch (adminMenu) {

                            case 1:

                                try {

                                    System.out.print("ID Product: ");
                                    String id = input.nextLine();

                                    System.out.print("Nama Product: ");
                                    String name = input.nextLine();

                                    System.out.print("Harga: ");
                                    double price = input.nextDouble();

                                    System.out.print("Stock: ");
                                    int stock = input.nextInt();

                                    Product product =
                                        new Product(
                                            id,
                                            name,
                                            price,
                                            stock,
                                            elektronik
                                        );

                                    repo.save(product);

                                    System.out.println("Product berhasil ditambahkan");

                                } catch (Exception e) {
                                    System.out.println("Error: " + e.getMessage());
                                }

                                break;

                            case 2:

                                List<Product> products = repo.getAll();

                                System.out.println("\n===== LIST PRODUCT =====");

                                if (products.isEmpty()) {
                                    System.out.println("Belum ada product");
                                } else {
                                    for (Product p : products) {
                                        System.out.println(
                                            p.getId()
                                            + " | "
                                            + p.getName()
                                            + " | Rp"
                                            + nf.format(p.getPrice())
                                            + " | Stock: "
                                            + p.getStock()
                                        );
                                    }
                                }

                                break;

                            case 3:

                                try {

                                    System.out.print("ID Product: ");
                                    String updateId = input.nextLine();

                                    System.out.print("Nama Baru: ");
                                    String newName = input.nextLine();

                                    System.out.print("Harga Baru: ");
                                    double newPrice = input.nextDouble();

                                    System.out.print("Stock Baru: ");
                                    int newStock = input.nextInt();

                                    Product updateProduct =
                                        new Product(
                                            updateId,
                                            newName,
                                            newPrice,
                                            newStock,
                                            elektronik
                                        );

                                    repo.update(updateProduct);

                                } catch (Exception e) {
                                    System.out.println("Error: " + e.getMessage());
                                }

                                break;

                            case 4:

                                try {

                                    System.out.print("ID Product: ");
                                    String deleteId = input.nextLine();

                                    repo.delete(deleteId);

                                } catch (Exception e) {
                                    System.out.println("Error: " + e.getMessage());
                                }

                                break;

                            case 5:
                                adminRunning = false;
                                break;

                            default:
                                System.out.println("Menu tidak valid");
                        }
                    }

                    break;

                // =========================
                // CUSTOMER MENU
                // =========================
                case 2:

                    boolean customerRunning = true;

                    while (customerRunning) {

                        System.out.println("\n===== CUSTOMER MENU =====");
                        System.out.println("1. Lihat Product");
                        System.out.println("2. Tambah ke Cart");
                        System.out.println("3. Lihat Cart");
                        System.out.println("4. Checkout");
                        System.out.println("5. Kembali");
                        System.out.print("Pilih menu: ");

                        int customerMenu = input.nextInt();
                        input.nextLine();

                        switch (customerMenu) {

                            case 1:

                                List<Product> products = repo.getAll();

                                System.out.println("\n===== LIST PRODUCT =====");

                                if (products.isEmpty()) {
                                    System.out.println("Belum ada product");
                                } else {
                                    for (Product p : products) {
                                        System.out.println(
                                            p.getId()
                                            + " | "
                                            + p.getName()
                                            + " | Rp"
                                            + nf.format(p.getPrice())
                                            + " | Stock: "
                                            + p.getStock()
                                        );
                                    }
                                }

                                break;

                            case 2:

                                System.out.print("ID Product: ");
                                String id = input.nextLine();

                                Product selected = null;

                                for (Product p : repo.getAll()) {
                                    if (p.getId().equals(id)) {
                                        selected = p;
                                        break;
                                    }
                                }

                                if (selected == null) {
                                    System.out.println("Product tidak ditemukan");
                                    break;
                                }

                                System.out.print("Quantity: ");
                                int qty = input.nextInt();

                                customer.addToCart(selected, qty);

                                System.out.println("Berhasil tambah ke cart");

                                break;

                            case 3:

                                System.out.println("\n===== CART =====");

                                if (customer.getCart().getItems().isEmpty()) {
                                    System.out.println("Cart kosong");
                                } else {

                                    for (CartItem item : customer.getCart().getItems()) {
                                        System.out.println(
                                            item.getProduct().getName()
                                            + " | Qty: "
                                            + item.getQuantity()
                                            + " | Rp"
                                            + nf.format(item.getSubtotal())
                                        );
                                    }

                                    System.out.println(
                                        "Total: Rp"
                                        + nf.format(customer.getCart().getTotal())
                                    );
                                }

                                break;

                            case 4:

                                try {

                                    Order order =
                                        new Order(customer);

                                    double total =
                                        order.calculateTotal();

                                    Payment payment =
                                        new EWallet(total, "OVO123");

                                    payment.processPayment();

                                    // checkout + update stock ke DB
                                    customer.checkout(repo);

                                } catch (Exception e) {
                                    System.out.println("Checkout gagal: " + e.getMessage());
                                }

                                break;

                            case 5:
                                customerRunning = false;
                                break;

                            default:
                                System.out.println("Menu tidak valid");
                        }
                    }

                    break;

                case 3:

                    running = false;
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak valid");
            }
        }

        input.close();
    }
}