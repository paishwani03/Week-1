// Create SumUntilZeroOrNegative class to find the sum until user enters 0 or a negative number
import java.util.Scanner;

class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Initialize total to 0
        double total = 0.0;
        double userInput;

        // Run an infinite while loop and use break statement when user enters 0 or negative number
        while (true) {
            System.out.print("Enter a number (enter 0 or a negative number to stop): ");
            userInput = input.nextDouble();
            if (userInput <= 0) {
                break; // Exit loop if user enters 0 or negative number
            }
            total += userInput; // Add the entered number to total
        }

        // Display the sum
        System.out.println("The total sum is: " + total);

        // Close the Scanner stream
        input.close();
    }
}
