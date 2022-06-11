package payment;

public class PaymentVisa extends Payment{

    public PaymentVisa(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    protected boolean authenticate(String username, String password) {
        return username.equals("john") && password.equals("password");
    }

    @Override
    protected boolean hasEnoughMoney(String username, String password, double toAmount) {
        return authenticate(username, password) && toAmount < 1000;
    }

    @Override
    protected boolean sendMoneyTo(String toUsername, double amount) {
        System.out.println("sending money via Visa, amount: " + amount);
        return true;
    }
}
