import java.util.Scanner;
public class IllegalArgumentExceptionCheck{
         public static void generateTheException(String str,int start,int end){
           try
           {
               System.out.println(str.substring(start,end));
           }
           catch(IllegalArgumentException e)
           {
                System.out.println("Exception Found :"+e.getMessage());
           }
           catch(RuntimeException e)
           {
                System.out.println("Exception Found :"+e.getMessage());
           }
                                                 }
         public static void handlingTheException(String str,int start,int end){

            try{
                    System.out.println(str.substring(start,end));
               }
            catch(IllegalArgumentException e)
           {
                System.out.println("Exception Handled");
           }

            catch(RuntimeException e)
            {
                 System.out.println("Exception Handled");
            }
                                                  }    
                                                 
         public static void main(String[] args){
                Scanner input=new Scanner(System.in);
                System.out.print("Enter String : ");
                String str=input.next();
                System.out.print("Enter Start : ");
                int start =input.nextInt();
                System.out.print("Enter String : ");
                int end =input.nextInt();
                generateTheException(str,start,end);
                handlingTheException(str,start,end);
                                               }
                           }