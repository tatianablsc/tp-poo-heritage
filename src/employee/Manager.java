package employee;

public class Manager extends Employee {
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
}