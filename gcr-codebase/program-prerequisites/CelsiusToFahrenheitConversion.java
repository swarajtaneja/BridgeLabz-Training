import java.util.Scanner;

public class CelsiusToFahrenheitConversion {
    public static void main(String args[]){

        System.out.print("Enter temprature in celsius: ");
        
        Scanner sc = new Scanner(System.in);
        float tempInCelsius = sc.nextInt();
        
        float fahrenheit = (tempInCelsius * 9/5) + 32;
        System.out.print(fahrenheit);
        
    }
}
