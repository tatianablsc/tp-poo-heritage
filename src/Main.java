import employee.Developer;
import employee.Manager;

public class Main {
    public static void main(String[] args) {
        Developer alice = new Developer("Alice", 3200);
        Manager bob = new Manager("Bob", 4500, 800);

        System.out.println(alice.describe());
        System.out.println(bob.describe());
    }
}