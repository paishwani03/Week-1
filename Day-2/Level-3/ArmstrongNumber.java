// Create ArmstrongNumber class to check if the number is Armstrong
import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Store the original number and initialize sum to 0
        int originalNumber = number;
        int sum = 0;

        // Run the loop to find the sum of cubes of digits
        while (number != 0) {
            int digit = number % 10; // Find the last digit of number
            sum += Math.pow(digit, 3); // Add cube of the digit to sum
            number = number / 10; // Remove last digit from number
        }

        // Check if sum equals original number and display result
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        // Close the Scanner stream
        input.close();
    }
}
