import java.util.Scanner;

public class Bmi2DArray{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Number Of Person : ");
        int number = input.nextInt();
        
        double[][] personData = new double[number][3];
        String [] weightStatus = new String[number];
      
        for(int i=0;i<number;i++)
        {
             System.out.print("Enter weight Of Person : ");
              personData[i][0] = input.nextDouble();
              System.out.print("Enter height in meter : ");
              personData[i][1] = input.nextDouble();
              double bmi=personData[i][0] / (personData[i][1]*personData[i][1]);
              personData[i][2] = bmi;
           
        }
        for(int i=0;i<number;i++)
        {
             if (personData[i][2]<=18.4){
                    weightStatus[i]="Underweight";
                                                                 } 
             else if (personData[i][2]>=18.5 && personData[i][2]<=24.9){
                    weightStatus[i]="Normal";
                                                                 }
             else if (personData[i][2]>=25.0 && personData[i][2]<=39.9){
                    weightStatus[i]="Overweight";
                                                                 }
             else{
                    weightStatus[i]="Obese";
                                                                 } 
             
        }
        for(int i =0;i<number;i++)
        {
       
             System.out.println("The Person Height : "+personData[i][0]+" Weight : "+personData[i][1]+" BMI : "+personData[i][2]+" Status : "+weightStatus[i]);
        }

                                         }
                                 }