import java.util.Scanner;

public class BMICalculator {


        public static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100.0;

            double bmi = weight / (heightM * heightM);
            String status;

            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

   
        public static void displayResult(String[][] result) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s%n",
                    result[i][0], result[i][1], result[i][2], result[i][3]);
        }
    }

   
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        
        double[][] data = new double[10][2];

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.print("\nPerson " + (i + 1) + " Weight (kg): ");
            data[i][0] = input.nextDouble();

            System.out.print("Person " + (i + 1) + " Height (cm): ");
            data[i][1] = input.nextDouble();
        }

      
        String[][] result = calculateBMI(data);
        displayResult(result);

    }
}
