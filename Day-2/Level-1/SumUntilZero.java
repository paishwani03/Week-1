// Create SumUntilZero class to find the sum of numbers until the user enters 0
import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Initialize total to 0
        double total = 0.0;
        double userInput;

        // Run a while loop to add numbers until the user enters 0
        do {
            System.out.print("Enter a number (enter 0 to stop): ");
            userInput = input.nextDouble();
            total += userInput; // Add the entered number to total
        } while (userInput != 0); // Continue the loop until the user enters 0

        // Display the sum
        System.out.println("The total sum is: " + total);

        // Close the Scanner stream
        input.close();
    }
}
