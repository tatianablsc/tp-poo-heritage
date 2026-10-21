package employee;

public class Developer extends Employee implements Payable {
    private double baseSalary;

    public Developer(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public double calculatePayment() {
        return calculateSalary();
    }
}