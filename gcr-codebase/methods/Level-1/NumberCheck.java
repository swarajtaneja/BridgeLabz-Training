import java.util.Scanner;
public class NumberCheck{
         public static String check(int number){
                  if(number > 0){
                      return "positive";
                                }
                  else if (number < 0){
                      return "Negative";
                                      }
                 else{
                       return "Zero";
                     }   

                                            }
         public static void main(String[] args){
                Scanner input = new Scanner(System.in);


                System.out.print("Enter Number : ");
                int number = input.nextInt();
              
                NumberCheck obj = new NumberCheck();
                String result = obj.check(number);
                System.out.println("Number " + number + " is : " + result);

                                               }
                           }