import java.util.Scanner;

public class UniqueCharacters{

        public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

        public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

        public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        char[] uniqueCharacters = findUniqueCharacters(text);

        System.out.println("Unique characters:");
        for (char c : uniqueCharacters) {
            System.out.print(c + " ");
        }

        
    }
}
