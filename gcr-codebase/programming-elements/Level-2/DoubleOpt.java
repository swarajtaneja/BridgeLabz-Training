import java.util.Scanner;
public class DoubleOpt{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a,b,c;

        System.out.print("Enter a : ");
        a = input.nextDouble();

        System.out.print("Enter b : ");
        b = input.nextDouble();

        System.out.print("Enter c : ");
        c = input.nextDouble();
       
        double operationFirst = a + b *c;
        double operationSecond = a * b + c;
        double operationThird = c + a / b;
        double operationFourth = a % b + c;
         
        System.out.println("The results of Int Operations are " + operationFirst + ", " + operationSecond + ", " + operationThird + " and " + operationFourth);  
                                          }
                }