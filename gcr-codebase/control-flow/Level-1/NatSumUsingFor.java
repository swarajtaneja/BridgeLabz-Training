import java.util.Scanner;

public class NatSumUsingFor{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0, number, n;

        System.out.print("Enter Number : ");
        number = input.nextInt();
        n = number*(number + 1) / 2;     
        
        for(int i = number;i>0;i--){   
            sum+=i;
                   }
        if(sum == n){
         System.out.println("The result From both computations was correct");
                    }
                                          }
                              }