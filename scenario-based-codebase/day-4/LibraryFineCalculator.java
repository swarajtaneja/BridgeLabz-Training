import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int finePerDay = 5;

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nBook " + i);

            System.out.print("Enter due day: ");
            int dueDay = sc.nextInt();

            System.out.print("Enter return day: ");
            int returnDay = sc.nextInt();

            if (returnDay > dueDay) {
                int lateDays = returnDay - dueDay;
                int fine = lateDays * finePerDay;
                System.out.println("Late by " + lateDays + " days");
                System.out.println("Fine: " + finezzz+"rs");
            } else {
                System.out.println("Returned on time. No fine 😊");
            }
        }

    }
}
