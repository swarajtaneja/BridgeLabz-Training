import java.util.Scanner;

public class CharacterFrequencyUnique {
    public static Object[][] findCharacterFrequency(String text) {
        int[] frequencyArray = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            frequencyArray[character]++;
        }

        int uniqueCharCount = 0;
        for (int count : frequencyArray) {
            if (count > 0) {
                uniqueCharCount++;
            }
        }

        Object[][] characterFrequencies = new Object[uniqueCharCount][2];
        int index = 0;

        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > 0) {
                char character = (char) i;
                int frequency = frequencyArray[i];

                characterFrequencies[index][0] = character;
                characterFrequencies[index][1] = frequency;
                index++;
            }
        }

        return characterFrequencies;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        Object[][] frequencies = findCharacterFrequency(userInput);

        System.out.println("\nCharacter Frequencies:");
        for (Object[] pair : frequencies) {
            char character = (char) pair[0];
            int frequency = (int) pair[1];
            System.out.println("'" + character + "': " + frequency);
        }

    }
}
