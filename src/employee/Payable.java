package employee;

/**
 * la classe peut être payée
 */
public interface Payable {
    double calculatePayment();

    default String formatPayment() {
        return "Paiement : " + calculatePayment() + " €";
    }
}