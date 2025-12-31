//Bus Route Distance Tracker 🚌
//Each stop adds distance.
//Ask if the passenger wants to get off at a stop.
//Use a while-loop with a total distance tracker.
//Exit on user confirmation.

import java.util.Scanner;
public class BusRouteDistanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalDistance = 0;
        int stopDistance = 2;
        char choice = 'n';

        while (choice != 'y' && choice != 'Y') {
            totalDistance += stopDistance;
            System.out.println("Bus reached next stop.");
            System.out.println("Distance covered so far: " + totalDistance + " km");

            System.out.print("Do you want to get off here? (y/n): ");
            choice = sc.next().charAt(0);
        }

        System.out.println("You got off the bus.");
        System.out.println("Total distance traveled: " + totalDistance + " km");

        sc.close();
    }
}
