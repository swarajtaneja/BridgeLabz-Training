import java.util.Scanner;
public class StringIndexOutOfBoundsExceptionCheck{
         public static void generateTheException(String str){
           try
           {
               System.out.println(str.charAt(str.length()+1));
           }
           catch(StringIndexOutOfBoundsException e)
           {
                System.out.println("Exception Found :"+e.getMessage());
           }
                                                 }
         public static void handlingTheException(String str){

            try{
                    System.out.println(str.charAt(str.length()+1));
               }

            catch(StringIndexOutOfBoundsException e)
            {
                 System.out.println("Exception Handled");
            }
                                                  }    
                                                 
         public static void main(String[] args){
                Scanner input=new Scanner(System.in);
                System.out.print("Enter String : ");
                String str=input.next();
                generateTheException(str);
                handlingTheException(str);
                                               }
                           }