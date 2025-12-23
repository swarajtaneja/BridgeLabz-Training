import java.util.Scanner;

public class CharacterFrequency {

    public static Object[][] findCharacterFrequencies(String text) {
        int[] frequency = new int[256];
        int uniqueCharacterCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (frequency[character] == 0) {
                uniqueCharacterCount++;
            }
            frequency[character]++;
        }
        Object[][] characterFrequencies = new Object[uniqueCharacterCount][2];
        int index = 0;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                char character = (char) i;
                characterFrequencies[index][0] = character;
                characterFrequencies[index][1] = frequency[i];
                index++;
            }
        }

        return characterFrequencies;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string to find the frequency of its characters:");
        String inputString = input.nextLine();

        Object[][] frequencies = findCharacterFrequencies(inputString);

        System.out.println("\nCharacter Frequencies:");
        System.out.println("Character : Frequency");
        for (Object[] row : frequencies) {
            System.out.println(row[0] + " : " + row[1]);
        }
    }
}
