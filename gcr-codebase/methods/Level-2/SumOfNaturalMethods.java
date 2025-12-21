import java.util.Scanner;

public class SumOfNaturalMethods{
    public static int sumUsingRec(int number)
    {
	if(number == 1)
	    {
               return 1;
            }
		
     	return number + sumUsingRec(number-1);
    }
    
    public static int sumFormulae(int number)
    {
	int n=number * (number+1)/2 ;
		
     	return n;
    }

    public static void main(String args[]){
  	Scanner input = new Scanner(System.in);
 
	System.out.print("Enter Number: ");
	int number = input.nextInt();
	
	SumOfNaturalMethods obj =new SumOfNaturalMethods();
	System.out.println("Sum of Naturals no. using Recursion: " + obj.sumUsingRec(number));
	System.out.println("Sum of Naturals no. using Recursion: " + obj.sumFormulae(number));
	if((obj.sumUsingRec(number))==(obj.sumFormulae(number)))
       {
              System.out.println("The Computation Is Correct");  
       }
                                            }
                                  }