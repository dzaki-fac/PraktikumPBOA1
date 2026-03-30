public abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount harus lebih dari 0");
        }
        this.amount = amount;
    }

    // Getter
    public double getAmount() {
        return amount;
    }

    // Setter
    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Method abstract
    public abstract boolean processPayment();
}