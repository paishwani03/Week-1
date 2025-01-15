// Create CountDigits class to count number of digits in a number
import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Get the number input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Initialize count variable to 0
        int count = 0;

        // Loop to count digits by removing last digit in each iteration
        while (number != 0) {
            number = number / 10; // Remove last digit from the number
            count++; // Increment the digit count
        }

        // Display the count of digits
        System.out.println("The number has " + count + " digits.");

        // Close the Scanner stream
        input.close();
    }
}
