// Create PowerOfNumber class to calculate the power of a number
import java.util.Scanner;

class PowerOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the base number
        System.out.print("Enter the base number: ");
        int base = input.nextInt();

        // Prompt the user to enter the power
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Calculate the result using a loop
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        // Display the result
        System.out.println(base + " raised to the power " + power + " is: " + result);

        // Close the Scanner object to release resources
        input.close();
    }
}
