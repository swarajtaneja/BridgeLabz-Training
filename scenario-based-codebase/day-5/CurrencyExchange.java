//Currency Exchange Kiosk
//Design a currency converter:
//Take INR amount and target currency.
//Use a switch to apply the correct rate.
//Ask if the user wants another conversion (do-while).




import java.util.Scanner;
public class CurrencyExchange
{
   
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
	do
	{
	    double amount;
	    int option;
	    System.out.println("--------Exchange Currency From INR to (Dollars / EURO / Rial / Yuan) -------");
	    System.out.print("Enter Amount in INR: ");
	    amount = input.nextDouble();
	    while(amount <= 0)
	    {
		System.out.println("Invalid Amount");
		System.out.print("Enter Amount Again in INR: ");
	    	amount = input.nextDouble();
	    }
	    System.out.println("Enter Currency to convert: (1-Dollars / 2-EURO / 3-Rial / 4-Yuan)");
	    option = input.nextInt();
	    double dollars = 89.84;
	    double euro = 105.35;
	    double rial = 468.55;
	    double yuan = 12.86;
	
	    double convertAmount = 0;
	    switch(option)
	    {
		case 1:
		    convertAmount = (amount / dollars);
		    break;
		case 2:
		    convertAmount = (amount / euro);
		    break;
		case 3:
		    convertAmount = (amount * rial);
		    break;
		case 4:
		    convertAmount = (amount / yuan);
		    break;    
	    }
	    System.out.println("Converted Amount : " + convertAmount);
	    System.out.print("(restart / exit): ");
	    String task;
	    task = input.next();
	    if(task.equals("exit"))
		break;   
	}while(true);
    }
}