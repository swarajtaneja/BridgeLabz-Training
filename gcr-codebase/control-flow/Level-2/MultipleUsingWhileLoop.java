import java.util.Scanner;

public class MultipleUsingWhileLoop{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        

        System.out.print("Enter Positive Number : ");
        int number = input.nextInt();
        int counter=number-1;

        if(number>0 && number<100){
              System.out.print("The Multiples of Number "+number+" is : ");
              
              while(counter > 1){
                  if(number%counter==0){
                      System.out.print(counter+"  ");
                                  }
                  counter--;
                  
                                          }    
                                   }
        else{
            System.out.println("Not a positive integer");
             }

                                        }
                         }