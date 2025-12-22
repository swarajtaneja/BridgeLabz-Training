import java.util.Scanner;
public class ArrayIndexOutOfBoundsExceptionCheck
{
         public static void generateTheException(String [] names)
         {
           try
           {
               System.out.println(names[4]);
           }
           catch(ArrayIndexOutOfBoundsException e)
           {
                System.out.println("Exception Found :"+e.getMessage());
           }
           
         }
         public static void handlingTheException(String [] names)
         {

            try
            {
                    System.out.println(names[4]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Exception Handled");
            }
                                                           }    
                                                 
         public static void main(String[] args)
         {
                Scanner input=new Scanner(System.in);
                
                String [] names=new String[3];
                for(int i=0;i<3;i++)
                {
                  System.out.print("Enter Name : ");
                  names[i]=input.next();      
                }
                generateTheException(names);
                handlingTheException(names);
         }
}