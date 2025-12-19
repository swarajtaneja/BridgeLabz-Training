import java.util.Scanner;

public class GreatestFactorWhileLoop{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int store=1,i=1;

        System.out.print("Enter Positive Number : ");
        int number = input.nextInt();

        if(number>=0){
              
              while(i<number){
                  if(number%i==0){
                      if(i>store){
                        store=i;
                           } 
                                  }
                   i++;
                                          }
              System.out.print("The Greatest Factor of Number "+number+" is : "+store);
                     }
        else{
            System.out.println("Not a positive integer");
             }

                                        }
                         }