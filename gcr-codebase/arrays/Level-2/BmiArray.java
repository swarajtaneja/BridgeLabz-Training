import java.util.Scanner;

public class BmiArray{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Number Of Person : ");
        int number = input.nextInt();
        
        double[] weight = new double[number];
        double[] heightInMeter = new double[number];
        double[] bmiArray = new double[number];
        String [] weightStatus = new String[number];
      
        for(int i=0;i<number;i++)
        {
              System.out.print("Enter weight Of Person : ");
              weight[i] = input.nextDouble();
              System.out.print("Enter height in meter : ");
              heightInMeter[i] = input.nextDouble();
              double bmi=weight[i] / (heightInMeter[i] * heightInMeter[i]);
              bmiArray[i] = bmi;

        }
        for(int i=0;i<number;i++)
        {
             if (bmiArray[i]<=18.4){
                    weightStatus[i]="Underweight";
                                                                 } 
             else if (bmiArray[i]>=18.5 && bmiArray[i]<=24.9){
                    weightStatus[i]="Normal";
                                                                 }
             else if (bmiArray[i]>=25.0 && bmiArray[i]<=39.9){
                    weightStatus[i]="Overweight";
                                                                 }
             else{
                    weightStatus[i]="Obese";
                                                                 } 
        }
        for(int i =0;i<number;i++)
        {
               System.out.println("The Person Height : "+heightInMeter[i]+" Weight : "+weight[i]+" BMI : "+bmiArray[i]+" Status : "+weightStatus[i]);
        }

                                         }
                                 }