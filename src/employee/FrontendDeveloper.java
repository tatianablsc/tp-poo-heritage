package employee;

/**
 * développeur frontend.
 * règle de salaire : salaire d'un Developer + 5 % de prime UX/UI.
 */
public class FrontendDeveloper extends Developer {

    public FrontendDeveloper(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() * 1.05;
    }
}