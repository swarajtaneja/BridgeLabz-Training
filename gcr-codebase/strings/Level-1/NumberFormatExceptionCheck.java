import java.util.Scanner;
public class NumberFormatExceptionCheck{
         public static void generateTheException(String str){
           try
           {
               System.out.println(Integer.parseInt(str));
           }
           catch(NumberFormatException e)
           {
                System.out.println("Exception Found :"+e.getMessage());
           }
           
                                                 }
         public static void handlingTheException(String str){

            try{
                    System.out.println(Integer.parseInt(str));
               }
            catch(NumberFormatException e)
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