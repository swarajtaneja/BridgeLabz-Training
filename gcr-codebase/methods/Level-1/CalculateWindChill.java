import java.util.Scanner;
public class CalculateWindChill{
         public double calculateWindChill(double temperature, double windSpeed){
                 double windChill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed, 0.16);
                 return windChill;

                                                                                }
         public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                double temperature,windSpeed,result;

                System.out.print("Enter Temperature : ");
                temperature = input.nextDouble();
                System.out.print("Enter Number Of Windspeed : ");
                windSpeed = input.nextDouble();
              
                CalculateWindChill obj = new CalculateWindChill();
                result = obj.calculateWindChill(temperature,windSpeed);

                System.out.println("The wind chill temperature: " + result); 
                                               }
                           }