import java.util.Scanner;
public class StringLength{
         public static int lengthFind(String str1){
                 int count=0;
                 try
                 {
                     for(int i=0; ;i++)
                     {
                           str1.charAt(i);
                           count++;
                     }
                 }
                 catch (Exception e)
                 {
                    return count;    
                 }

                                                                                }
         public static void main(String[] args)
         {
                Scanner input = new Scanner(System.in);
                String str1;
                
                System.out.print("Enter String : ");
                str1 =input.next();
                
                int result= str1.length();

                System.out.println("User Defined:"+lengthFind(str1));
                System.out.println("Built-In :"+result);
         }
}