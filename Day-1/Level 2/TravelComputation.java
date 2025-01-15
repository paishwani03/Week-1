// Program to compute total distance and time with user input
import java.util.Scanner;

public class TravelComputation {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user inputs for traveler name and cities
        System.out.print("Enter the traveler's name: ");
        String name = input.nextLine();
        System.out.print("Enter the starting city: ");
        String fromCity = input.nextLine();
        System.out.print("Enter the via city: ");
        String viaCity = input.nextLine();
        System.out.print("Enter the destination city: ");
        String toCity = input.nextLine();

        // Take user input for distances and time taken
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double distanceFromToVia = input.nextDouble();
        System.out.print("Enter the time taken (in minutes): ");
        int timeFromToVia = input.nextInt();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double distanceViaToFinalCity = input.nextDouble();
        System.out.print("Enter the time taken (in minutes): ");
        int timeViaToFinalCity = input.nextInt();

        // Calculate total distance and time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Print the result
        System.out.println("The total distance traveled by " + name + " from " + fromCity +
                           " to " + toCity + " via " + viaCity + " is " + totalDistance +
                           " miles and the total time taken is " + totalTime + " minutes.");

        // Close the Scanner object
        input.close();
    }
}
