import java.util.Scanner;

public class DigitsCounter{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int actual,count=0;

        System.out.print("Enter Positive Number : ");
        int number = input.nextInt();
        actual = number;

        if(number>0){
             while(number!=0){
                 count++;
                 number=number/10;
                            }
             System.out.println("Total Digits: "+count);
                    }                      
        else{
            System.out.println("Not a positive number");
             }

                                        }
                         }