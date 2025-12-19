import java.util.Scanner;

public class ThreeFriendsCompare{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amar Age : ");
        int amarAge = input.nextInt();

        System.out.print("Enter Akbar Age : ");
        int akbarAge = input.nextInt();

        System.out.print("Enter Anthony Age : ");
        int anthonyAge = input.nextInt();

        if (amarAge<akbarAge && amarAge<anthonyAge){
             System.out.println("Amar Is the Youngest");
                                           }
        else if (akbarAge<amarAge && akbarAge<anthonyAge){
             System.out.println("Akbar Is the Youngest");
                                              }
        else{
             System.out.println("Anthony Is the Youngest");
                                                   }
        
        System.out.print("Enter Amar Height In cm : ");
        int amarHeight = input.nextInt();

        System.out.print("Enter Akbar Height In cm : ");
        int akbarHeight = input.nextInt();

        System.out.print("Enter Anthony Height in cm: ");
        int anthonyHeight = input.nextInt();
        
        if (amarHeight>akbarHeight && amarHeight>akbarHeight){
             System.out.println("Amar Is the Tallest");
                                           }
        else if (akbarHeight > amarHeight && akbarHeight > akbarHeight){
             System.out.println("Akbar Is the Tallest");
                                              }
        else{
             System.out.println("Anthony Is the Tallest");
                        }
                                               }
                              }