import java.util.Scanner;

public class PowerUsingWhileLoop{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i=1;

        System.out.print("Enter Positive Number : ");
        int number = input.nextInt();

        System.out.print("Enter Power : ");
        int power = input.nextInt();
        int result=1;

        if(number>0){
              System.out.print("The Power of Number "+number+" is : ");
              
              while(i<=power){
                  result*=number;
                  i++;
                                          }  
              System.out.print(result);  
                                   }
        else{
            System.out.println("Not a positive integer");
             }

                                        }
                         }