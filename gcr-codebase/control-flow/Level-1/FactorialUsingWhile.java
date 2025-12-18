import java.util.Scanner;

public class FactorialUsingWhile{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int factorial = 1 ;

        System.out.print("Enter Number : ");
        int number = input.nextInt();
        int i = number;
        if(number > (-1)){
            while(i > 1){   
                factorial*=i;
                i--;
                   }
            System.out.println("The factorial of number "+ number +" is "+ factorial );
                          }
        else{
            System.out.println("The number " + number + " is not a natural number");
            }
        
                                          }
                              }