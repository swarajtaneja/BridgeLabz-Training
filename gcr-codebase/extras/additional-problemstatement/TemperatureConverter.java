import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose conversion:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%.2f F is %.2f C%n", fahrenheit, celsius);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = input.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("%.2f C is %.2f F%n", celsius, fahrenheit);
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5.0 / 9.0;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9.0 / 5.0) + 32;
    }
}
