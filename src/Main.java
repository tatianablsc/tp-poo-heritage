import employee.Developer;
import employee.Manager;
import employee.BackendDeveloper;
import employee.Employee;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Developer alice = new Developer("Alice", 3200);
        Manager bob = new Manager("Bob", 4500, 800);

        System.out.println(alice.describe());
        System.out.println(bob.describe());
        System.out.println(alice.formatPayment());
        System.out.println(bob.formatPayment());
        System.out.println(bob.generateReport());

        BackendDeveloper chloe = new BackendDeveloper("Chloé", 3800, 600);
        System.out.println(chloe.describe());
        System.out.println("Salaire de Chloé sur 12 mois : " + chloe.calculateSalary(12));

        System.out.println("--- Partie E ---");
        List<Employee> employees = List.of(
                new Developer("Alice", 3200),
                new Manager("Bob", 4500, 800),
                new BackendDeveloper("Chloé", 3800, 600)
        );

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " -> " + employee.calculateSalary());
        }

        System.out.println("--- Partie F ---");
        Employee employee = new BackendDeveloper("David", 4000, 700);

        // upcasting : implicite
        Employee e = new Developer("Emma", 3000);

        // downcasting sécurisé
        if (employee instanceof BackendDeveloper backendDeveloper) {
            System.out.println(backendDeveloper.calculateSalary());
        }

        if (e instanceof BackendDeveloper bd) {
            System.out.println(bd.calculateSalary());
        } else {
            System.out.println("Emma n'est pas un BackendDeveloper, on ne fait pas le cast");
        }
    }
}