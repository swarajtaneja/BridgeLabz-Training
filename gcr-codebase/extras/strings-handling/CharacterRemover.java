public class CharacterRemover {
    public static void main(String[] args) {
        String str = "Hello World";
        char charToRemove = 'l';
        StringBuilder modifiedString = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch != charToRemove) {
                modifiedString.append(ch);
            }
        }
        System.out.println("Modified String: " + modifiedString.toString());
    }
}
