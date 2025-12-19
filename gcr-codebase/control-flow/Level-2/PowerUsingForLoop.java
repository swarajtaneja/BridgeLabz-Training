import java.util.Scanner;

public class PowerUsingForLoop{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        

        System.out.print("Enter Positive Number : ");
        int number = input.nextInt();

        System.out.print("Enter Power : ");
        int power = input.nextInt();
        int result=1;

        if(number>0){
              System.out.print("The Power of Number "+number+" is : ");
              
              for(int i=1;i<=power;i++){
                  result*=number;
                                          }  
              System.out.print(result);  
                                   }
        else{
            System.out.println("Not a positive integer");
             }

                                        }
                         }