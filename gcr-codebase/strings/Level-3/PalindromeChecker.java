import java.util.Scanner;

public class PalindromeChecker {

    private static String prepareText(String text) {
        return text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    public static boolean isPalindromeIterative(String originalText) {
        String text = prepareText(originalText);
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String originalText) {
        String text = prepareText(originalText);
        return isPalindromeRec(text, 0, text.length() - 1);
    }

    private static boolean isPalindromeRec(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRec(text, start + 1, end - 1);
    }

    public static boolean isPalindromeCharArray(String originalText) {
        String text = prepareText(originalText);
        char[] originalArray = text.toCharArray();
        char[] reverseArray = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            reverseArray[i] = text.charAt(text.length() - 1 - i);
        }

        for (int i = 0; i < text.length(); i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text to check if it's a palindrome:");
        String userInput = input.nextLine();

        System.out.println("\n--- Results for: \"" + userInput + "\" ---");

        boolean result1 = isPalindromeIterative(userInput);
        System.out.println("Logic 1 (Iterative): " + (result1 ? "Palindrome" : "Not a Palindrome"));

        boolean result2 = isPalindromeRecursive(userInput);
        System.out.println("Logic 2 (Recursive): " + (result2 ? "Palindrome" : "Not a Palindrome"));

        boolean result3 = isPalindromeCharArray(userInput);
        System.out.println("Logic 3 (Character Arrays/Reversal): " + (result3 ? "Palindrome" : "Not a Palindrome"));
    }
}
