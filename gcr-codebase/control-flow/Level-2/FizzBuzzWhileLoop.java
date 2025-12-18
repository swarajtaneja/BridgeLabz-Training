import java.util.Scanner;

public class FizzBuzzWhileLoop{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i=1;

        System.out.print("Enter Number : ");
        int number = input.nextInt();

        if(number > (0)){
          while(i<=number){
            if(i%3==0 && i%5==0){
                    System.out.println("FizzBuzz");     
                          }
            else if(i%3==0) {
                    System.out.println("Fizz");
                    }
            else if (i%5==0){
                    System.out.println("Buzz");
                    }
            else{
                    System.out.println(i);
                 }  
             i++;
                          }
                                        }
        else{
            System.out.println("The Number "+number+" is not a positive integer");
            }
                                          }
                              }