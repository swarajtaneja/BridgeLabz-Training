import java.util.Scanner;

public class UnitConverterOne{
    public static double yardsToFeet(double yards)
    {
        double yards2feet =yards* 3;
  	return yards2feet;
    }
    public static double feetToYards(double feet)
    {
        double feet2yards = feet*0.333333;
  	return feet2yards;		
    }
    public static double meterToInches(double meter)
    {
         double meters2inches = meter*39.3701;
         return meters2inches ; 
    }
    public static double inchesToMeters(double inches)
    {
         double inches2meters = inches*0.0254;
         return inches2meters;
    }
    public static double inchesToCm(double inches)
    {
         double inches2cm = inches*2.54;
         return inches2cm;
    }

    public static void main(String [] args){
  	Scanner input = new Scanner(System.in);
        

	System.out.print("Enter Yards: ");
	double yards = input.nextDouble();
	System.out.print("Enter Feet : ");
	double feet = input.nextDouble();
	System.out.print("Enter Meter: ");
	double meter = input.nextDouble();
	System.out.print("Enter Inches for meter : ");
	double inches = input.nextDouble();
        System.out.print("Enter Inches for cm : ");
	double inches1 = input.nextDouble();
	
        UnitConverterOne obj = new UnitConverterOne();
        
        System.out.println(yards+" yards is equal to "+obj.yardsToFeet(yards)+" feet"); 
        System.out.println(feet+" feet is equal to "+obj.feetToYards(feet)+" yards");
        System.out.println(meter+" meter is equal to "+obj.meterToInches(meter)+" inches");
        System.out.println(inches+" inches is equal to "+obj.inchesToMeters(inches)+" meter");
        System.out.println(inches1+" inches is equal to "+obj.inchesToCm(inches1)+" cm");
                                            }
                                  }