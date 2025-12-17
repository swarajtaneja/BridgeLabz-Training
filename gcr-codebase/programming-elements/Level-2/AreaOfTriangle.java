import java.util.Scanner;
public class AreaOfTriangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         

        double base = input.nextDouble();
        double height = input.nextDouble();

        //Calculating the area of triangle.
        double areaInCm = 0.5 * base * height ;
        //converting it into sq inches.
        double areaInInches = areaInCm / (2.54 * 2.54);


        System.out.println("The Area of the triangle in sq in is " + areaInInches + " and sq cm is " + areaInCm);  
                                          }
                }