import java.util.Scanner;

public class PrimeNumber{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i,store=1;

        System.out.print("Enter Prime Number : ");
        int number = input.nextInt();
        int check = number;

        if(number>1){
             for(i=1;i<=number;i++){
                 if(number%i==0){
                        store*=i;
                     }
                                       }
             if(check==store){
                  System.out.println("The Number "+number+" Prime Number");
                                }
             else{
                  System.out.println("The Number "+number+" is not a Prime Number");
                   }
                   }
                      
        else{
            System.out.println("Number Should be positive and greater than 1");
             }

                                        }
                         }