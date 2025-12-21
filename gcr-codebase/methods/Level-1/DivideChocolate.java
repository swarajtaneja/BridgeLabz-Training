import java.util.Scanner;
public class DivideChocolate{
         public static int[] divideChocolate(int numberOfChocolates, int numberOfStudents){
                        int remainder,quotient;
                        int [] resultArray=new int[2];
                        
                        remainder=numberOfChocolates % numberOfStudents;
                        quotient=numberOfChocolates / numberOfStudents;

                        resultArray[0]=remainder;
                        resultArray[1]=quotient;
                        return resultArray;

                                                                                }
         public static void main(String[] args){
                Scanner input = new Scanner(System.in);


                System.out.print("Enter Number of Chocolates : ");
                int numberOfChocolates = input.nextInt();
                System.out.print("Enter Number Of Students : ");
                int numberOfStudents = input.nextInt();
              
                DivideChocolate obj = new DivideChocolate();
                int[] resultArray = obj.divideChocolate(numberOfChocolates,numberOfStudents);

                System.out.println("Remaining Chocolates : " + resultArray[0]);
	        System.out.print("Each Student Got : " + resultArray[1]+" chocolates");  
                                               }
                           }