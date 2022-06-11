package work;

public abstract class Employee {
    protected String employeeId;
    protected String password;
    public double earn( int rate, int hour ) {
        double extraPercentage = calculateExtraPercentage(employeeId, password);
        return (1 + extraPercentage) * rate * hour;
    }
    protected abstract double calculateExtraPercentage(String employeeId, String password);
}
