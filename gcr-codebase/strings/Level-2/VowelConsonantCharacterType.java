import java.util.Scanner;

public class VowelConsonantCharacterType {

    public static String characterType(char ch)
         {
              if (ch >= 'A' && ch <= 'Z') 
              {
                  ch = (char)(ch + 32);
              }

              if (ch >= 'a' && ch <= 'z')
              {

                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    {
                        return "Vowel";
                    } 
                    else 
                    {
                        return "Consonant";
                    }
              }

              return "Not a Letter";
         }

         public static String[][] findCharacterType(String text)
         {
              int len = text.length();
              String[][] result = new String[len][2];

              for (int i = 0; i < len; i++)
              {
                   char ch = text.charAt(i);
                   result[i][0] = String.valueOf(ch);
                   result[i][1] = characterType(ch);
              }

              return result;
         }

         public static void displayTable(String[][] table) 
         {
              for (int i = 0; i < table.length; i++)
              {
                    System.out.println(table[i][0] + " " + table[i][1]);
              }
         }

         public static void main(String[] args) {
               Scanner input = new Scanner(System.in);
               String text;

               System.out.print("Enter a string: ");
               text = input.nextLine();
               String[][] table = findCharacterType(text);
               displayTable(table);

         }
}
