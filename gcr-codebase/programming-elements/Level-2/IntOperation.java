import java.util.Scanner;
public class IntOperation{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b,c;

        System.out.print("Enter a : ");
        a = input.nextInt();

        System.out.print("Enter b : ");
        b = input.nextInt();

        System.out.print("Enter c : ");
        c = input.nextInt();
       
        int operationFirst = a + b *c;
        int operationSecond = a * b + c;
        int operationThird = c + a / b;
        int operationFourth = a % b + c;
         
        System.out.println("The results of Int Operations are " + operationFirst + ", " + operationSecond + ", " + operationThird + " and " + operationFourth);  
                                          }
                }