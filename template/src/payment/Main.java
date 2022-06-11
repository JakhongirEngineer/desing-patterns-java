package payment;

public class Main {
    public static void main(String[] args) {
        Payment payment = new PaymentVisa("john", "password");
        payment.transferTo("albert", 500);
        payment.transferTo("monica", 100);
    }
}
