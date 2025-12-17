import java.util.Scanner;

public class InputKmToMiles{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double km = input.nextInt();

        double newMiles = (km * 1.6);
        
        System.out.println("The total miles is " + newMiles + " mile for the given " + km + " km"); 
                                          }
                }