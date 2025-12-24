import java.util.HashMap;
import java.util.Map;

public class FrequentCharacterFinder {
    public static void main(String[] args) {
        String str = "success";
        Map<Character, Integer> counts = new HashMap<>();
        for (char ch : str.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }

        char mostFrequentChar = ' ';
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentChar = entry.getKey();
            }
        }
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
}
