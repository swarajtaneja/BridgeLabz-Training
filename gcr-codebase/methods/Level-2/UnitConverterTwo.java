import java.util.Scanner;

public class UnitConverterTwo{
    public static double fahrenheitToCelsius(double fahrenheit)
    {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
  	return fahrenheit2celsius;
    }
    public static double celsiusToFahrenheit(double celsius)
    {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
  	return celsius2fahrenheit;		
    }
    public static double poundsToKg(double pounds)
    {
         double pounds2kilograms =pounds *0.453592;
         return pounds2kilograms ; 
    }
    public static double kgToPounds(double kg)
    {
         double kilograms2pounds =kg* 2.20462;
         return kilograms2pounds;
    }
    public static double gallonsToLiters(double gallons)
    {
         double gallons2liters =gallons* 3.78541; 
         return gallons2liters;
    }
    public static double litersToGallons(double liters)
    {
         double liters2gallons =liters* 0.264172;
         return liters2gallons;
    }

    public static void main(String [] args){
  	Scanner input = new Scanner(System.in);
        

	System.out.print("Enter Fahrenheit : ");
	double fahrenheit = input.nextDouble();
	System.out.print("Enter Celsius : ");
	double celsius = input.nextDouble();
	System.out.print("Enter Pounds: ");
	double pounds = input.nextDouble();
	System.out.print("Enter Kilograms : ");
	double kg = input.nextDouble();
        System.out.print("Enter Gallons : ");
	double gallons = input.nextDouble();
        System.out.print("Enter ILiters : ");
	double liters = input.nextDouble();
	
        UnitConverterTwo obj = new UnitConverterTwo();
        
        System.out.println(fahrenheit+" fahrenheit is : "+obj.fahrenheitToCelsius(fahrenheit)+" celsius"); 
        System.out.println(celsius+" celsius is equal to "+obj.celsiusToFahrenheit(celsius)+" fahrenheit");
        System.out.println(pounds+" pounds is equal to "+obj.poundsToKg(pounds)+" kg");
        System.out.println(kg+" kg is equal to "+obj.kgToPounds(kg)+" pounds");
        System.out.println(gallons+" gallons is equal to "+obj.gallonsToLiters(gallons)+" liters");
        System.out.println(liters+" liters is equal to "+obj.litersToGallons(liters)+" gallons");
                                            }
                                  }