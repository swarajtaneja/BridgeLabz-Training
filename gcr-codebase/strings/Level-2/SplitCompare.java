import java.util.Scanner;
public class SplitCompare
{
         public static String [] splitFind(String text)
         {
             int size = text.length();
             char space=' ';
             String word;
             int index=0,count=1,indexAdd=0;
             for (int i=0 ;i<text.length();i++)
             {
                   if(text.charAt(i)==(space)) count++; 
             }
             String [] words=new String [count];
             for (int i =0;i<text.length();i++)
             {
                  if(text.charAt(i) == space)
                  {   
                    word = text.substring(index, i);
                    words[indexAdd]=word;
                    indexAdd++;
                    index = i + 1;
                  }
             }
             return words;
             
         }
         public static boolean compareArrays(String [] builtInSplit,String [] userSplit)
         {
             if (builtInSplit.length != userSplit.length) return false;
             for (int i =0 ;i<builtInSplit.length;i++)
             {
                   if(builtInSplit[i].equals(userSplit[i])) return false;
             }  
             return true;    
         }
         public static void main(String[] args)
         {
                Scanner input = new Scanner(System.in);
                String text;
                
                System.out.print("Enter Text : ");
                text =input.nextLine();
                String[] builtInSplit=text.split(" ");
                String [] userSplit=splitFind(text);
                
                boolean result=compareArrays(builtInSplit,userSplit);
                if(result){System.out.println("Both Splits Are Equal");}
                else{System.out.println("Splits are not equal");}
                
                 
         }
}