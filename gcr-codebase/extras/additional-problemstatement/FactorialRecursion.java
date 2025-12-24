import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String[] args) {
        int number = getInput();
        long result = calculateFactorial(number);
        displayResult(number, result);
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to find its factorial: ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void displayResult(int num, long factorial) {
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
