public interface PaymentMethod {

    // method abstract
    void processPayment();
    String getPaymentDetails();
    double getTransactionFee();
    double getBalance();
}
