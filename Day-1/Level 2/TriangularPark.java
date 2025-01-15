// Program to calculate number of rounds in a triangular park
import java.util.Scanner;

public class TriangularPark {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user inputs for the sides of the triangular park
        System.out.print("Enter the length of the first side (in meters): ");
        double side1 = input.nextDouble();
        System.out.print("Enter the length of the second side (in meters): ");
        double side2 = input.nextDouble();
        System.out.print("Enter the length of the third side (in meters): ");
        double side3 = input.nextDouble();

        // Calculate the perimeter of the park
        double perimeter = side1 + side2 + side3;

        // Calculate the number of rounds to complete 5 km
        int rounds = (int) (5000 / perimeter);

        // Print the result
        System.out.println("The total number of rounds the athlete will run is " + rounds +
                           " to complete 5 km.");

        // Close the Scanner object
        input.close();
    }
}
