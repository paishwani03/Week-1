// Create FactorialWhile class to find the factorial of an integer using a while loop
import java.util.Scanner;

class FactorialWhile {
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
            // Compute factorial using while loop
            int factorial = 1;
            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Display the factorial
            System.out.println("The factorial of " + number + " is " + factorial);
        }

        // Close the Scanner stream
        input.close();
    }
}
