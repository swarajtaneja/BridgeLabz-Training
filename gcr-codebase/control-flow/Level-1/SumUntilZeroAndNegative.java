import java.util.Scanner;

public class SumUntilZeroAndNegative{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double total =0.0;

        System.out.print("Enter Number : ");
        double number = input.nextDouble();
             
        while(true){   
            if(number<=0)break;
            total = total + number; 
            System.out.print("Enter Number : ");
            double number1 = input.nextDouble();
            number = number1;
                   }
         System.out.println("Sum : "+total);
                                          }
                              }