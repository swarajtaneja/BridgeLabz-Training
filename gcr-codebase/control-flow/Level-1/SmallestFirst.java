import java.util.Scanner;

public class SmallestFirst{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        int number1 = input.nextInt();

        System.out.print("Enter Number 2 : ");
        int number2 = input.nextInt();

        System.out.print("Enter Number 3 : ");
        int number3 = input.nextInt();
        
        if(number1 < number2){
            if(number1 < number3){
                System.out.println("Is the first number the smallest? " + "Yes");
                                 }
            else{
                System.out.println("Is the first number the smallest? " + "No");
                }
                             }
        else{
            System.out.println("Is the first number the smallest? " + "No");
            }
                                          }
                              }