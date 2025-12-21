import java.util.Scanner;
public class SmallestAndLargest{
         public static int[] smallestAndLargest(int number1, int number2, int number3){
                        int smallest,largest;
                        int [] resultArray=new int[2];
                        
                        if(number1>number2 && number1>number3){largest=number1;}
                        else if (number2>number1 && number2 >number3){largest=number2;}
                        else{largest=number3;}
                        resultArray[0]=largest;

                        if(number1<number2 && number1<number3){smallest=number1;}
                        else if (number2<number1 && number2 <number3){smallest=number2;}
                        else{smallest=number3;}
                        resultArray[1]=smallest;
                      
                        return resultArray;

                                                   }
         public static void main(String[] args){
                Scanner input = new Scanner(System.in);


                System.out.print("Enter Number 1 : ");
                int number1 = input.nextInt();
                System.out.print("Enter Number 2 : ");
                int number2 = input.nextInt();
                System.out.print("Enter Number 3 : ");
                int number3 = input.nextInt();
              
                SmallestAndLargest obj = new SmallestAndLargest();
                int[] resultArray = obj.smallestAndLargest(number1,number2,number3);
                System.out.println("Largest number is: " + resultArray[0]);
	        System.out.print("Smallest number is: " + resultArray[1]);  
                                               }
                           }