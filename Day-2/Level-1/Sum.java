// Create NaturalNumberSum class to find the sum of n natural numbers
import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the number input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is positive
        if (number > 0) {
            // Calculate sum of n natural numbers
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println(number + " is not a natural number.");
        }

        // Close the Scanner stream
        input.close();
    }
}
