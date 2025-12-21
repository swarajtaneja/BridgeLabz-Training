import java.util.Scanner;
public class SumOfNaturalNumber{
         public static int naturalNumber(int number){

                        int n = number * (number+1)/2;
                        return n;

                                                   }
         public static void main(String[] args){
                Scanner input = new Scanner(System.in);


                System.out.print("Enter Number : ");
                int number = input.nextInt();
              
                SumOfNaturalNumber obj = new SumOfNaturalNumber();
                System.out.println("The sum of " + number + " natural numbers is " + obj.naturalNumber(number));   
                                               }
                           }