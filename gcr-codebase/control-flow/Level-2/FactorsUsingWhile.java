import java.util.Scanner;

public class FactorsUsingWhile{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i=1;

        System.out.print("Enter Positive Integer : ");
        int number = input.nextInt();

        if(number>=0){
              System.out.print("The Factors of Number "+number+" is : ");
              while(i < number+1){
                  if(number%i==0){
                      System.out.print(i+"  ");
                                  }
                   i++;
                                          }
                     }
        else{
            System.out.println("Not a positive integer");
             }

                                        }
                         }