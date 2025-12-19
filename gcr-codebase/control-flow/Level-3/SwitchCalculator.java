import java.util.Scanner;

public class SwitchCalculator{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        double first = input.nextDouble();

        System.out.print("Enter Operator : ");
        String op = input.next();

        System.out.print("Enter Second Number : ");
        double second = input.nextDouble();

            switch (op) {
                case "+":
                    System.out.println("result : "+(first+second));
                    break;
                case "-":
                    System.out.println("result : "+(first-second));
                    break;
                case "*":
                    System.out.println("result : "+(first*second));
                    break;
                case "/":
                    System.out.println("result : "+(first/second));
                    break;
                default:
                    System.out.println("Invalid Operator");
                        }
              
                                        }
                         }