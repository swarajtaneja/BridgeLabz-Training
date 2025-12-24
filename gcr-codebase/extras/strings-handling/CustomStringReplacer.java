public class CustomStringReplacer {
    public static void main(String[] args) {
        String sentence = "Java is a programming language. Java is widely used.";
        String target = "Java";
        String replacement = "Python";

        String modifiedSentence = replaceWord(sentence, target, replacement);
        System.out.println("Original: " + sentence);
        System.out.println("Modified: " + modifiedSentence);
    }

    public static String replaceWord(String sentence, String target, String replacement) {
        String[] words = sentence.split("\\s+"); 
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.contains(target)) {
                word = word.replace(target, replacement);
            }
            result.append(word);
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
