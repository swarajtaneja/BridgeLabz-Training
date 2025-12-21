import java.lang.Math;
import java.util.Scanner;
public class TrigonometricFunction{
         public double[] calculateTrigonometricFunctions(double angle){
                 double [] resultArray= new double[3];
                 double radians=Math.toRadians(angle);
                 
                 resultArray[0]=Math.sin(radians);
                 resultArray[1]=Math.cos(radians);
                 resultArray[2]=Math.tan(radians);
                 
                 return resultArray;

                                                                        }
         public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                double angle;

                System.out.print("Enter Angle of the Triangle : ");
                angle = input.nextDouble();
              
                TrigonometricFunction obj = new TrigonometricFunction();
                double [] resultArray = obj.calculateTrigonometricFunctions(angle);

                System.out.println("Sine : " + resultArray[0]);
                System.out.println("CoSine : " + resultArray[1]);
                System.out.println("Tangent : " + resultArray[2]); 
                                               }
                           }