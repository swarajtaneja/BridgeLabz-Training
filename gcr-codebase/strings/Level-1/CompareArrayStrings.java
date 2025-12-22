import java.util.Scanner;
public class CompareArrayStrings{
         public static char[] characterReturn(String str1){
                 int size =str1.length();
                 char[] strArray= new char[size];
                 for(int i=0;i<size;i++)  
                 {
                    strArray[i]=  str1.charAt(i);  
                 }  
                  return strArray;
                                                                                }
         public static boolean compareSubStrings(char [] stringArray,char []resultArray ){
                for(int i=0;i<resultArray.length;i++)
                {
                   if(stringArray[i]!=resultArray[i]){return false;}  
                } 
                return true;  
                                                                                }
         public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                String str1;
                char [] stringArray;
                char [] resultArray;
                
                System.out.print("Enter String : ");
                str1 =input.next();
                
                
                
                stringArray= str1.toCharArray();
                resultArray=characterReturn(str1);
                boolean result= compareSubStrings(stringArray,resultArray);

                if(result)
                {
                     System.out.println("Both the Substrings Arrays are equal ");
                }
                else
                {
                     System.out.println("Both the Substrings Array are not equal");
                }

                                               }
                           }