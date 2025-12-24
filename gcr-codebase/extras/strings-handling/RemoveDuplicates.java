import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        Set<Character> chars = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }

        StringBuilder result = new StringBuilder();
        for (char ch : chars) {
            result.append(ch);
        }
        System.out.println("String without duplicates: " + result.toString());
    }
}
