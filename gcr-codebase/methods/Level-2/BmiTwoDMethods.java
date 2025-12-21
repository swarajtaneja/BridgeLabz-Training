import java.util.Scanner;

public class BmiTwoDMethods {
    public static double bmiOfPeople(double weight,double height)	
    { 
        double bmi=weight / (height*height);
	return bmi;
	
    }
    public static String weightStatus(double bmi)	
    { 
             if (bmi<=18.4){
                    return "Underweight";
                                                                 } 
             else if (bmi>=18.5 && bmi<=24.9){
                    return "Normal";
                                                                 }
             else if (bmi>=25.0 && bmi<=39.9){
                    return "Overweight";
                                                                 }
             else{
                    return "Obese";
                                                                 } 
    }

    public static void main(String args[]) {
        Scanner input =new Scanner(System.in);
	
	int number =10;
	double[][] personData = new double[number][3];
        String [] weightStatusArray = new String[number];
	
	for(int i=0;i<10;i++)
        {
             System.out.print("Enter weight Of Person : ");
              personData[i][0] = input.nextDouble();
              System.out.print("Enter height in meter : ");
              personData[i][1] = input.nextDouble();
              double bmi = bmiOfPeople(personData[i][0],personData[i][1]); 
              personData[i][2] = bmi;
              weightStatusArray[i]=weightStatus(bmi);
           
        }
        for(int i =0;i<number;i++)
        {
       
             System.out.println("The Person Height : "+personData[i][0]+" Weight : "+personData[i][1]+" BMI : "+personData[i][2]+" Status : "+weightStatusArray[i]);
        }
                                            }
                                 }