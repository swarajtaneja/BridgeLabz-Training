import java.util.Scanner;
public class NumberGuess
{
         public static int generateNumber()
         {
               int randomNumber=(int)(Math.random()*100)+1;
               return randomNumber;
         }

         public static void main(String[] args)
         {
               Scanner input=new Scanner(System.in);  
               int number=generateNumber();
               int attempts=0;
               String feedBack="";
               System.out.print("Guess number between 1 to 100  :");
               while(!feedBack.equals("correct"))
               {
                    int inputNumber=input.nextInt();
                    if(inputNumber==number) 
                    {
                         System.out.println(inputNumber+" is correct");
                         feedBack="correct";
                    } 
                    else if(inputNumber>number)
                    {
                         System.out.println(inputNumber+" is high");
                         if(attempts==5)
                               {
                                        System.out.println("Game Over");
                                        break;
                               }
                         System.out.print("Enter Again : ");
                         feedBack="high";

                    }
                    else
                    {
                         System.out.println(inputNumber+" is low");
                         if(attempts==5)
                               {
                                        System.out.println("Game Over");
                                        break;
                               }
                         System.out.print("Enter Again : ");
                         feedBack="low";
                    }
                    attempts++;

               }
               
         }
}