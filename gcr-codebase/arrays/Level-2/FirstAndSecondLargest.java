import java.util.Scanner;

public class FirstAndSecondLargest{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

         int maxDigit=10,index=0,largest=0,secondLargest=-1;

         System.out.print("Enter Number : ");
         int number = input.nextInt();

         int [] digitsArray=new int[maxDigit];
         int actual=number;
         int digit;
          
         while(number!=0)
         {
             digit=number%10;
             number =number/10;

             if (digit>largest)
             {
                 largest=digit;
             }

             
         } 
         int size=digitsArray.length;
        number=actual;
        while (number != 0)
	{
    	
    	     digit = number % 10;
   	     digitsArray[index++] = digit;
    	     number /= 10;

    	     if (digit > secondLargest && digit != largest)
       		 secondLargest = digit;
	}
         
	System.out.println("The largest Element is: " + largest);
       	System.out.println("The second largest Element is: " + secondLargest);
                                          }
                                 }