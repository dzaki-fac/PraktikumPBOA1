import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Order {
    private String id;
    private Customer customer;
    private Date date;
    private List<OrderDetail> details;
    private String status;

    public Order(Customer customer) {
        assert customer != null : "Customer tidak boleh null";

        if (customer.getCart().getItems().isEmpty()) {
            throw new IllegalStateException("Cart kosong, tidak bisa checkout");
        }

        this.id = UUID.randomUUID().toString();
        this.customer = customer;
        this.date = new Date();
        this.details = new ArrayList<>();
        this.status = "NEW";

        for (CartItem item : customer.getCart().getItems()) {
            details.add(new OrderDetail(
                    item.getProduct(),
                    item.getQuantity(),
                    item.getProduct().getPrice()));
        }
    }

    // Getter
    public String getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getDate() {
        return date;
    }

    public List<OrderDetail> getDetails() {
        return details;
    }

    public String getStatus() {
        return status;
    }

    // Setter
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDetails(List<OrderDetail> details) {
        this.details = details;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double calculateTotal() {
        double total = 0;
        for (OrderDetail d : details) {
            total += d.getSubtotal();
        }
        return total;
    }
}