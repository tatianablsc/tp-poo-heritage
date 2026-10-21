package employee;

public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String describe() {
        return name + " gagne " + calculateSalary() + " € par mois";
    }

    public abstract double calculateSalary();

    public double calculateSalary(int months) {
        return calculateSalary() * months;
    }
}
