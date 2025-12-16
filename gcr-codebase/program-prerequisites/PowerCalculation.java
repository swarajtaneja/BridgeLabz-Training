import java.util.Scanner;

public class PowerCalculation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base Value: ");
        int base = sc.nextInt();

        System.out.print("Enter Exponent Value: ");
        int exponent = sc.nextInt();

        int finalResult = (int) Math.pow(base, exponent);
        System.out.println(finalResult);
    }
}
