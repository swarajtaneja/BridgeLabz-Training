import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100.");
        guessNumber(scanner);
        scanner.close();
    }

    public static void guessNumber(Scanner scanner) {
        int low = 1, high = 100;
        int guess;
        String feedback = "";

        while (!feedback.equals("correct")) {
            guess = generateNextGuess(low, high);
            System.out.println("Is your number " + guess + "? (high/low/correct):");
            feedback = receiveFeedback(scanner);

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("correct")) {
                System.out.println("Great! I guessed your number!");
            } else {
                System.out.println("Invalid feedback. Please enter high, low, or correct.");
            }
        }
    }

    public static int generateNextGuess(int low, int high) {
        return low + (high - low) / 2;
    }

    public static String receiveFeedback(Scanner scanner) {
        return scanner.next().toLowerCase();
    }
}
