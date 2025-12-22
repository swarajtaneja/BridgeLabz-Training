import java.util.Scanner;
public class ConvertToLowerCase
{
         public static String returnUperCase(String str1)
         {
                 String result="";
                 
                 for(int i=0;i<str1.length();i++)  
                 {
                     char ch =str1.charAt(i);
                     if (ch>='A' && ch<='Z')
                     {
                         ch=(char)(ch+32);
                     }
                     result+=ch;
                 }  
                  return result;
         }
         public static boolean compareSubStrings(String resString,String resultString )
         {
                if (resString.length()==resultString.length())
                 {
                     for(int i=0;i<resString.length();i++)
                     {
                           if(resString.charAt(i)!=resultString.charAt(i))
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
         public static void main(String[] args)
         {
                Scanner input = new Scanner(System.in);
                String str1,resString,resultString;
                
                
                System.out.print("Enter String : ");
                str1 =input.next();
                
                
                
                resString= str1.toLowerCase();
                resultString=returnUperCase(str1);
                boolean result= compareSubStrings(resString,resultString);

                if(result)
                {
                     System.out.println("Both the UpeerCase Strings are equal ");
                }
                else
                {
                     System.out.println("Both the UpeerCase Strings are not equal");
                }

         }
}