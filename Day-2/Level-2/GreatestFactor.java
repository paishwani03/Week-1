// Create GreatestFactor class to find the greatest factor of a number
import java.util.Scanner;

class GreatestFactor {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define variable to store the greatest factor
        int greatestFactor = 1;

        // Loop from the number - 1 down to 1 to find the greatest factor
        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " is: " + greatestFactor);

        // Close the Scanner object to release resources
        input.close();
    }
}
