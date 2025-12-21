import java.util.Scanner;

public class UnitConverter{
    public static double kmToMiles(double km)
    {
        double km2miles = km*0.621371;
  	return km2miles;
    }
    public static double milesToKm(double miles)
    {
        double miles2km =miles* 1.60934;
  	return miles2km;		
    }
    public static double meterToFeet(double meter)
    {
         double meters2feet = meter *3.28084;
         return meters2feet; 
    }
    public static double feetToMeter(double feet)
    {
         double feet2meters = feet*0.3048;
         return feet2meters;
    }

    public static void main(String [] args){
  	Scanner input = new Scanner(System.in);
        

	System.out.print("Enter Kilometer: ");
	double km  = input.nextDouble();
	System.out.print("Enter Miles : ");
	double miles = input.nextDouble();
	System.out.print("Enter Meter: ");
	double meter = input.nextDouble();
	System.out.print("Enter Feet: ");
	double feet = input.nextDouble();
	
        UnitConverter obj = new UnitConverter();
        
        System.out.println(km+" kilometer is equal to "+obj.kmToMiles(km)+" miles"); 
        System.out.println(miles+" miles is equal to "+obj.milesToKm(miles)+" kilometer");
        System.out.println(meter+" meter is equal to "+obj.meterToFeet(meter)+" feet");
        System.out.println(feet+" feet is equal to "+obj.feetToMeter(feet)+" meter");
                                            }
                                  }