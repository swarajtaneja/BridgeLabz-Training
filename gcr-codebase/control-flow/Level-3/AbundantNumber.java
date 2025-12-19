import java.util.Scanner;

public class AbundantNumber{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int store=0;

        System.out.print("Enter Positive Number : ");
        int number = input.nextInt();

        if(number>0){
             for(int i =1;i<number;i++){
                  if(number%i==0){
                      store=store+i;
                                  }
                                          }
             if(store>number){
                   System.out.println("The Number "+number+" is Abundant Number");
                             }
             else{
                  System.out.println("The Number "+number+" is not Abundant Number");
                   }
                    }                      
        else{
            System.out.println("Not a positive number");
             }

                                        }
                         }