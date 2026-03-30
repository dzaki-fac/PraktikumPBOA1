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
        System.out.println("Processing Credit Card payment...");
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Amount: " + amount);
        return true; // simulasi sukses
    }
}