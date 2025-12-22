import java.util.Scanner;
public class CompareSubStrings{
         public static String createSubStrings(String str1,int start,int end){
                 String resultString="";
                 for(int i=start;i<end;i++)
                 {
                     resultString+=str1.charAt(i); 
                 }
                 return resultString ;

                                                                                }
         public static boolean compareSubStrings(String subString,String resultString){
                 if (subString.equals(resultString))
                 {
                     return true;
                 }
                 return false;

                                                                                }
         public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                String str1,subString,resultString;
                
                System.out.print("Enter String : ");
                str1 =input.next();
                System.out.print("Enter Start Index : ");
                int start =input.nextInt();
                System.out.print("Enter Ending Index : ");
                int end =input.nextInt();
                  
                
                
                subString= str1.substring(start,end);
                resultString= createSubStrings(str1,start,end);
                boolean result= compareSubStrings(subString,resultString);

                if(result)
                {
                     System.out.println("Both the Substrings are equal :"+subString);
                }
                else
                {
                     System.out.println("Both the Substrings are not equal");
                }

                                               }
                           }