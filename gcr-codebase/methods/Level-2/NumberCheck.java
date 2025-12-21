import java.util.Scanner;

public class NumberCheck{
    public static String isPositive(int number)
    {
	if(number > 0)
        {   return "positive"; }
         
	else
	   { return "negative"; }
    }
    public static String isEven(int number)
    {
	if(number%2== 0)
	{
	   return "Even";
	}	
	return "Odd";
    }
    
    public static int compare(int number1, int number2)
    {
	if(number1 > number2) 
  	{
               return 1;
        }
	else if(number1 == number2)
	{
             return 0;
	}
        else
        {
	    return -1;
        }
    }

    public static void main(String args[]) {
  	Scanner input = new Scanner(System.in);

	int[] array = new int[5];
	for(int i=0; i<5; i++)
	{
	    System.out.print("Enter Numbers :  ");
	    array[i] = input.nextInt();
	}	
	
	for(int i=0; i<5; i++)
	{
	    String result1 = isPositive(array[i]);
            String result2= isEven(array[i]);
	    System.out.println("Number " + array[i] + " is " + (result1)+" and " +result2);
	}	
	int result3 = compare(array[0], array[4]);
 	if(result3 == 1)
	    System.out.println(array[0] + " is greater");
	else if(result3 == -1)
	    System.out.println(array[0] + " is lesser");
	else
	    System.out.println(array[0] + "Both are equal");


                                            }
                          }