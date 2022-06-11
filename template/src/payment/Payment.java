package payment;

public abstract class Payment {
    protected String username;
    protected String password;

    public boolean transferTo(String toUsername, double amount) {
        if (authenticate(this.username, this.password)) {
            if (hasEnoughMoney(this.username, this.password, amount)) {
                return sendMoneyTo(toUsername, amount);
            } else {
                return false;
            }
        }
        return false;
    }

    protected abstract boolean authenticate(String username, String password);

    protected abstract boolean hasEnoughMoney(String username, String password, double toAmount);

    protected abstract boolean sendMoneyTo(String toUsername, double amount);
}
