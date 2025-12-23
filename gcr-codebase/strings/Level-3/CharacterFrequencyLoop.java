import java.util.Scanner;

public class CharacterFrequencyLoop {

    public static String[] findCharacterFrequencies(String text) {
        char[] charArray = text.toCharArray();
        int n = charArray.length;
        int[] frequencyArray = new int[n];
        
        int uniqueCharCount = 0;

        for (int i = 0; i < n; i++) {
            frequencyArray[i] = 1;

            for (int j = i + 1; j < n; j++) {
                if (charArray[i] == charArray[j]) {
                    frequencyArray[i]++;
                    charArray[j] = '0'; 
                }
            }
            if (charArray[i] != '0') {
                uniqueCharCount++;
            }
        }

        String[] result = new String[uniqueCharCount * 2];
        int resultIndex = 0;

        for (int i = 0; i < n; i++) {
            if (charArray[i] != '0') {
                result[resultIndex++] = String.valueOf(charArray[i]);
                result[resultIndex++] = String.valueOf(frequencyArray[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to find character frequencies:");
        String userInput = input.nextLine();

        String[] frequencies = findCharacterFrequencies(userInput);

        System.out.println("\nCharacter Frequencies:");
        for (int i = 0; i < frequencies.length; i += 2) {
            String character = frequencies[i];
            String frequency = frequencies[i + 1];
            System.out.println("Character: '" + character + "': Frequency: " + frequency);
        }
    }
}
