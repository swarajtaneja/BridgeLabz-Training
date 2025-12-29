//A shopkeeper gives discounts based on total bill:
//Input item prices in a for-loop.
//Use if-else for discount logic.
//Use proper indentation, constants, and comments.

import java.util.Scanner;
public class ShoppingDiscount
{
         public static void main(String[] args)
         {
               Scanner input =new Scanner(System.in);
               String task="";
               System.out.print("(start / exit) : ");
               task = input.next();
               while(!task.equals("exit"))
               {
                     double totalAmount=0; 
                     for(int i=0;true;i++)
                     {
                          System.out.print("Enter Item Price(0 for end item) : ");
                          double item=input.nextDouble();
                          if(item>0)
                          {
                               totalAmount+=item;  
                          }
                          else{break;}
                     }
                     System.out.print("Enter Discount % : ");
                     double discount=input.nextDouble();
                     double discountedAmount=(totalAmount*discount)/100;
                     double discountedBill=totalAmount-discountedAmount;
                     System.out.println("Total Bill : "+totalAmount+" and Total Bill After Discount : "+discountedBill);
                     System.out.print("(start / exit) : ");
                     task = input.next();
               }
         }
}