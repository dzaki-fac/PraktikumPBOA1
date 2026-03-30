public class CreditCard extends Payment {
    private String cardNumber;

    public CreditCard(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    // Getter
    public String getCardNumber() {
        return cardNumber;
    }

    // Setter
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean processPayment() {
        assert amount > 0 : "Amount tidak valid";

        if (cardNumber == null || cardNumber.length() < 8) {
            throw new IllegalStateException("Nomor kartu tidak valid");
        }

        System.out.println("Processing Credit Card payment...");
        return true;
    }
}