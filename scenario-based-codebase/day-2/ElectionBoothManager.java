import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vote;
        while (true) {
            System.out.print("Enter age (or -1 to exit): ");
            int age = sc.nextInt();

            if (age == -1) {
                System.out.println("Polling closed.");
                break;
            }

            if (age >= 18) {
                System.out.print("Vote for candidate (1 / 2 / 3): ");
                vote = sc.nextInt();

                if (vote == 1 || vote == 2 || vote == 3) {
                    System.out.println("Vote recorded successfully.");
                } else {
                    System.out.println("Invalid vote.");
                }
            } else {
                System.out.println("Not eligible to vote.");
            }
        }
        sc.close();
    }
}
