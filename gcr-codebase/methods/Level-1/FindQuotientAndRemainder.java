import java.util.Scanner;
public class FindQuotientAndRemainder{
         public static int[] findQuotientAndRemainder(int number, int divisor){
                        int quotient,remainder;
                        int [] resultArray=new int[2];
                        
                        remainder=number%divisor;
                        quotient=number/divisor;

                        resultArray[0]=remainder;
                        resultArray[1]=quotient;
                        return resultArray;

                                                                                }
         public static void main(String[] args){
                Scanner input = new Scanner(System.in);


                System.out.print("Enter Number : ");
                int number = input.nextInt();
                System.out.print("Enter Divisor : ");
                int divisor = input.nextInt();
              
                FindQuotientAndRemainder obj = new FindQuotientAndRemainder();
                int[] resultArray = obj.findQuotientAndRemainder(number,divisor);

                System.out.println("Remainder is: " + resultArray[0]);
	        System.out.print("Quotient is: " + resultArray[1]);  
                                               }
                           }