// Create HarshadNumber class to check if a number is a Harshad Number
import java.util.Scanner;

class HarshadNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the number input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize sum to 0
        int sum = 0;
        int temp = number;

        // Loop to calculate sum of digits
        while (temp != 0) {
            sum += temp % 10; // Add last digit to sum
            temp = temp / 10; // Remove last digit
        }

        // Check if the number is divisible by the sum of its digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

        // Close the Scanner stream
        input.close();
    }
}
