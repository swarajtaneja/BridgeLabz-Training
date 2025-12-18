import java.util.Scanner;

public class MultiplicationTable{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = input.nextInt();

        if(number > (-1)){
            if(number >=6 && number <=9){
                     for(int i=1;i<=10;i++){
                          System.out.println(number+" * "+i+" = " +(number*i));
                            }
                          }
            else{
                    System.out.println("The Table number is not in the range");
                    }
                                        }
        else{
            System.out.println("The Number "+number+" is not a natural number");
            }
                                          }
                              }