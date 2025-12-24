import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        String inputStr = getInput();
        boolean isPal = checkPalindrome(inputStr);
        displayResult(inputStr, isPal);
    }

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome: ");
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    public static boolean checkPalindrome(String str) {
        String cleanStr = str.replaceAll("\\s", "").toLowerCase();
        int left = 0;
        int right = cleanStr.length() - 1;
        
        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }
    }
}
