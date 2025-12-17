import java.util.Scanner;
public class MaxHandshakes{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number Of Students : ");
        int numberOfStudents = input.nextInt();

        int maxPossibleHandshakes = (numberOfStudents *(numberOfStudents - 1)) / 2;
         
        System.out.println("Possible Handshakes : " + maxPossibleHandshakes);  
                                          }
                }