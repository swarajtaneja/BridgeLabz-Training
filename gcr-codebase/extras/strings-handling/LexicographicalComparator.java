public class LexicographicalComparator {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "banana";
        int comparisonResult = compareStrings(s1, s2);

        if (comparisonResult < 0) {
            System.out.println(s1 + " comes before " + s2);
        } else if (comparisonResult > 0) {
            System.out.println(s1 + " comes after " + s2);
        } else {
            System.out.println(s1 + " is equal to " + s2);
        }
    }

    public static int compareStrings(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
    }
}
