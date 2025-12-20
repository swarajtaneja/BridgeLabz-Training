import java.util.Scanner;
public class ParkRounds{
         public static int rounds(int side1,int side2,int side3,int distance){
                  int perimeter=side1+side2+side3;
                  int result = distance/perimeter;
                  return result;

                                                           }
         public static void main(String[] args){
                Scanner input = new Scanner(System.in);
                int distanceInMeter=5000;

                System.out.print("Enter Side in m : ");
                int side1 = input.nextInt();
              
                System.out.print("Enter Side in m : ");
                int side2 = input.nextInt();
              
                System.out.print("Enter Side in m : ");
                int side3 = input.nextInt();
              
                ParkRounds obj = new ParkRounds();
                System.out.println("Possible Rounds : " + obj.rounds(side1,side2,side3,distanceInMeter));

                                               }
                           }