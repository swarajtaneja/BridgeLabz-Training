import java.util.Scanner;

public class Factorial{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int factorial = 1 ;

        System.out.print("Enter Number : ");
        int number = input.nextInt();
        
        for(int i = number;i>0;i--){   
            factorial*=i;
                   }
        System.out.println("The factorial of number "+ number +" is "+ factorial );
                                          }
                              }