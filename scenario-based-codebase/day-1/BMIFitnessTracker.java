import java.util.Scanner;

public class BMIFitnessTracker {
    // Create a method named bmiCalculator of double type.
    public static double bmiCalculator(double weight, double height) {
        // created a variable bmi to calculate bmi of a person.
        double bmi = weight / (height * height);
        return bmi;

    }

    // create a method named weightStatus to find status of bmi.
    public static String weightStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Weight in kg : ");
        double weight = input.nextDouble();

        System.out.print("Enter Height in meters : ");
        double height = input.nextDouble();
        System.out.println("The Person Height : " + height + " Weight : " + weight + " BMI : "
                + bmiCalculator(weight, height) + " Status : " + weightStatus(bmiCalculator(weight, height)));
    }
}