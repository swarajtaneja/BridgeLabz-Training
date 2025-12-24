import java.util.Scanner;

public class MaxOfThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = getInput(scanner, "Enter first number: ");
        int num2 = getInput(scanner, "Enter second number: ");
        int num3 = getInput(scanner, "Enter third number: ");
        
        int max = calculateMax(num1, num2, num3);
        System.out.println("The maximum number is: " + max);
        scanner.close();
    }

    public static int getInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static int calculateMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
