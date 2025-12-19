import java.util.Scanner;

public class HarshadNumber{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int actual,store=0;

        System.out.print("Enter Positive Number : ");
        int number = input.nextInt();
        actual = number;

        if(number>0){
             while(number!=0){
                 int newNumber=number%10;
                 store=store+newNumber;
                 number=number/10;
                            }
             if(actual%store==0){
                   System.out.println("The Number "+actual+" is Harshad Number");
                             }
             else{
                  System.out.println("The Number "+actual+" is not Harshad Number");
                   }
                    }                      
        else{
            System.out.println("Not a positive number");
             }

                                        }
                         }