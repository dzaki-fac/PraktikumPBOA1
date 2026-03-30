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

    public void checkout() {
        Order order = new Order(this);
        order.calculateTotal();
        System.out.println("Checkout successful. Order ID: " + order.getId());
    }

    public void viewProduct(Product p) {
        System.out.println("Viewing product: " + p.getName());
    }
}