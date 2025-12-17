import java.util.Scanner;
public class SideFromPerimeter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         

        double perimeter = input.nextDouble();

        //Calculating the side of the square.
        double side = perimeter / 4 ;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);  
                                          }
                }