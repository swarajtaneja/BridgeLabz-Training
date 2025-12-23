import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker {

    public static boolean areAnagrams(String text1, String text2) {
        text1 = text1.replaceAll("\\s", "").toLowerCase();
        text2 = text2.replaceAll("\\s", "").toLowerCase();

        if (text1.length() != text2.length()) {
            return false;
        }

        int[] count = new int[256];

        for (int i = 0; i < text1.length(); i++) {
            count[text1.charAt(i)]++;
        }

        for (int i = 0; i < text2.length(); i++) {
            count[text2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first text:");
        String input1 = input.nextLine();

        System.out.println("Enter the second text:");
        String input2 = input.nextLine();

        boolean result = areAnagrams(input1, input2);

        if (result) {
            System.out.println("\"" + input1 + "\" and \"" + input2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + input1 + "\" and \"" + input2 + "\" are not anagrams.");
        }

    }
}
