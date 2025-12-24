import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int terms = scanner.nextInt();
        
        generateAndPrintFibonacci(terms);
        scanner.close();
    }

    public static void generateAndPrintFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println();
    }
}
