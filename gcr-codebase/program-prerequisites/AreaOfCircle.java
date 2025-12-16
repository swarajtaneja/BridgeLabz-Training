import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String args[]){
        System.out.print("Enter Radius: ");

        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        System.out.print(3.14*radius*radius);
    }
}
