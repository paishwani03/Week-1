// Create FactorialFor class to find the factorial of an integer using a for loop
import java.util.Scanner;

class FactorialFor {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get integer input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Compute factorial using for loop
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Display the factorial
            System.out.println("The factorial of " + number + " is " + factorial);
        }

        // Close the Scanner stream
        input.close();
    }
}
