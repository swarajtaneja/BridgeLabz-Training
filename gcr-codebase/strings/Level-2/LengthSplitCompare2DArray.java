import java.util.Scanner;
public class LengthSplitCompare2DArray
{
         public static String [] splitFind(String text)
         {
             int len = findLength(text);
             int wordCount = 0;
             boolean inWord = false;
             for (int i = 0; i < len; i++)
             {
                    if (text.charAt(i) != ' ' && !inWord)
                    {
                         wordCount++;
                         inWord = true;
                    }
                    else if (text.charAt(i) == ' ') 
                    {
                    inWord = false;
                    }
             }

             String[] words = new String[wordCount];
             int index = 0;
             String word = "";

             for (int i = 0; i < len; i++) 
             {
                  if (text.charAt(i) != ' ')
                  {
                      word += text.charAt(i);
                  } 
                  else if (!word.equals("")) 
                  {
                      words[index++] = word;
                      word = "";
                  }
            }

            if (!word.equals(""))
            {
                words[index] = word;
            }

            return words;
         

             
         }
         public static int findLength(String str) 
         {
                  int count = 0;
                  try 
                  {
                      while (true) 
                      {
                           str.charAt(count);
                           count++;
                      }
                  }
                  catch (Exception e)
                  {
                  }
                  return count;
         }

         public static String[][] wordLength(String[] words)
         {
               String[][] result = new String[words.length][2];

               for (int i = 0; i < words.length; i++) 
               {
                   result[i][0] = words[i];
                   result[i][1] = String.valueOf(findLength(words[i]));
               }

               return result;
         }
         public static void main(String[] args)
         {
                Scanner input = new Scanner(System.in);
                String text;
                
                System.out.print("Enter Text : ");
                text =input.nextLine();
                String [] userSplit=splitFind(text);
                String[][] table = wordLength(userSplit);
              
                for (int i = 0; i < table.length; i++)
                {
                     int length = Integer.parseInt(table[i][1]);
                     System.out.println(table[i][0] + " " + length);
                }
                 
         }
}