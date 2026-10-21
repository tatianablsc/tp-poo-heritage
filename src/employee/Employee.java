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

    /**
     * Surcharge : calcule le salaire sur plusieurs mois.
     *
     * @param months nombre de mois
     * @return le salaire total sur la période
     */
    public double calculateSalary(int months) {
        return calculateSalary() * months;
    }
}