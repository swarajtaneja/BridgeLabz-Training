import java.util.Scanner;
public class CompareStrings{
         public static boolean compareStrings(String str1,String str2){
                 if (str1.length()==str2.length())
                 {
                     for(int i=0;i<str1.length();i++)
                     {
                           if(str1.charAt(i)!=str2.charAt(i))
                           {
                            return false;   
                           }
                           else
                           {
                              continue;  
                           }
                           
                     }
                     return true;
                 }
                 return false;

                                                                                }
         public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                String str1,str2;
                
                System.out.print("Enter First String : ");
                str1 =input.next();
                System.out.print("Enter Second String : ");
                str2 =input.next();
                boolean result= compareStrings(str1,str2);

                if(result)
                {
                     System.out.println("Both the strings are equal");
                }
                else
                {
                     System.out.println("Both the strings are not equal");
                }
                                               }
                           }