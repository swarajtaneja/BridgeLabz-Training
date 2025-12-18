import java.util.Scanner;

public class SumOfNatNum{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0, number, n;

        System.out.print("Enter Number : ");
        number = input.nextInt();
        n = number*(number + 1) / 2;     
        
        if(number > (-1))  {
             while(number>0){   
                 sum+=number;
                 number--;
                            }
             if(sum == n){
                 System.out.println("The result From both computations was correct");
                         }
                            }
        else{
            System.out.println("The number " + number + " is not a natural number");
            }
        
                                          }
                              }