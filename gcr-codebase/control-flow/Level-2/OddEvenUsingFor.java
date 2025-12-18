import java.util.Scanner;

public class OddEvenUsingFor{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int initial = 1 ;

        System.out.print("Enter Number : ");
        int number = input.nextInt();
        if(number > (-1)){
            for(int i = 1; i<number+1;i++){
                if(i%2==0){
                     System.out.println("The Number "+i+" is even.");
                          }
                else{
                    System.out.println("The Number "+i+" is odd.");
                    }
                                        }
           
                          }
        else{
            System.out.println("The number " + number + " is not a natural number");
            }
                                          }
                              }