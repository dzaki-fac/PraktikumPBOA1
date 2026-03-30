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
        assert amount > 0 : "Amount tidak valid";

        if (walletId == null || walletId.isEmpty()) {
            throw new IllegalStateException("Wallet ID tidak valid");
        }

        System.out.println("Processing E-Wallet payment...");
        return true;
    }
}