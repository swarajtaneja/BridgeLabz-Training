import java.util.Scanner;

public class InputDiscountedFee{

    public static void main(String[] args){
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
         
        //Taking Student Fee Details as input.
        int fee = input.nextInt();

        //Taking University discount Details as input.
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) /100;
        
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (fee - discount));  
                                          }
                }