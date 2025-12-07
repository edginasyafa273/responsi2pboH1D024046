public class EWalletPayment implements PaymentMethod {

    private String provider;
    private double saldo;
    private double nominal;

    // constructor
    public EWalletPayment(String provider, double saldo, double nominal) {
        this.provider = provider;
        this.saldo = saldo;
        this.nominal = nominal;
    }

    @Override
    public void processPayment() {

        System.out.println("Memproses pembayaran sebesar " + nominal + "...");

        double fee = getTransactionFee();
        double total = nominal + fee;

        if (saldo >= total) {
            saldo -= total;
            System.out.println("Pembayaran berhasil!");
        } else {
            System.out.println("Pembayaran gagal! Saldo tidak cukup.");
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Pembayaran dilakukan melalui " + provider;
    }

    @Override
    public double getTransactionFee() {
        return 2000;    // sesuai ketentuan fee minimal
    }

    @Override
    public double getBalance() {
        return saldo;
    }
}
