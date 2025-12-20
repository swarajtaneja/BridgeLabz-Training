import java.util.Scanner;
public class MaxHandshakes{
         public static int handshakes(int numberOfStudents){
                  int maxPossibleHandshakes = (numberOfStudents *(numberOfStudents - 1)) / 2;
                  return maxPossibleHandshakes;

                                                           }
         public static void main(String[] args){
                Scanner input = new Scanner(System.in);

                System.out.print("Enter Number Of Students : ");
                int numberOfStudents = input.nextInt();
              
                MaxHandshakes result = new MaxHandshakes();
                System.out.println("Possible Handshakes : " + result.handshakes(numberOfStudents));

                                               }
                           }