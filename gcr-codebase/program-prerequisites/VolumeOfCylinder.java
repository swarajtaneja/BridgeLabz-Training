import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        int radius = sc.nextInt();
        double radiusSquare = radius*radius;

        System.out.print("Enter Height: ");
        int height = sc.nextInt();

        double volume = 3.14 * radiusSquare * height;
        System.out.println(volume);
    }
}
