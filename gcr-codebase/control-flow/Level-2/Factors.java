import java.util.Scanner;

public class Factors{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Positive Integer : ");
        int number = input.nextInt();

        if(number>=0){
              System.out.print("The Factors of Number "+number+" is : ");
              for(int i =1;i<number+1;i++){
                  if(number%i==0){
                      System.out.print(i+"  ");
                                  }
                                          }
                     }
        else{
            System.out.println("Not a positive integer");
             }

                                        }
                         }