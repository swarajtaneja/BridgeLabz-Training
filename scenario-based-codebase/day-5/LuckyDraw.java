// Festival Lucky Draw 
// At Diwali mela, each visitor draws a number.
// If the number is divisible by 3 and 5, they win a gift.
// Use if, modulus, and loop for multiple visitors.
// continue if input is invalid.


import java.util.Scanner;

public class LuckyDraw
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	while(true)
	{
	    int random = (int)(Math.random() * 100);
	    System.out.print("Do you want to Draw a Number ? (yes / no) : ");
	    String option = input.next();
	    if(option.equals("yes"))
	    {
		System.out.println("Your Number: " + random);
		if((random % 3 == 0) || (random % 5 == 0))
	   	{
		    System.out.println("Congratulations, You Won a Gift.............");
		}
		else
		{
		    System.out.println("You Didn't Won, Better Luck Next Time..");
		}
	    }
	    
	    System.out.print("Do you want to Continue? (yes / no) : ");
	    option = input.next();
	    if(option.equals("no"))
		break;
	}
    }
}