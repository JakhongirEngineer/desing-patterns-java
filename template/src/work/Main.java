package work;

public class Main {
    public static void main(String[] args) {
        Employee employee = new FullTimeWorker("john", "password");
        System.out.println(employee.earn(100, 50));
    }
}
