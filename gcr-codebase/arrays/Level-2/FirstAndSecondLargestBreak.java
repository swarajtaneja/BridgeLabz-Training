import java.util.Scanner;

public class FirstAndSecondLargestBreak{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

         int maxDigit=10,index=0,largest=0,secondLargest=-1;

         System.out.print("Enter Number : ");
         long number = input.nextLong();

         int [] digitsArray=new int[10];
         long actual=number;
         int digit;
          
         while(number!=0)
         {
             digit=(int)number%10;
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
    	     if(index==maxDigit)
                break;
    	     digit = (int)number % 10;
   	     digitsArray[index++] = digit;
    	     number /= 10;

    	     if (digit > secondLargest && digit != largest)
       		 secondLargest = digit;
	}
         
	System.out.println("The largest Element is: " + largest);
       	System.out.println("The second largest Element is: " + secondLargest);
                                          }
                                 }