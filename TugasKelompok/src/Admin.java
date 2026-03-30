public class Admin extends User {

    public Admin(String email, String id, String name, String password) {
        super(email, id, name, password);
    }

    public void addProduct(Product p) {
        System.out.println("Product added: " + p.getName());
    }

    public void deleteProduct(Product p) {
        System.out.println("Product deleted: " + p.getName());
    }

    public void manageOrder(Order o) {
        System.out.println("Managing order ID: " + o.getId());
    }

    public void updateProduct(Product p) {
        System.out.println("Product updated: " + p.getName());
    }
}