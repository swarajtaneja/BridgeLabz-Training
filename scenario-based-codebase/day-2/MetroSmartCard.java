import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 200.0;
        char choice;

        while (balance > 0) {
            System.out.print("Enter distance travelled (km): ");
            int distance = sc.nextInt();

            // Fare calculation using ternary operator
            double fare = (distance <= 5) ? 10 :
                          (distance <= 15) ? 20 : 30;

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare deducted: ₹" + fare);
                System.out.println("Remaining balance: ₹" + balance);
            } else {
                System.out.println("Insufficient balance.");
                break;
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);
            if (choice == 'n' || choice == 'N') {
                break;
            }
        }
        sc.close();
    }
}
