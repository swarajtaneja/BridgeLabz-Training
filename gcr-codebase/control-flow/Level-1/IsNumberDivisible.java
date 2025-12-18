import java.util.Scanner;

public class IsNumberDivisible{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = input.nextInt();
        
        if((number % 5) == 0){
            System.out.println("Is the number " + number + " divisible by 5? " + "Yes");
                             }
        else{
             System.out.println("Is the number " + number + " divisible by 5? " + "No");
            }
        
                                          }
                              }