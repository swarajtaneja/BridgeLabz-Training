public class CaseToggler {
    public static void main(String[] args) {
        String str = "HeLlO WoRlD";
        StringBuilder toggled = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } else {
                toggled.append(ch);
            }
        }
        System.out.println("Toggled case string: " + toggled.toString());
    }
}
