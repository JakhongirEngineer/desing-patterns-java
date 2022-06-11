package work;

public class FullTimeWorker extends Employee{

    public FullTimeWorker(String employeeId, String password) {
        this.employeeId = employeeId;
        this.password = password;
    }
    @Override
    protected double calculateExtraPercentage(String employeeId, String password) {
        int yearsOfExperience =  getExperience(employeeId, password);
        return yearsOfExperience * 0.01;
    }

    protected int getExperience(String employeeId, String password) {
        return 6;
    }
}
