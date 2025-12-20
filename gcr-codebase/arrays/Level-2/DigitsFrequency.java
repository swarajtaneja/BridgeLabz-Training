import java.util.Scanner;

public class DigitsFrequency{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int count=0,index=0;

        System.out.print("Enter Number : ");
        int number = input.nextInt();

        int actual=number;
        int digit;
        
        while (number != 0)
        {
            count++;
            number /= 10;
        }
        int [] digitsArray=new int[count];
        number =actual;
        while (number != 0)
	{ 
             if(index==count)break;
    	     digit = number % 10;
   	     digitsArray[index++] = digit;
    	     number /= 10;

	}
        int [] frequency=new int[10];
        for(int i=0;i<digitsArray.length;i++)
        {
             frequency[digitsArray[i]]++;
        }   
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++)
        {
            if (frequency[i] > 0)
            {
                System.out.println("Digit " + i + " comes " + frequency[i] + " times");
            }
        }
                                          }
                                 }