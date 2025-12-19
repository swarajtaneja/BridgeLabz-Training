import java.util.Scanner;

public class Armstrong{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int actual,store=0;

        System.out.print("Enter Positive Number : ");
        int number = input.nextInt();
        actual = number;

        if(number>0){
             while(number!=0){
                 int newNumber=number%10;
                 int cube=(newNumber*newNumber*newNumber);
                 store=store+cube;
                 number=number/10;
                            }
             if(actual==store){
                   System.out.println("The Number "+actual+" is Armstrong");
                             }
             else{
                  System.out.println("The Number "+actual+" is not Armstrong");
                   }
                    }                      
        else{
            System.out.println("Not a positive number");
             }

                                        }
                         }