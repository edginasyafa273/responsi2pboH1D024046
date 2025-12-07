public class PaymentTest {

    public static void main(String[] args) {

        // buat objek
        EWalletPayment bayar = new EWalletPayment("OVO", 150000, 50000);

        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        // saldo awal
        System.out.println("Saldo awal: " + bayar.getBalance());

        // proses pembayaran
        bayar.processPayment();

        // saldo sisa
        System.out.println("Sisa saldo: " + bayar.getBalance());

        // detail transaksi
        System.out.println("Detail Transaksi: " + bayar.getPaymentDetails());
    }
}
