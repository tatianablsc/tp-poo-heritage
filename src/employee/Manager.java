package employee;

public class Manager extends Employee implements Payable, Reportable {
    private double baseSalary;
    private double managementBonus;

    public Manager(String name, double baseSalary, double managementBonus) {
        super(name);
        this.baseSalary = baseSalary;
        this.managementBonus = managementBonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + managementBonus;
    }

    @Override
    public double calculatePayment() {
        return calculateSalary();
    }

    @Override
    public String generateReport() {
        return "Rapport de " + name + " : salaire de base " + baseSalary
                + " €, prime de management " + managementBonus + " €";
    }

    @Override
    public String formatPayment() {
        return "Paiement manager (prime incluse) : " + calculatePayment() + " €";
    }
}