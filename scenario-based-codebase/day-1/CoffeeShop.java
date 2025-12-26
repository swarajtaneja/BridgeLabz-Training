import java.util.Scanner;

public class CoffeeShop{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PRICE_ESPRESSO = 200.50;
        final double PRICE_LATTE =210.00;
        final double PRICE_CAPPUCCINO = 239.50;
        final double GST_RATE = 0.18; // 18% GST

        System.out.println("Welcome to the Coffee Shop!");

        while (true) {
            System.out.println("Menu: Espresso-1, Latte-2, Cappuccino-3 (Type 'exit' to quit)");
            System.out.print("Enter coffee type: ");
            int coffeeTypeInput = scanner.nextInt();

            if (coffeeTypeInput.equals("exit")) {
                System.out.println("Thank you for using the billing system. Goodbye!");
                break;
            }

            double price = 0.0;

            switch (coffeeTypeInput) {
                case "espresso":
                    price = PRICE_ESPRESSO;
                    break;
                case "latte":
                    price = PRICE_LATTE;
                    break;
                case "cappuccino":
                    price = PRICE_CAPPUCCINO;
                    break;
                default:
                    System.out.println("Invalid coffee type entered. Please try again.");
                    continue; 
            }

            int quantity = 0;
            while (true) {
                System.out.print("Enter quantity: ");
                if (scanner.hasNextInt()) {
                    quantity = scanner.nextInt();
                    scanner.nextLine();
                    if (quantity > 0) {
                        break;
                    } else {
                        System.out.println("Quantity must be greater than zero.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number for quantity.");
                    scanner.nextLine();
                }
            }

            double subTotal = price * quantity;
            double gstAmount = subTotal * GST_RATE;
            double totalBill = subTotal + gstAmount;

            System.out.println("\n--- Bill Details ---");
            System.out.printf("Item: %s (Qty: %d)\n", coffeeTypeInput, quantity);
            System.out.printf("Subtotal: $%.2f\n", subTotal);
            System.out.printf("GST (18%%): $%.2f\n", gstAmount);
            System.out.printf("Total Bill: $%.2f\n", totalBill);
        }

    }
}
