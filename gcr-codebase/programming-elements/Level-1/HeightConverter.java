import java.util.Scanner;

public class HeightConverter{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         
        //Taking height Details as input.
        double height = input.nextInt();

        //Converting the height into inches.
        double heightInInches = height / 2.54;

        //Converting the height into feet.
        double heightInFeet = heightInInches / 12;

        System.out.println("Your Height in cm is " + height + " while in feet is " + heightInFeet + " and inches is " + heightInInches);  
                                          }
                }