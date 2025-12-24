public class SubstringCounter {
    public static void main(String[] args) {
        String mainStr = "abababa";
        String subStr = "aba";
        int count = 0;
        int lastIndex = 0;

        while ((lastIndex = mainStr.indexOf(subStr, lastIndex)) != -1) {
            count++;
            lastIndex += subStr.length();
        }
        System.out.println("Substring occurrences: " + count);
    }
}
