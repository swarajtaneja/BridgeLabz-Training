import java.util.Scanner;

public class LeapYearFind{
    public static boolean leapYear(int year)
    {
             if ((year % 4==0 && year%100!=0) || (year % 400==0)){
                    return true;
                                                   } 
             else{return false;}
    }

    public static void main(String [] args){
  	Scanner input = new Scanner(System.in);
 
	System.out.print("Enter Year: ");
	int year = input.nextInt();
	
	LeapYearFind obj =new LeapYearFind();
        boolean result = obj.leapYear(year);
	
	if(result)
                {
                    System.out.println("It's a Leap Year");
                }
         else
                {
                     System.out.println("Not a Leap Year");
                } 
                   
                                            }
                                  }