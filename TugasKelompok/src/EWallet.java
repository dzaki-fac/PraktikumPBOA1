public class EWallet extends Payment {
    private String walletId;

    public EWallet(double amount, String walletId) {
        super(amount);
        this.walletId = walletId;
    }

    // Getter
    public String getWalletId() {
        return walletId;
    }

    // Setter
    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public boolean processPayment() {
        System.out.println("Processing E-Wallet payment...");
        System.out.println("Wallet ID: " + walletId);
        System.out.println("Amount: " + amount);
        return true; // simulasi sukses
    }
}