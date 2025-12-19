import java.util.Scanner;

public class MultipleUsingForLoop{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        

        System.out.print("Enter Positive Number : ");
        int number = input.nextInt();

        if(number>0 && number<100){
              System.out.print("The Multiples of Number "+number+" is : ");
              
              for(int i=number-1;i>1;i--){
                  if(number%i==0){
                      System.out.print(i+"  ");
                                  }
                  else{continue;}
                                          }    
                                   }
        else{
            System.out.println("Not a positive integer");
             }

                                        }
                         }